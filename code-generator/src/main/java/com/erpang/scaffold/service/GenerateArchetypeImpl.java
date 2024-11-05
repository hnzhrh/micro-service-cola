package com.erpang.scaffold.service;

import com.erpang.scaffold.api.DependenceConfig;
import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.api.GeneratorArchetypeI;
import com.erpang.scaffold.service.handler.GeneratorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author erpang
 * @date 2024/11/1
 */
@Service
public class GenerateArchetypeImpl implements GeneratorArchetypeI {
    @Value("${output-dir}")
    private String rootDir;

    @Autowired
    private GeneratorHandler generatorHandler;

    @Autowired
    private GeneratorConfigReader generatorConfigReader;

    @Override
    public void generate(GenerateParam param) {
        Node root = null;
        try {
            root = generatorConfigReader.readArchetypeConfig(param.getAppArchitecture());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        root.setPath(rootDir);
        // dfs
        dfs(root, param);
    }

    @Override
    public List<DependenceConfig> getConfig() {
        try {
            return generatorConfigReader.readDependenceConfig();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void dfs(Node root, GenerateParam param) {
        generatorHandler.handle(root, param);
        // Handle the current node.
        for (Node child : root.getChildren()) {
            // Handle path
            child.setPath(root.getPath());
            dfs(child, param);
        }
    }
}

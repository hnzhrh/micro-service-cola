package com.erpang.scaffold.service;

import com.alibaba.fastjson.JSON;
import com.erpang.scaffold.api.DependenceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author erpang
 * @date 2024/11/1
 */
@Component
public class GeneratorConfigReader {

    @Autowired
    private ResourceLoader resourceLoader;

    public Node readArchetypeConfig(String appArchitecture) throws IOException {
        Resource resource = resourceLoader.getResource("classpath:" + String.format("%s/%s-archetype-config.json", appArchitecture, appArchitecture));
        Path path = resource.getFile().toPath();
        String config = null;
        try {
            config = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return JSON.parseObject(config, Node.class);
    }

    public List<DependenceConfig> readDependenceConfig() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:dependency-config.json");
        Path path = resource.getFile().toPath();
        String config = null;
        try {
            config = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return JSON.parseArray(config, DependenceConfig.class);
    }
}

package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author erpang
 * @date 2024/11/2
 */
@Component
public class GeneratorHandler {
    public static final String prefix = "GENERATOR_STRATEGY";

    @Autowired
    private final Map<String, GeneratorStrategyI> generatorStrategyContext = new HashMap<>();

    public void handle(Node node, GenerateParam param) {
        if (generatorStrategyContext.containsKey(this.strategy(node))) {
            try {
                generatorStrategyContext.get(this.strategy(node)).generate(node, param);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private String strategy(Node node) {
        return String.format("%s#%s#%s", prefix, node.getType(), node.getType() == Node.Type.FILE ? node.getFileType() : node.getDirectoryType());
    }
}

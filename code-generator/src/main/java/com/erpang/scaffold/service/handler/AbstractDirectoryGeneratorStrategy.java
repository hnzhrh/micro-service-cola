package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author erpang
 * @date 2024/11/2
 */
public abstract class AbstractDirectoryGeneratorStrategy implements GeneratorStrategyI {

    @Override
    public void create(Node node, GenerateParam param) throws IOException {
        Path path = Paths.get(node.getPath(), node.getName());
        Files.createDirectories(path);
    }

    @Override
    public void prepare(Node node, GenerateParam param) {

    }

    @Override
    public void after(Node node, GenerateParam param) {
        node.setPath(node.getPath() + "/" + node.getName());
    }
}

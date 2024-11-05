package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * @author erpang
 * @date 2024/11/2
 */
public abstract class AbstractFileGeneratorStrategy implements GeneratorStrategyI {
    @Override
    public void create(Node node, GenerateParam param) throws IOException {
        Path path = Path.of(node.getPath(), node.getName());
        Files.writeString(path, node.getFileContent(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    @Override
    public void prepare(Node node, GenerateParam param) throws IOException {

    }

    @Override
    public void after(Node node, GenerateParam param) {
        node.setFileContent(null);
    }
}

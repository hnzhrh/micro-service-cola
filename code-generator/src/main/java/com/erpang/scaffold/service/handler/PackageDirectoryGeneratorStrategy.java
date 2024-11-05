package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author erpang
 * @date 2024/11/2
 */
@Component("GENERATOR_STRATEGY#DIRECTORY#PACKAGE")
public class PackageDirectoryGeneratorStrategy extends AbstractDirectoryGeneratorStrategy {
    @Override
    public void prepare(Node node, GenerateParam param) {
        String[] split = param.getPackageName().split("\\.");
        for (int i = 0; i < split.length - 1; i++) {
            node.setPath(node.getPath() + "/" + split[i]);
        }
        node.setName(split[split.length - 1]);
    }
}

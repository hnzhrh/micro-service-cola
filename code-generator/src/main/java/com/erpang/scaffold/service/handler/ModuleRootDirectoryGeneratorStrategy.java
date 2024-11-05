package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author erpang
 * @date 2024/11/2
 */
@Component("GENERATOR_STRATEGY#DIRECTORY#MODULE_ROOT")
public class ModuleRootDirectoryGeneratorStrategy extends AbstractDirectoryGeneratorStrategy {
    @Override
    public void prepare(Node node, GenerateParam param) {
        node.setName(node.getName().replace("${root.artifact.id}", param.getArtifactId()));
    }
}

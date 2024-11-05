package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * @author erpang
 * @date 2024/11/2
 */
@Component("GENERATOR_STRATEGY#DIRECTORY#PROJECT_ROOT")
public class ProjectRootDirectoryGeneratorStrategy extends AbstractDirectoryGeneratorStrategy {

    @Override
    public void prepare(Node node, GenerateParam param) {
        node.setName(node.getName().replace("${project-name}", param.getProjectName()));
    }
}

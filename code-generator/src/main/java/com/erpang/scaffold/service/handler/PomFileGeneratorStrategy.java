package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.api.MavenCoordinate;
import com.erpang.scaffold.service.Node;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * @author erpang
 * @date 2024/11/4
 */
@Component("GENERATOR_STRATEGY#FILE#POM_XML")
public class PomFileGeneratorStrategy extends AbstractFileGeneratorStrategy {
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Override
    public void prepare(Node node, GenerateParam param) throws IOException {
        Template template = freeMarkerConfigurer.getConfiguration().getTemplate(String.format("%s/%s", param.getAppArchitecture(), node.getTemplate()));
        Map<String, Object> variables = buildMap(param);
        String result = null;
        try {
            result = FreeMarkerTemplateUtils.processTemplateIntoString(template, variables);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
        node.setFileContent(result);
    }

    private Map<String, Object> buildMap(GenerateParam param) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("root_artifact_id", param.getArtifactId());
        variables.put("root_group_id", param.getGroupId());
        variables.put("root_version", param.getVersion());
        variables.put("package", param.getPackageName());
        variables.put("project_name", param.getProjectName());
        // Handle dependencies
        for (MavenCoordinate dependency : param.getDependencies()) {
            variables.put(dependency.getUnderlineGroupId(), Boolean.TRUE);
            variables.put(dependency.getUnderlineArtifactId(), Boolean.TRUE);
        }
        return variables;
    }
}

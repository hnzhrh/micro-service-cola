package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;


/**
 * @author erpang
 * @date 2024/11/4
 */
@Component("GENERATOR_STRATEGY#FILE#JAVA_SOURCE")
public class JavaSourceFileGeneratorStrategy extends AbstractFileGeneratorStrategy {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Override
    public void prepare(Node node, GenerateParam param) throws IOException {
        Template template = freeMarkerConfigurer.getConfiguration().getTemplate(String.format("%s/%s", param.getAppArchitecture(), node.getTemplate()));
        Map<String, String> variables = new HashMap<>();
        variables.put("package", param.getPackageName());
        variables.put("author", param.getAuthor());
        variables.put("date", formatter.format(LocalDate.now()));
        String result = null;
        try {
            result = FreeMarkerTemplateUtils.processTemplateIntoString(template, variables);
        } catch (TemplateException e) {
            throw new RuntimeException(e);
        }
        node.setFileContent(result);
    }
}

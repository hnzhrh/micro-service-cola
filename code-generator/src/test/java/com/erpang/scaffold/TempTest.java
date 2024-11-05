package com.erpang.scaffold;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.api.MavenCoordinate;
import com.erpang.scaffold.service.GenerateArchetypeImpl;
import com.erpang.scaffold.service.GeneratorConfigReader;
import com.erpang.scaffold.service.Node;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import jakarta.annotation.security.RunAs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author erpang
 * @date 2024/11/1
 */
@SpringBootTest
public class TempTest {
    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Autowired
    private GenerateArchetypeImpl generateArchetype;

    @Test
    void test() {
        String text = """
                
                
                {
                  "type": "DIRECTORY",
                  "name": "${root.artifact.id}",
                  "fileType": "${root.artifact.id}"
                }
                
                
                
                """;
        System.out.println(text.replace("${root.artifact.id}", "hahah"));
        System.out.println("test");

    }

    @Test
    void testReadConfig() throws IOException {
//        Node cola = GeneratorConfigReader.readArchetypeConfig("cola");
//        Assertions.assertNotNull(cola);
    }

    @Test
    void testGenerator() throws IOException, TemplateException {
        GenerateParam param = new GenerateParam();
        param.setAppArchitecture("cola");
        param.setProjectName("test-generator-project");
        param.setPackageName("com.erpang.generator.test");
        param.setGroupId("com.erpang.group");
        param.setArtifactId("test-artifact-id");
        param.setVersion("1.0.1");
        param.setAuthor("ronghzhang");
//        param.setDependencies(new ArrayList<>() {
//            {
//                MavenCoordinate e = new MavenCoordinate();
//                e.setGroupId("com.baomidou");
//                e.setArtifactId("mybatis-plus-spring-boot3-starter");
//                add(e);
//            }
//        });
        
        generateArchetype.generate(param);
    }
}

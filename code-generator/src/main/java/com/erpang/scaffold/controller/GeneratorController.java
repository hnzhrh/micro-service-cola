package com.erpang.scaffold.controller;

import com.erpang.scaffold.api.DependenceConfig;
import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.GenerateArchetypeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author erpang
 * @date 2024/11/1
 */
@RestController
public class GeneratorController {
    @Autowired
    private GenerateArchetypeImpl generateArchetype;

    @PostMapping("/generate")
    public void generate(@RequestBody GenerateParam param) {
        generateArchetype.generate(param);
    }

    @GetMapping("/dependencies")
    public List<DependenceConfig> getDependencies() {
        List<DependenceConfig> config = generateArchetype.getConfig();
        return config;
    }
}

package com.erpang.scaffold.controller;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.GenerateArchetypeImpl;
import com.erpang.scaffold.service.handler.GeneratorStrategyI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author erpang
 * @date 2024/11/1
 */
@RestController
public class GeneratorController {
    @Autowired
    private GenerateArchetypeImpl generateArchetype;

    @GetMapping("/hi")
    public String sayHi(@RequestBody GenerateParam param) {
        generateArchetype.generate(param);
        return "hi";
    }
}

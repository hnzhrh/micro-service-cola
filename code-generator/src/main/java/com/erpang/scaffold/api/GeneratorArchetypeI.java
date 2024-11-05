package com.erpang.scaffold.api;

import java.util.List;

/**
 * @author erpang
 * @date 2024/11/5
 */
public interface GeneratorArchetypeI {
    void generate(GenerateParam param);
    List<DependenceConfig> getConfig();
}

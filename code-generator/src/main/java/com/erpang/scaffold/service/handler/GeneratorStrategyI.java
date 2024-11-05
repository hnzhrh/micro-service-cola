package com.erpang.scaffold.service.handler;

import com.erpang.scaffold.api.GenerateParam;
import com.erpang.scaffold.service.Node;

import java.io.IOException;

/**
 * @author erpang
 * @date 2024/11/2
 */
public interface GeneratorStrategyI {
    default void generate(Node node, GenerateParam param) throws IOException {
        prepare(node, param);
        create(node, param);
        after(node, param);
    }
    void create(Node node, GenerateParam param) throws IOException;
    void prepare(Node node, GenerateParam param) throws IOException;
    void after(Node node, GenerateParam param);
}

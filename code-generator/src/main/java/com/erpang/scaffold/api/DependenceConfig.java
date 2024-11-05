package com.erpang.scaffold.api;

import lombok.Data;

import java.util.List;

/**
 * @author erpang
 * @date 2024/11/5
 */
@Data
public class DependenceConfig {
    private Category category;
    private List<MavenCoordinate> dependencies;
}

package com.erpang.scaffold.api;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author erpang
 * @date 2024/11/2
 */
@Data
public class GenerateParam {
    private String appArchitecture;
    private String projectName;
    private String packageName;
    private String groupId;
    private String artifactId;
    private String version;
    private String author;
    private List<MavenCoordinate> dependencies = Collections.emptyList();
}

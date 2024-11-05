package com.erpang.scaffold.service;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Collections;
import java.util.List;

/**
 * @author erpang
 * @date 2024/11/1
 */
@Data
public class Node {
    private String name;
    private Type type;
    @JSONField(name = "directory-type")
    private DirectoryType directoryType;
    @JSONField(name = "file-type")
    private FileType fileType;
    private String template;
    private List<Node> children = Collections.emptyList();
    private String path;
    private String fileContent;

    public enum Type {
        DIRECTORY, FILE
    }

    public enum FileType {
        NORMAL, POM_XML, JAVA_SOURCE, YAML
    }

    public enum DirectoryType {
        NORMAL, PACKAGE, PROJECT_ROOT, MODULE_ROOT
    }
}

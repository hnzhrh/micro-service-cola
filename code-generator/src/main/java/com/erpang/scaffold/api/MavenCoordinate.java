package com.erpang.scaffold.api;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * @author erpang
 * @date 2024/11/5
 */
@Data
public class MavenCoordinate {
    private String groupId;
    private String artifactId;
    private String version;
    private String configTemplate;
    private String summary;
    private String description;

    private String toUnderline(String source) {
        if (StringUtils.hasText(source)) {
            return source.replaceAll("[.-]", "_");
        }
        return source;
    }

    public String getUnderlineGroupId() {
        return toUnderline(groupId);
    }

    public String getUnderlineArtifactId() {
        return toUnderline(artifactId);
    }
}

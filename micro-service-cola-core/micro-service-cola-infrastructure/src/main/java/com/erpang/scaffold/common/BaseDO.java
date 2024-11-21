package com.erpang.scaffold.common;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author erpang
 * @date 2024/10/29
 */
@Data
public class BaseDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private LocalDateTime gmtCreate;

    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModified;

    @TableField("creator")
    private String creator;

    @TableField("modifier")
    private String modifier;

    @TableField("deleted")
    @TableLogic
    private Boolean deleted;
}

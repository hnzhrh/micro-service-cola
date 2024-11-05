package ${package}.common;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDate;

/**
 * @author ${author}
 * @date ${date}
 */
@Data
public class BaseDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "gmt_create", fill = FieldFill.INSERT)
    private LocalDate gmtCreate;

    @TableField(value = "gmt_modified", fill = FieldFill.INSERT_UPDATE)
    private LocalDate gmtModified;

    @TableField("creator")
    private String creator;

    @TableField("modifier")
    private String modifier;

    @TableField("is_deleted")
    @TableLogic
    private Boolean isDeleted;
}

package com.tangkc.business.job.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 班级
 */
@TableName(value = "t_class")
public class ClassDO {
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;

    /**
     * 班级名称
     */
    @TableField(value = "class_name")
    private String className;

    public static final String COL_ID_ = "id_";

    public static final String COL_CLASS_NAME = "class_name";

    /**
     * @return id_
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取班级名称
     *
     * @return class_name - 班级名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置班级名称
     *
     * @param className 班级名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "ClassDO{" +
                "id=" + id +
                ", className='" + className + '\'' +
                '}';
    }
}
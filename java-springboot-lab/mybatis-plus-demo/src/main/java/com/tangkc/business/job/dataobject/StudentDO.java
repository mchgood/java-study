package com.tangkc.business.job.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
    * 学生表
    */
@TableName(value = "t_student")
public class StudentDO {
    /**
     * 主键
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;

    /**
     * 学生姓名
     */
    @TableField(value = "student_name")
    private String studentName;

    /**
     * 班级ID
     */
    @TableField(value = "class_id")
    private Integer classId;

    public static final String COL_ID_ = "id_";

    public static final String COL_STUDENT_NAME = "student_name";

    public static final String COL_CLASS_ID = "class_id";

    /**
     * 获取主键
     *
     * @return id_ - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取学生姓名
     *
     * @return student_name - 学生姓名
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置学生姓名
     *
     * @param studentName 学生姓名
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 获取班级ID
     *
     * @return class_id - 班级ID
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 设置班级ID
     *
     * @param classId 班级ID
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "StudentDO{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", classId=" + classId +
                '}';
    }
}
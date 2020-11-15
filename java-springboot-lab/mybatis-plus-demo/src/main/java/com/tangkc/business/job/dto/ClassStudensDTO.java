package com.tangkc.business.job.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.tangkc.business.job.dataobject.StudentDO;

import java.util.List;

/**
 * @author tangkc
 * @description 学生班级
 * @date 2020/11/15 12:16
 */
public class ClassStudensDTO {

    /**
     * 班级ID
     */
    @TableId(value = "id_", type = IdType.AUTO)
    private Integer id;

    /**
     * 班级名称
     */
    @TableField(value = "class_name")
    private String className;

    private List<StudentDO> students;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<StudentDO> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDO> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassStudensDTO{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", students=" + students +
                '}';
    }
}

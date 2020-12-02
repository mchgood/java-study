package com.tangkc.business.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author tangkc
 * @description
 * @date 2020/12/2 18:42
 */
@Data
@Accessors(chain = true)
public class UserEntity {
    private String name;
    private Integer age;
    private Date birthday;
}

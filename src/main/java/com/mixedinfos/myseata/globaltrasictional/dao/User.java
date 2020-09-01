package com.mixedinfos.myseata.globaltrasictional.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class User {
    @TableId
    private Long id;

    private String userName;

    private String sex;

    private String hobby;
}

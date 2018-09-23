package com.king.model;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by TW on 2017/10/10.
 */
@Data
public class User implements Serializable {

    private Integer userId;
    private String uname;
    private String pwd;
    private String nation;
    private String  location;
    private Integer gender;



}

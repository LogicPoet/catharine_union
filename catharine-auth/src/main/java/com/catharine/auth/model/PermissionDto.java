package com.catharine.auth.model;

import lombok.Data;

/**
 * @author LZ
 * @date 2020/4/2 12:18
 **/
@Data
public class PermissionDto {

    private String id;
    private String code;
    private String description;
    private String url;
}

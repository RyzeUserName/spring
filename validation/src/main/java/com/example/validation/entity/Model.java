package com.example.validation.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 描述
 * @author Ryze
 * @date 2019-04-08 9:15
 */
@Data
public class Model {
    @NotNull
    private Integer id;
    @NotBlank(groups = Add.class)
    private String name;
}

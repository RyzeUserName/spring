package com.example.validation.entity;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 描述
 * @author Ryze
 * @date 2019-04-08 9:14
 */
@Data
public class Car {
    @NotNull
    private Integer id;
    @NotBlank(groups = Add.class)
    private String name;
    @Valid
    private Model model;
    private String description;

}

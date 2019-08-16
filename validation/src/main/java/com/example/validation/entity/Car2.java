package com.example.validation.entity;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 描述
 * @author Ryze
 * @date 2019-04-08 9:14
 */
@Data
public class Car2 {
    @NotNull
    private Integer id;
    @NotBlank
    private String name;
    private String description;

}

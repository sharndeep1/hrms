package com.training.javarest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
@Data
@AllArgsConstructor

public class Employer {
    private Long id;
    private String name;
    private String dept;
    private Long code;



}

package com.student.Mapping.Dto;

import com.student.Mapping.Model.Address;

import lombok.Data;

@Data
public class StudentDto {
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;
    private Address address;
}

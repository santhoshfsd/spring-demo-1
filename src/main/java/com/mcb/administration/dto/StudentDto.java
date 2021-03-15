package com.mcb.administration.dto;


import com.mcb.administration.entity.Passport;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StudentDto {

    private String firstName;
    private String lastName;
    private long phoneNumber;
    private PassportDto passport;
}


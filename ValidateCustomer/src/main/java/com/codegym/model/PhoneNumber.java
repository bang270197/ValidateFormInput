package com.codegym.model;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class PhoneNumber  {
   @Pattern(regexp = "^0[0-9]{9,10}$",message = "Bat dau tu 0,kieu so,do dai tu 10 den 11")

    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}
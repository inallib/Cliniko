package com.model.patient;

import org.hibernate.validator.constraints.Email;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Component
public class Patient {

    private Integer id;

    @NotNull
    private String name;

    @Email
    @NotNull
    private String email;

    @NotNull
    @Digits(integer = 4, fraction = 0)
    private String isdCode;

    @NotNull
    @Size(min = 3, max = 15)
    private String phone;

    @NotNull
    @Pattern(regexp="^\\d{1,2}\\/\\d{1,2}\\/\\d{4}$")
    private String dob;

    @NotNull
    @Digits(integer = 3, fraction = 0)
    private String age;

    @NotNull
    private String specialId;

    public String getSpecialId() {
        return specialId;
    }
    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getIsdCode() {
        return isdCode;
    }
    public void setIsdCode(String isdCode) {
        this.isdCode = isdCode;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}

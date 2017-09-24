package com.model.patient;

import org.springframework.stereotype.Component;

@Component
public class Patient {

    private Integer id;
    private String name;
    private String email;
    private String isdCode;
    private String phone;
    private String dob;
    private String age;
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

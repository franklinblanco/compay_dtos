package com.blancoinfante.compay_dtos.objs;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.sql.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private int id;
    private String phone_number;
    private String full_name;
    private String gov_id;
    private Date date_of_birth;
    private String address;
    private String password;
    private String user_key;
    public String email;
    public Date date_created;

    public User(int id, String phone_number, String full_name, String gov_id, Date date_of_birth, String address, String password, String user_key) {
        this.id = id;
        this.phone_number = phone_number;
        this.full_name = full_name;
        this.gov_id = gov_id;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.password = password;
        this.user_key = user_key;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getGov_id() {
        return gov_id;
    }

    public void setGov_id(String gov_id) {
        this.gov_id = gov_id;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_key() {
        return user_key;
    }

    public void setUser_key(String user_key) {
        this.user_key = user_key;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }
}

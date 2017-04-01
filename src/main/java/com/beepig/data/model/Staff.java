package com.beepig.data.model;

import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by beepi on 29/03/2017.
 */

@Entity
@Table(name = "staff")
public class Staff implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_staff")
    private Integer mId;
    @Column(name = "name", nullable = false)
    private String mName;
    @Column(name = "username", nullable = false)
    private String mUsername;
    @Column(name = "level", nullable = false)
    private Integer mLevel;
    @Column(name = "password", nullable = false)
    private String mPassword;
    @Column(name = "identification", nullable = false)
    private String mIdentification;
    @Column(name = "address", nullable = false)
    private String mAddress;
    @Column(name = "token", nullable = false)
    private String mToken;
    @Column(name = "phone", nullable = false)
    private String mPhone;
    @Column(name = "email")
    private String mEmail;

    public Integer getId() {
        return mId;
    }

    @JsonSetter("id")
    public void setId(Integer id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    @JsonSetter("name")
    public void setName(String name) {
        mName = name;
    }

    public String getUsername() {
        return mUsername;
    }

    @JsonSetter("username")
    public void setUsername(String username) {
        mUsername = username;
    }

    public Integer getLevel() {
        return mLevel;
    }

    @JsonSetter("level")
    public void setLevel(Integer level) {
        mLevel = level;
    }

    public String getPassword() {
        return mPassword;
    }

    @JsonSetter("password")
    public void setPassword(String password) {
        mPassword = password;
    }

    public String getIdentification() {
        return mIdentification;
    }

    @JsonSetter("identification")
    public void setIdentification(String identification) {
        mIdentification = identification;
    }

    public String getAddress() {
        return mAddress;
    }

    @JsonSetter("address")
    public void setAddress(String address) {
        mAddress = address;
    }

    public String getToken() {
        return mToken;
    }

    @JsonSetter("token")
    public void setToken(String token) {
        mToken = token;
    }

    public String getPhone() {
        return mPhone;
    }

    @JsonSetter("phone")
    public void setPhone(String phone) {
        mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    @JsonSetter("email")
    public void setEmail(String email) {
        mEmail = email;
    }
}

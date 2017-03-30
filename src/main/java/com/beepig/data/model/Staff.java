package com.beepig.data.model;

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
    private Integer mPhone;
    @Column(name = "email")
    private String mEmail;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public Integer getLevel() {
        return mLevel;
    }

    public void setLevel(Integer level) {
        mLevel = level;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getIdentification() {
        return mIdentification;
    }

    public void setIdentification(String identification) {
        mIdentification = identification;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public String getToken() {
        return mToken;
    }

    public void setToken(String token) {
        mToken = token;
    }

    public Integer getPhone() {
        return mPhone;
    }

    public void setPhone(Integer phone) {
        mPhone = phone;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }
}

package com.beepig.data.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by beepi on 31/03/2017.
 */
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_customer")
    private Integer mId;
    @Column(name = "name", nullable = false)
    private String mName;
    @Column(name = "identification", nullable = false)
    private String mIdentification;
    @Column(name = "address", nullable = false)
    private String mAddress;
    @Column(name = "phone")
    private Integer mPhone;
    @Column(name = "birth_day")
    private Long mBirthDay;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "mCustomer")
    private List<Account> mAccounts = new ArrayList<>();

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

    public Integer getPhone() {
        return mPhone;
    }

    public void setPhone(Integer phone) {
        mPhone = phone;
    }

    public Long getBirthDay() {
        return mBirthDay;
    }

    public void setBirthDay(Long birthDay) {
        mBirthDay = birthDay;
    }
}

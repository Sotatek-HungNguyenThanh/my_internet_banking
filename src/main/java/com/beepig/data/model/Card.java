package com.beepig.data.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by beepi on 30/03/2017.
 */
@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_card")
    private Integer mId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_account")
    private Account mAccount;
    @Column(name = "password", nullable = false)
    private String mPassword;
    @Column(name = "token")
    private String mToken;
    @Column(name = "atm_number")
    private Integer mAtmNumber;
    @Column(name = "type")
    private Integer mType;
    @Column(name = "created_day")
    private Long mCreatedDay;
    @Column(name = "expiration_day")
    private Long mExpirationDay;
    @Column(name = "status")
    private Integer mStatus;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "mCardSender")
    private List<Transaction> mTransactionSends;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "mCardReceiver")
    private List<Transaction> mTransactionReceivs;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
    }

    public Account getAccount() {
        return mAccount;
    }

    public void setAccount(Account account) {
        mAccount = account;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getToken() {
        return mToken;
    }

    public void setToken(String token) {
        mToken = token;
    }

    public Integer getAtmNumber() {
        return mAtmNumber;
    }

    public void setAtmNumber(Integer atmNumber) {
        mAtmNumber = atmNumber;
    }

    public Integer getType() {
        return mType;
    }

    public void setType(Integer type) {
        mType = type;
    }

    public Long getCreatedDay() {
        return mCreatedDay;
    }

    public void setCreatedDay(Long createdDay) {
        mCreatedDay = createdDay;
    }

    public Long getExpirationDay() {
        return mExpirationDay;
    }

    public void setExpirationDay(Long expirationDay) {
        mExpirationDay = expirationDay;
    }

    public Integer getStatus() {
        return mStatus;
    }

    public void setStatus(Integer status) {
        mStatus = status;
    }
}

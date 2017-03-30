package com.beepig.data.model;

import javax.persistence.*;

/**
 * Created by beepi on 30/03/2017.
 */
@Entity
@Table(name = "saving_book")
public class SavingBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer mId;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_account")
    private Account mAccount;
    private Float mBalance;
    private Long mTimeSaving;
    private Float mInterestRate;

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

    public Float getBalance() {
        return mBalance;
    }

    public void setBalance(Float balance) {
        mBalance = balance;
    }

    public Long getTimeSaving() {
        return mTimeSaving;
    }

    public void setTimeSaving(Long timeSaving) {
        mTimeSaving = timeSaving;
    }

    public Float getInterestRate() {
        return mInterestRate;
    }

    public void setInterestRate(Float interestRate) {
        mInterestRate = interestRate;
    }
}

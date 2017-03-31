package com.beepig.data.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by beepi on 30/03/2017.
 */
@Entity
@Table(name = "account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Integer mId;
    @Column(name = "account_number", nullable = false)
    private Integer mAccountNumber;
    @Column(name = "create_day", nullable = false)
    private Long mCreateDay;
    @Column(name = "expiration_day")
    private Long mExpirationDay;
    @Column(name = "type", nullable = false)
    private Integer mType;
    @Column(name = "balance", nullable = false)
    private Float mBalance;
    @Column(name = "status", nullable = false)
    private Integer mStatus;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_customer", nullable = false)
    private Customer mCustomer;
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "mAccount")
    private SavingBook mSavingBook;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "mAccount")
    private List<Card> mCards;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
    }

    public Integer getAccountNumber() {
        return mAccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        mAccountNumber = accountNumber;
    }

    public Long getCreateDay() {
        return mCreateDay;
    }

    public void setCreateDay(Long createDay) {
        mCreateDay = createDay;
    }

    public Long getExpirationDay() {
        return mExpirationDay;
    }

    public void setExpirationDay(Long expirationDay) {
        mExpirationDay = expirationDay;
    }

    public Integer getType() {
        return mType;
    }

    public void setType(Integer type) {
        mType = type;
    }

    public Float getBalance() {
        return mBalance;
    }

    public void setBalance(Float balance) {
        mBalance = balance;
    }

    public Integer getStatus() {
        return mStatus;
    }

    public void setStatus(Integer status) {
        mStatus = status;
    }

    public Customer getCustomer() {
        return mCustomer;
    }

    public void setCustomer(Customer customer) {
        mCustomer = customer;
    }

    public SavingBook getSavingBook() {
        return mSavingBook;
    }

    public void setSavingBook(SavingBook savingBook) {
        mSavingBook = savingBook;
    }

    public List<Card> getCards() {
        return mCards;
    }

    public void setCards(List<Card> cards) {
        mCards = cards;
    }
}

package com.beepig.data.model;

import javax.persistence.*;

/**
 * Created by beepi on 31/03/2017.
 */
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaction")
    private Integer mId;
    @Column(name = "type")
    private Integer mType;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_card_sender", nullable = false)
    private Card mCardSender;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_card_receiver", nullable = false)
    private Card mCardReceiver;
    @Column(name = "date")
    private Long mDate;
    @Column(name = "total")
    private Float mTotal;
    @Column(name = "content")
    private String mContent;
    @Column(name = "note")
    private String mNote;

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
    }

    public Integer getType() {
        return mType;
    }

    public void setType(Integer type) {
        mType = type;
    }

    public Card getCardSender() {
        return mCardSender;
    }

    public void setCardSender(Card cardSender) {
        mCardSender = cardSender;
    }

    public Card getCardReceiver() {
        return mCardReceiver;
    }

    public void setCardReceiver(Card cardReceiver) {
        mCardReceiver = cardReceiver;
    }

    public Long getDate() {
        return mDate;
    }

    public void setDate(Long date) {
        mDate = date;
    }

    public Float getTotal() {
        return mTotal;
    }

    public void setTotal(Float total) {
        mTotal = total;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public String getNote() {
        return mNote;
    }

    public void setNote(String note) {
        mNote = note;
    }
}

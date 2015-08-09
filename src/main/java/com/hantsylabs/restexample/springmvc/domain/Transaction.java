package com.hantsylabs.restexample.springmvc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hantsylabs.restexample.springmvc.model.SimpleUserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Currency;

/**
 * Created by Michael on 8/9/2015.
 */

@Entity
@Table(name = "transactions")
@JsonIgnoreProperties("transactionIncurredBy")
public class Transaction implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name="transaction_date_time")
    private LocalDateTime transactionDateTime;

    @Column(name="transaction_amount")
    private Currency transactionAmount;

    @Column(name="transaction_description")
    private String transactionDescription;

    @ManyToOne
    @JoinColumn(name="transaction_incurred_by")
    private User transactionIncurredBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public Currency getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Currency transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDescription() {
        return transactionDescription;
    }

    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }

    public User getTransactionIncurredBy() {
        return transactionIncurredBy;
    }

    public void setTransactionIncurredBy(User transactionIncurredBy) {
        this.transactionIncurredBy = transactionIncurredBy;
    }
}

package com.hantsylabs.restexample.springmvc.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Currency;

/**
 * Created by Michael on 8/9/2015.
 */
public class TransactionDetails implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDateTime transactionDateTime;
    private Currency transactionAmount;
    private String transactionDescription;
    private SimpleUserDetails transactionIncurredBy;

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

    public SimpleUserDetails getTransactionIncurredBy() {
        return transactionIncurredBy;
    }

    public void setTransactionIncurredBy(SimpleUserDetails transactionIncurredBy) {
        this.transactionIncurredBy = transactionIncurredBy;
    }

    @Override
    public String toString() {
        return "TransactionDetails{" + "id=" + id + ", transactionDateTime=" + transactionDateTime + ", transactionAmount=" + transactionAmount + ", transactionIncurredBy=" + transactionIncurredBy + ", transactionDescription=" + transactionDescription + '}';
    }
}

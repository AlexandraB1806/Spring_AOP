package com.luxoft.bankapp.service.audit.events;

import com.luxoft.bankapp.model.Account;

public class DepositEvent extends AccountEvent {
    double amount;

    public DepositEvent(long accountId, double amount) {
        super("DEPOSIT", accountId);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

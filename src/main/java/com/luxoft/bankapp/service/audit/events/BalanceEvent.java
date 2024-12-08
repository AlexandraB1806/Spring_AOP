package com.luxoft.bankapp.service.audit.events;

import com.luxoft.bankapp.model.Account;

public class BalanceEvent extends AccountEvent {
    public BalanceEvent(long accountId) {
        super("BALANCE CHECK", accountId);
    }
}

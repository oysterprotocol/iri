package com.iota.iri.service.dto;

import java.util.List;

public class GetBulkTransactionsToApproveResponse extends AbstractResponse {

    private String[] transactions;

    public static AbstractResponse create(List<String> elements) {
        GetBulkTransactionsToApproveResponse res = new GetBulkTransactionsToApproveResponse();
        res.transactions = elements.toArray(new String[] {});
        return res;
    }

    public String[] getTransactions() {
        return transactions;
    }
}

package com.iota.iri.service.dto;

import com.iota.iri.model.Hash;

public class GetBulkTransactionsToApproveResponse extends AbstractResponse {

    private String[] transactions;

    public static AbstractResponse create(Hash[] hashes) {
        GetBulkTransactionsToApproveResponse res = new GetBulkTransactionsToApproveResponse();
        int index = 0;
        String[] tempTXs = new String[hashes.length];
        for (Hash hash : hashes) {
            tempTXs[index++] = hash.toString();
        }
        res.transactions = tempTXs;
        return res;
    }

    public String[] getTransactions() {
        return transactions;
    }
}

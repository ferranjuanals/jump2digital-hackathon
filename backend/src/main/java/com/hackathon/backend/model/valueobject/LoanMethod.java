package com.hackathon.backend.model.valueobject;

import java.util.Arrays;

public enum LoanMethod {
    INSTANTANEOUS,
    STANDARD;


    public static LoanMethod getMethod(String method) throws Exception {
        return Arrays.stream(LoanMethod.values())
                .filter(t -> t.toString().equals(method))
                .findFirst()
                .orElseThrow(() -> new Exception("Loan method does not exist: " + method));
    }
}

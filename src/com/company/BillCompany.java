package com.company;

public class BillCompany {
    private long regon;
    private long nip;

    public BillCompany(long regon, long nip) {
        this.regon = regon;
        this.nip = nip;
    }

    public long getRegon() {
        return regon;
    }

    public long getNip() {
        return nip;
    }

}

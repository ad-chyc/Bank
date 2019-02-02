package com.company;

public abstract class Account extends Bank{
    private String name;
    private String surName;
    private long accountNumber;
    private long deposit;
    private long withdrawals;
    private Boolean accountOpen = true;

    public enum TypeAccount{
        PERSONAL,
        COMPANY
    }

    public Account(String name, String surName, long accountNumber, long deposit, long withdrawals) {
        this.name = name;
        this.surName = surName;
        this.accountNumber = accountNumber;
        this.deposit = deposit;
        this.withdrawals = withdrawals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getDeposit() {
        return deposit;
    }

    public void setDeposit(long deposit) {
        this.deposit = deposit;
    }

    public long getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(long withdrawals) {
        this.withdrawals = withdrawals;
    }

    public Boolean getAccountOpen() {
        return accountOpen;
    }

    public void setAccountOpen(Boolean accountOpen) {
        this.accountOpen = accountOpen;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", account=" + accountNumber +
                ", deposit=" + deposit +
                ", withdrawals=" + withdrawals +
                '}';
    }
}

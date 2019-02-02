package com.company;

public abstract class Account {
    private String name;
    private String surName;
    private long account;
    private long deposit;
    private long withdrawals;

    public enum typeAccount{
        PERSONAL,
        COMPANY
    }

    public Account(String name, String surName, long account, long deposit, long withdrawals) {
        this.name = name;
        this.surName = surName;
        this.account = account;
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

    public long getAccount() {
        return account;
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

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", account=" + account +
                ", deposit=" + deposit +
                ", withdrawals=" + withdrawals +
                '}';
    }
}

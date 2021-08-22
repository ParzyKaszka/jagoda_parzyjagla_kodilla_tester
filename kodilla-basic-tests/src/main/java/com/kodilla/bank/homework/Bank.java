package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int numberOfCashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[0];
        this.numberOfCashMachines = 0;
    }

    public void addCashMachine(CashMachine newCashMachine) {
        this.numberOfCashMachines++;
        CashMachine[] newCashMachines = new CashMachine[this.numberOfCashMachines];
        System.arraycopy(cashMachines, 0, newCashMachines, 0, cashMachines.length);
        newCashMachines[this.numberOfCashMachines - 1] = newCashMachine;
        this.cashMachines = newCashMachines;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }
}
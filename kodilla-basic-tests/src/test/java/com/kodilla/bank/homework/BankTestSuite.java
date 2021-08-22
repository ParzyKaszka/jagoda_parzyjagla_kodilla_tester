package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void addingAnCashMachineToTheListOfCashMachines() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(2000);
        cashMachine.addTransaction(-600);
        cashMachine.addTransaction(-200);

        Bank cashMachines = new Bank();
        cashMachines.addCashMachine(cashMachine);
        cashMachines.getCashMachines();
    }
}
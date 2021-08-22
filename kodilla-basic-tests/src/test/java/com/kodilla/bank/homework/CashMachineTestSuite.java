package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void checkAdditionAverageQuantityAndBalanceOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-350);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-10);
        cashMachine.addTransaction(-5);
        int[] listOfTransactions = cashMachine.getCashMachine();
        int numberOfTransactions = cashMachine.getNumberOfTransactions();
        int balance = cashMachine.getBalance();
        int inboundTransactions = cashMachine.getInboundTransactions();
        int outboundTransactions = cashMachine.getOutboundTransactions();
        double averageInboundTransactions = cashMachine.getAverageInboundTransactions();
        double averageOutboundTransactions = cashMachine.getAverageOutboundTransactions();

        assertArrayEquals(new int[]{500, 200, 100, -350, -20, -10, -5}, listOfTransactions);
        assertEquals(7, numberOfTransactions);
        assertEquals(415, balance);
        assertEquals(3, inboundTransactions);
        assertEquals(4, outboundTransactions);
        assertEquals(266.66, averageInboundTransactions, 0.01);
        assertEquals(-96.25, averageOutboundTransactions, 0.01);

        System.out.println(cashMachine.report());

    }
}
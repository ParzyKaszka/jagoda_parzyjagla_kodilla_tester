package com.kodilla.bank.homework;

public class CashMachine {
    private int[] cashmachine;
    private int transactions;
    private int numberOfTransactions;

    public CashMachine() {
        this.cashmachine = new int[0];
        this.transactions = 0;
        this.numberOfTransactions = 0;
    }

    public void addTransaction(int transaction) {
        this.transactions++;
        this.numberOfTransactions++;
        int[] newCashMachine = new int[this.transactions];
        System.arraycopy(cashmachine, 0, newCashMachine, 0, cashmachine.length);
        newCashMachine[this.transactions - 1] = transaction;
        this.cashmachine = newCashMachine;
    }

    public int[] getCashMachine() {
        return cashmachine;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < this.cashmachine.length; i++) {
            sum += this.cashmachine[i];
        }
        return sum;
    }

    public int getInboundTransactions() {
        int deposits = 0;
        for (int i = 0; i < cashmachine.length; i++) {
            if (cashmachine[i] > 0) {
                deposits++;
            }
        }
        return deposits;
    }

    public int getOutboundTransactions() {
        int withdrawals = 0;
        for (int i = 0; i < cashmachine.length; i++)
            if (cashmachine[i] < 0) {
                withdrawals++;
            }
        return withdrawals;
    }

    public int getSumOutboundTransactions() {
        int sum = 0;
        for (int i = 0; i < cashmachine.length; i++) {
            if (cashmachine[i] < 0) {
                sum += cashmachine[i];
            }
        }
        return sum;
    }

    public int getSumInboundTransactions() {
        int sum = 0;
        for (int i = 0; i < cashmachine.length; i++) {
            if (cashmachine[i] > 0) {
                sum += cashmachine[i];
            }
        }
        return sum;
    }

    public double getAverageOutboundTransactions() {
        double sum = 0;
        for (int i = 0; i < cashmachine.length; i++)
            if (cashmachine[i] < 0) {
                sum += 1;
            }
        return getSumOutboundTransactions() / sum;
    }

    public double getAverageInboundTransactions() {
        double sum = 0;
        for (double i = 0; i < cashmachine.length; i++)
            if (cashmachine[(int) i] > 0) {
                sum += 1;
            }
        return getSumInboundTransactions() / sum;
    }

    public String report() {
        System.out.println("Balance: " + getBalance());
        System.out.println("Number of transctions: " + getNumberOfTransactions());
        System.out.println("Number of inbound transactions: " + getInboundTransactions());
        System.out.println("Number of outbound transactions: " + getOutboundTransactions());
        System.out.println("Average of incoming transactions: " + getAverageInboundTransactions());
        System.out.println("Average of outgoing transactions: " + getAverageOutboundTransactions());
        return "End of report";
    }
}
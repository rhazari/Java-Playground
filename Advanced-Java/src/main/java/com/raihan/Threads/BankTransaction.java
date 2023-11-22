package com.raihan.Threads;

class BankAccount {
    private int balance = 0;
    private final int overDraftFree;

    public BankAccount(int overDraftFree){
        this.overDraftFree = overDraftFree;
    }

    void topUp(int amount){
        balance += amount;
    }

    void debit(int amount){
        balance -= amount;
    }

    int getBalance(){
        return balance;
    }

    int getOverDraft(){
        return overDraftFree;
    }
}

class ATM {
    static synchronized void withdraw(BankAccount account, int amount){
        int balance = account.getBalance();
        if((balance - amount) + account.getOverDraft() < 0){
            System.out.println("Transaction denied!");
        }
        else {
            account.debit(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
    }
}

public class BankTransaction {
    static final BankAccount account= new BankAccount(50);
    public static void main(String[] args){

        account.topUp(100);

        Thread th1 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        Thread th2 = new Thread(() -> {
            ATM.withdraw(account, 100);
        });

        th1.start();
        th2.start();
    }
}

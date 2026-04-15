package org.example;

public class DepositTask implements Runnable{
    private BankAccount bankAccount;
    private int amount;
    public DepositTask(BankAccount _bankAccount, int _amount){
        bankAccount = _bankAccount;
        amount = _amount;
    }

    @Override
    public void run() {
        bankAccount.deposit(amount);
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

package org.example;

public class WithdrawTask implements Runnable{
    BankAccount bankAccount;
    int amount;
    public WithdrawTask(BankAccount _bankAccount, int _amount){
        bankAccount = _bankAccount;
        amount = _amount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(amount);
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}

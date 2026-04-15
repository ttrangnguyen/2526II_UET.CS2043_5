package org.example;

public class BankAccount{
    private int balance;
    public BankAccount(int _balance){
        balance = _balance;
    }
    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to withdraw " + amount);
        if (balance >= amount) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " completed withdrawal of " + amount);
        }else {
            System.out.println("Not enough balance for " + Thread.currentThread().getName());
        }
        System.out.println("Balance after withdrawal: " + balance);
    }

    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " trying to deposit " + amount);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance += amount;
        System.out.println(Thread.currentThread().getName() + " completed deposit of " + amount);
        System.out.println("Balance after deposit: " + balance);
    }


}


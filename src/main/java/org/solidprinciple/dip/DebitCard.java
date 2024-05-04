package org.solidprinciple.dip;

public class DebitCard implements com.javatechie.solid.dip.BankCard {

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}

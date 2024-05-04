package org.solidprinciple.dip;

public class CreditCard implements com.javatechie.solid.dip.BankCard {

    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}

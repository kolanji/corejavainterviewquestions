package org.solidprinciple.dip;

public class ShoppingMall {

    private com.javatechie.solid.dip.BankCard bankCard;

    public ShoppingMall(com.javatechie.solid.dip.BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
       // DebitCard debitCard=new DebitCard();
       // CreditCard creditCard=new CreditCard();

        com.javatechie.solid.dip.BankCard bankCard=new CreditCard();
        ShoppingMall shoppingMall=new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}

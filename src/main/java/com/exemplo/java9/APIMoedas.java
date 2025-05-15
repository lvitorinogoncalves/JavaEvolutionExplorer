package com.exemplo.java9;

import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;

public class APIMoedas {
    public static void main(String[] args) {
        MonetaryAmount amount1 = Money.of(50, "USD");
        MonetaryAmount amount2 = Money.of(20, "USD");
        MonetaryAmount total = amount1.add(amount2);

        System.out.println("Total: " + total); // Total: USD 70.00
    }
}

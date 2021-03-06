package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private Account account;

    @Before
    public void setUp(){
        account = new Account();
        account.deposit(50);
    }

    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        assertThat(account.getBalance(), is(50));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.withdraw(20);
        assertThat(account.getBalance(), is(30));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.withdraw(70);
        assertThat(account.getBalance(), is(50));
    }
}

package com.example.tdd;

import com.example.tdd.domain.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AccountTest {

    @Test
    void testAccount() throws Exception {
        Account account = new Account(100000);
    }

    @Test
    void testGetBalance() {
        Account account = new Account(10000);
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDeposit() {
        Account account = new Account(10000);
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    void testWithdraw() {
        Account account = new Account(10000);
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }

}

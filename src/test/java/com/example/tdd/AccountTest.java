package com.example.tdd;

import com.example.tdd.domain.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AccountTest {

    private Account account;

    @BeforeEach
    void setUp() {
        account = new Account(10000);
    }

    @Test
    void testGetBalance() {
        assertEquals(10000, account.getBalance());

        account = new Account(1000);
        assertEquals(1000, account.getBalance());

        account = new Account(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testDeposit() {
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }

}

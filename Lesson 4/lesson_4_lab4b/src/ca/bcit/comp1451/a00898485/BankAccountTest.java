package ca.bcit.comp1451.a00898485;

/**
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest
{
    private BankAccount bankAccount;

    @Before
    public void setUp()
    {
        System.out.println("setting up");
        bankAccount = new BankAccount("XiN", "ZhAo", "rIcHmOnD, B.C.", 1000, "xxyyzz12345", true);
    }

    @After
    public void tearDown()
    {
        System.out.println("tearing down");
    }

    @Test
    public void testGetFirstName1()
    {
        assertEquals("Xin", bankAccount.getFirstName());
    }

    @Test
    public void testGetFirstName2()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        assertEquals("Jon", bankAccount2.getFirstName());
    }

    @Test
    public void testGetFirstName3()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        bankAccount2.setFirstName("eRiC");
        assertEquals("Eric", bankAccount2.getFirstName());
    }

    @Test
    public void testGetLastName1()
    {
        assertEquals("Zhao", bankAccount.getLastName());
    }

    @Test
    public void testGetLastName2()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        assertEquals("Bentley", bankAccount2.getLastName());
    }

    @Test
    public void testGetLastName3()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        bankAccount2.setLastName("mAtThEs");
        assertEquals("Matthes", bankAccount2.getLastName());
    }

    @Test
    public void testGetCustomerAddress1()
    {
        assertEquals("Richmond, b.c.", bankAccount.getCustomerAddress());
    }

    @Test
    public void testGetCustomerAddress2()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        assertEquals("Vancouver", bankAccount2.getCustomerAddress());
    }

    @Test
    public void testGetCustomerAddress3()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        bankAccount2.setCustomerAddress("burnaby");
        assertEquals("Burnaby", bankAccount2.getCustomerAddress());
    }

    @Test
    public void testGetBalance1()
    {
        assertEquals(1000, bankAccount.getBalance(), 0);
    }

    @Test
    public void testGetBalance2()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        assertEquals(99999, bankAccount2.getBalance(), 0);
    }

    @Test
    public void testGetAccountNumber1()
    {
        assertEquals("xxyyzz12345", bankAccount.getAccountNumber());
    }

    @Test
    public void testGetAccountNumber2()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        assertEquals("1234567890", bankAccount2.getAccountNumber());
    }

    @Test
    public void testGetAccountStatus1()
    {
        assertEquals(true, bankAccount.getAccountStatus());
    }

    @Test
    public void testGetAccountStatus2()
    {
        BankAccount bankAccount2 = new BankAccount("jOn", "bEnTlEy", "VANCOUVER", 99999, "1234567890", false);
        assertEquals(false, bankAccount2.getAccountStatus());
    }

    @Test
    public void testSetFirstName()
    {
        bankAccount.setFirstName("jOn");
        assertEquals("Jon", bankAccount.getFirstName());
    }

    @Test
    public void testSetLastName()
    {
        bankAccount.setLastName("bEnTlEy");
        assertEquals("Bentley", bankAccount.getLastName());
    }

    @Test
    public void testSetCustomerAddress()
    {
        bankAccount.setCustomerAddress("VANCOUVER");
        assertEquals("Vancouver", bankAccount.getCustomerAddress());
    }

    @Test
    public void testSetBalance()
    {
        bankAccount.setBalance(99999);
        assertEquals(99999, bankAccount.getBalance(), 0);
    }

    @Test
    public void testSetAccountNumber()
    {
        bankAccount.setAccountNumber("ABCDEFGH");
        assertEquals("ABCDEFGH", bankAccount.getAccountNumber());
    }

    @Test
    public void testSetAccountStatus()
    {
        bankAccount.setAccountStatus(false);
        assertEquals(false, bankAccount.getAccountStatus());
    }
}
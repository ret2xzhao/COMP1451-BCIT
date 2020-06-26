package ca.bcit.comp1451.a00898485;

/**
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class BankAccount
{
    private String firstName;
    private String lastName;
    private String customerAddress;
    private double balance;
    private String accountNumber;
    private boolean accountStatus;

    /**
     * Constructor for objects of class BankAccount.
     */
    public BankAccount(String firstName, String lastName, String customerAddress, 
                       double balance, String accountNumber, boolean accountStatus)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setCustomerAddress(customerAddress);
        setBalance(balance);
        setAccountNumber(accountNumber);
        setAccountStatus(accountStatus);
    }

    /**
     * @return The first name of a customer in String.
     */
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * @param firstName A String to set the first name of a customer.
     */
    public void setFirstName(String firstName)
    {
        if(firstName != null && !firstName.isEmpty())
        {
            this.firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid firstName.");
        }
    }

    /**
     * @return The last name of a customer in String.
     */
    public String getLastName()
    {
        return lastName;
    }

    /**
     * @param lastName A String to set the last name of a customer.
     */
    public void setLastName(String lastName)
    {
        if(lastName != null && !lastName.isEmpty())
        {
            this.lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid lastName.");
        }
    }

    /**
     * @return The address of a customer in String.
     */
    public String getCustomerAddress()
    {
        return customerAddress;
    }

    /**
     * @param customerAddress A String to set the address of a customer.
     */
    public void setCustomerAddress(String customerAddress)
    {
        if(customerAddress != null && !customerAddress.isEmpty())
        {
            this.customerAddress = customerAddress.toUpperCase().charAt(0) + customerAddress.substring(1).toLowerCase();
        }
        else
        {
            System.out.println("Error: Invalid customerAddress.");
        }
    }

    /**
     * @return The balance of an account number in double.
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * @param balance A double to set the balance of an account number.
     */
    public void setBalance(double balance)
    {
        if(balance >= 0)
        {
            this.balance = balance;
        }
        else
        {
            System.out.println("Error: Invalid balance.");
        }
    }

    /**
     * @return The account number in String.
     */
    public String getAccountNumber()
    {
        return accountNumber;
    }

    /**
     * @param accountNumber A String to set the account number.
     */
    public void setAccountNumber(String accountNumber)
    {
        if(accountNumber != null && !accountNumber.isEmpty())
        {
            this.accountNumber = accountNumber;
        }
        else
        {
            System.out.println("Error: Invalid accountNumber.");
        }
    }

    /**
     * @return The activation status of an account in boolean.
     */
    public boolean getAccountStatus()
    {
        return accountStatus;
    }

    /**
     * @param A boolean to set the activation status of an account.
     */
    public void setAccountStatus(boolean accountStatus)
    {
        this.accountStatus = accountStatus;
    }
}
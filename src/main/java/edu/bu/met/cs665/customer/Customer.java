/**
 * Name: Dingnan Hsu
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/28/2023
 * File Name: Customer.java
 * 
 * Description:
 * Abstract base class for all customer types. Associates customers with a specific email template.
 */
package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.email.EmailTemplate;

public abstract class Customer {
    protected EmailTemplate template;

    /**
     * Constructor: Initializes the customer with their respective email template.
     * 
     * @param template Email template for the customer.
     */
    public Customer(EmailTemplate template) {
        this.template = template;
    }

    /**
     * Abstract method to identify the customer's type.
     * 
     * @return Customer type.
     */
    public abstract CustomerType getType();

    /**
     * Returns the email message for this customer.
     * 
     * @return Email message.
     */
    public String getEmailMessage() {
        return template.getMessage();
    }
}

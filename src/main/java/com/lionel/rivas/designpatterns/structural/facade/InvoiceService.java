package com.lionel.rivas.designpatterns.structural.facade;

/**
 * This class is responsible for creating invoices. 
 * 
 * @author lionelrivas
 */
public class InvoiceService {

    /**
     * Creates an invoice for a {@code bill}.
     * 
     * @param bill the bill for which an invoice will be created. 
     */
    public void createInvoice(Bill bill) {
        System.out.println("creating invoice for a bill of " + bill.getAmount() + " dollars.");
    }
}

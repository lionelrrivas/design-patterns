package com.lionel.rivas.designpatterns.structural.facade;

public class ClientApp {
    
    public static void main(String[] args) {
        FinancialServiceFacade facade = new FinancialServiceFacade(
                new BillingService(), new InvoiceService());
        facade.createInvoice(3400);
    }
}

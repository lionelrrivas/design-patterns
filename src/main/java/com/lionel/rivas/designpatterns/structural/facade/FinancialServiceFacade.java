package com.lionel.rivas.designpatterns.structural.facade;

/**
 * This class is the facade for the {@link BillingService} and {@link InvoiceService}
 * classes. 
 * 
 * @author lionelrivas
 */
public class FinancialServiceFacade {
    
    private BillingService billingService;
    
    private InvoiceService invoiceService;

    public FinancialServiceFacade(BillingService billingService, 
            InvoiceService invoiceService) {
        this.billingService = billingService;
        this.invoiceService = invoiceService;
    }
    
    /**
     * Creates an invoice for {@code amount}.
     * 
     * @param amount 
     */
    public void createInvoice(int amount) {
        Bill bill = billingService.creatBill(amount);
        invoiceService.createInvoice(bill);
    }

    public BillingService getBillingService() {
        return billingService;
    }

    public void setBillingService(BillingService billingService) {
        this.billingService = billingService;
    }

    public InvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
}
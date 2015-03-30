/*
 * Code written by Bruno Lowagie in the context of an example.
 */
package zugferd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iText
 */
public class BASICInvoiceData implements BASICLevel {

    public static final String ID = "urn:ferd:CrossIndustryDocument:invoice:1p0:basic";
    
    protected boolean test = true;
    protected String name = "INVOICE";
    protected String typeCode = "380";
    protected String date;
    protected String dateFormat = "102";
    protected List<String> notes = new ArrayList<String>();
    protected String sellerName;
    protected String sellerPostcode;
    protected String sellerLineOne;
    protected String sellerLineTwo;
    protected String sellerCityName;
    protected String sellerCountryID;
    protected List<String> sellerTaxRegistrationID = new ArrayList<String>();
    protected List<String> sellerTaxRegistrationSchemeID = new ArrayList<String>();
    protected String buyerName;
    protected String buyerPostcode;
    protected String buyerLineOne;
    protected String buyerLineTwo;
    protected String buyerCityName;
    protected String buyerCountryID;
    protected List<String> buyerTaxRegistrationID = new ArrayList<String>();
    protected List<String> buyerTaxRegistrationSchemeID = new ArrayList<String>();
    protected String deliveryDate;
    protected String deliveryDateFormat = "102";
    protected String paymentReference;
    protected String invoiceCurrencyCode;
    protected List<String> paymentMeansID = new ArrayList<String>();
    protected List<String> paymentMeansSchemeAgencyID = new ArrayList<String>();
    protected List<String> paymentMeansPayeeAccountIBAN = new ArrayList<String>();
    protected List<String> paymentMeansPayeeAccountName = new ArrayList<String>();
    protected List<String> paymentMeansPayeeAccountProprietaryID = new ArrayList<String>();
    protected List<String> paymentMeansPayeeFinancialInstitutionBIC = new ArrayList<String>();
    protected List<String> paymentMeansPayeeFinancialInstitutionGermanBankleitzahlID = new ArrayList<String>();
    protected List<String> paymentMeansPayeeFinancialInstitutionName = new ArrayList<String>();
    protected List<String> taxCalculatedAmount = new ArrayList<String>();
    protected List<String> taxCalculatedAmountCurrencyID = new ArrayList<String>();
    protected List<String> taxTypeCode = new ArrayList<String>();
    protected List<String> taxBasisAmount = new ArrayList<String>();
    protected List<String> taxBasisAmountCurrencyID = new ArrayList<String>();
    protected List<String> taxApplicablePercent = new ArrayList<String>();
    protected String lineTotalAmount;
    protected String lineTotalAmountCurrencyID;
    protected String chargeTotalAmount;
    protected String chargeTotalAmountCurrencyID;
    protected String allowanceTotalAmount;
    protected String allowanceTotalAmountCurrencyID;
    protected String taxBasisTotalAmount;
    protected String taxBasisTotalAmountCurrencyID;
    protected String taxTotalAmount;
    protected String taxTotalAmountCurrencyID;
    protected String grandTotalAmount;
    protected String grandTotalAmountCurrencyID;
    protected String billedQuantity;
    protected String billedQuantityUnitCode = "C62";
    protected String specifiedTradeProductName;
    
    
    public boolean getTestIndicator() {
        return test;
    }

    public String getIdentifier() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public String getDateTime() {
        return date;
    }

    public String getDateTimeFormat() {
        return dateFormat;
    }

    public String[] getNotes() {
        return (String[]) notes.toArray();
    }

    public String getSellerName() {
        return sellerName;
    }

    public String getSellerPostcode() {
        return sellerPostcode;
    }

    public String getSellerLineOne() {
        return sellerLineOne;
    }

    public String getSellerLineTwo() {
        return sellerLineTwo;
    }

    public String getSellerCityName() {
        return sellerCityName;
    }

    public String getSellerCountryID() {
        return sellerCountryID;
    }

    public String[] getSellerTaxRegistrationID() {
        return (String[]) sellerTaxRegistrationID.toArray();
    }

    public String[] getSellerTaxRegistrationShemeID() {
        return (String[]) sellerTaxRegistrationSchemeID.toArray();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public String getBuyerPostcode() {
        return buyerPostcode;
    }

    public String getBuyerLineOne() {
        return buyerLineOne;
    }

    public String getBuyerLineTwo() {
        return buyerLineTwo;
    }

    public String getBuyerCityName() {
        return buyerCityName;
    }

    public String getBuyerCountryID() {
        return buyerCountryID;
    }

    public String[] getBuyerTaxRegistrationID() {
        return (String[]) buyerTaxRegistrationID.toArray();
    }

    public String[] getBuyerTaxRegistrationShemeID() {
        return (String[]) buyerTaxRegistrationSchemeID.toArray();
    }

    public String getDeliveryDateTime() {
        return deliveryDate;
    }

    public String getDeliveryDateTimeFormat() {
        return deliveryDateFormat;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    public String[] getPaymentMeansID() {
        return (String[])paymentMeansID.toArray();
    }

    public String[] getPaymentMeansSchemeAgencyID() {
        return (String[])paymentMeansSchemeAgencyID.toArray();
    }

    public String[] getPaymentMeansPayeeAccountIBAN() {
        return (String[])paymentMeansPayeeAccountIBAN.toArray();
    }

    public String[] getPaymentMeansPayeeAccountAccountName() {
        return (String[])paymentMeansPayeeAccountName.toArray();
    }

    public String[] getPaymentMeansPayeeAccountProprietaryID() {
        return (String[])paymentMeansPayeeAccountProprietaryID.toArray();
    }

    public String[] getPaymentMeansPayeeFinancialInstitutionBIC() {
        return (String[])paymentMeansPayeeFinancialInstitutionBIC.toArray();
    }

    public String[] getPaymentMeansPayeeFinancialInstitutionGermanBankleitzahlID() {
        return (String[])paymentMeansPayeeFinancialInstitutionGermanBankleitzahlID.toArray();
    }

    public String[] getPaymentMeansPayeeFinancialInstitutionName() {
        return (String[])paymentMeansPayeeFinancialInstitutionName.toArray();
    }

    public String[] getTaxCalculatedAmount() {
        return (String[])taxCalculatedAmount.toArray();
    }

    public String[] getTaxCalculatedAmountCurrencyID() {
        return (String[])taxCalculatedAmountCurrencyID.toArray();
    }

    public String[] getTaxTypeCode() {
        return (String[])taxTypeCode.toArray();
    }

    public String[] getTaxBasisAmount() {
        return (String[])taxBasisAmount.toArray();
    }

    public String[] getTaxBasisAmountCurrencyID() {
        return (String[])taxBasisAmountCurrencyID.toArray();
    }

    public String[] getTaxApplicablePercent() {
        return (String[])taxApplicablePercent.toArray();
    }

    public String getLineTotalAmount() {
        return lineTotalAmount;
    }

    public String getLineTotalAmountCurrencyID() {
        return lineTotalAmountCurrencyID;
    }

    public String getChargeTotalAmount() {
        return chargeTotalAmount;
    }

    public String getChargeTotalAmountCurrencyID() {
        return chargeTotalAmountCurrencyID;
    }

    public String getAllowanceTotalAmount() {
        return allowanceTotalAmount;
    }

    public String getAllowanceTotalAmountCurrencyID() {
        return allowanceTotalAmountCurrencyID;
    }

    public String getTaxBasisTotalAmount() {
        return taxBasisTotalAmount;
    }

    public String getTaxBasisTotalAmountCurrencyID() {
        return taxBasisTotalAmountCurrencyID;
    }

    public String getTaxTotalAmount() {
        return taxTotalAmount;
    }

    public String getTaxTotalAmountCurrencyID() {
        return taxTotalAmountCurrencyID;
    }

    public String getGrandTotalAmount() {
        return grandTotalAmount;
    }

    public String getGrandTotalAmountCurrencyID() {
        return grandTotalAmount;
    }

    public String getBilledQuantity() {
        return billedQuantity;
    }

    public String getBilledQuantityUnitCode() {
        return billedQuantityUnitCode;
    }

    public String getSpecifiedTradeProductName() {
        return specifiedTradeProductName;
    }
    
}

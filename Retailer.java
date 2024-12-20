public class Retailer extends Store {
     // Attributes specific to Retailer class
    private int VATInclusivePrice;
    private int loyaltyPoint; 
    private boolean isPaymentOnline; 
    private String purchasedYear;

    // Constructor
    public Retailer(int storeId, String storeName, String location, String openingHour,
    double totalSales, double totalDiscount, int VATInclusivePrice,
    boolean isPaymentOnline, String purchasedYear) {
        super(storeId, storeName, location, openingHour);
        setTotalSales(totalSales);
        setTotalDiscount(totalDiscount);
        this.VATInclusivePrice = VATInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0;
    }
    // Getter and setter methods
    public int getVATInclusivePrice() {
        return VATInclusivePrice;
    }

    public void setVATInclusivePrice(int VATInclusivePrice) {
        this.VATInclusivePrice = VATInclusivePrice;
    }

    public int getLoyaltyPoint() {
        return loyaltyPoint;
    }

    public void setLoyaltyPoint(int loyaltyPoint) {
        this.loyaltyPoint = loyaltyPoint;
    }

    public boolean isPaymentOnline() {
        return isPaymentOnline;
    }

    public void setIsPaymentOnline(boolean isPaymentOnline) {
        this.isPaymentOnline = isPaymentOnline;
    }

    public String getPurchasedYear() {
        return purchasedYear;
    }

    public void setPurchasedYear(String purchasedYear) {
        this.purchasedYear = purchasedYear;
    }

    public void setLoyaltyPoint(boolean isOnline, int VATPrice) {
        if (isOnline) {
            setLoyaltyPoint((int) (VATPrice * 0.01));
        }
    }
    // Method to remove product based on conditions
    public void removeProduct() {
        // If loyalty points are 0 and the product was purchased in 2020, 2021, or 2022
        if (getLoyaltyPoint() == 0 && (getPurchasedYear().equals("2020") || getPurchasedYear().equals("2021") || getPurchasedYear().equals("2022"))) {
            setVATInclusivePrice(0);
            setLoyaltyPoint(0);
            setIsPaymentOnline(false);
        }
    }
    // Override display method to show retailer-specific information

    @Override
    public void display() {
        super.display();
        if (getVATInclusivePrice() != 0 || getLoyaltyPoint() != 0 || isPaymentOnline()) {
            System.out.println("The Final Price (VAT Inclusive): " + getVATInclusivePrice());
            System.out.println("Loyalty Point Earned: " + getLoyaltyPoint());
            System.out.println("Year of Purchase: " + getPurchasedYear());
        } else {
            // If product details are not available, display a message
            System.out.println("The Product has been removed.");
        }
    }
}
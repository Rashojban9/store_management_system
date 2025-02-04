public class Department extends Store {
    // Attributes
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales; // Indicates if the product is on sale

    public Department(int storeId, String storeName, String location,
    String openingHour, double totalSales, double totalDiscount, String productName, double markedPrice) 
    {
        super(storeId, storeName, location, openingHour);
        super.setTotalSales(totalSales); 
        super.setTotalDiscount(totalDiscount);
        
        this.productName = productName;
        this.markedPrice = markedPrice;
        this.isInSales = true;
        this.sellingPrice = 0;
    }
    // Getters
    public String getProductName() {
        return productName;
    }

    public double getMarkedPrice() {
        return markedPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isInSales() {
        return isInSales;
    }
     // Setters
    public void setMarkedPrice(double markedPrice) {
         this.markedPrice = markedPrice;
    }
   //Calculates the selling price of a product based on its marked price and discounts.

    public void calculateDiscountPrice(boolean isInSales, double markedPrice) {
        if (isInSales) {
            double discount = 0;
            if (markedPrice >= 5000) {
                discount = 0.2;
            } else if (markedPrice >= 3000 && markedPrice < 5000) {
                discount = 0.1;
            } else if (markedPrice >= 1000 && markedPrice < 3000) {
                discount = 0.05;
            }
            sellingPrice = markedPrice - (markedPrice * discount);
            super.setTotalDiscount(super.getTotalDiscount() + (markedPrice - sellingPrice));
            super.setTotalSales(super.getTotalSales() + sellingPrice);
            this.isInSales = isInSales;
        }
    }

    @Override
    public void display() {
        super.display();
        if (isInSales) {
            System.out.println("Product Name: " + productName);
            System.out.println("Marked Price: " + markedPrice);
        } else {
            System.out.println("Product Name: " + productName);
            System.out.println("Selling Price: " + sellingPrice);
 }
 }
}
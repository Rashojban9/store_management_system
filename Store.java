
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
public class Store {
    // Attributes
    private int storeId; // ID of the store
    private String storeName; // Name of the store
    private String location; // Location of the store
    private String openingHour; // Opening hour of the store
    private double totalDiscount; // Total discount given by the store
    private double totalSales; // Total sales made by the store

    public Store(int storeId, String storeName, String location, String openingHour) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
        this.totalSales = 0.0;
        this.totalDiscount = 0.0;
    }

    // Getters
    public int getStoreId() {
        return storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public String getLocation() {
        return location;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }

    // Setters
public void setStoreId(int storeId){
    this.storeId += storeId;
}
    public void setTotalSales(double newTotalSales) {
        this.totalSales += newTotalSales;
    }

    public void setTotalDiscount(double newDiscount) {
        this.totalDiscount += newDiscount;
    }

    /**
     * Displays the details of the store including its ID, name, location,
     * opening hour, total sales, and total discount.
     */

    public void display() {
        System.out.println("The Store ID for this store is: " + storeId);
        System.out.println("The Store Name is : " + storeName);
        System.out.println(storeName + " is located on : " + location);
        System.out.println("The " + storeName + " will open at " + openingHour + " am");

        // Check if there are any sales and discounts
        if (totalSales == 0 && totalDiscount == 0) {
            System.out.println("The discount is zero");
        } else {
            System.out.println("Total Sales: " + totalSales + " and the discounted amount is " + totalDiscount);
        }
    }
}
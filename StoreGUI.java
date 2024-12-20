import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
import java.awt.*;
import java.util.List;


import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class StoreGUI {
    private JFrame frame;

    private JPanel discountpricedepart;
    private JPanel departaddpanel;
    private JLabel storeId;
    private JTextField storeIdTF;
    private JLabel storeName;
    private JLabel locationdepart;
    private JLabel markedpridepart;
    private JLabel retailertotalsales;
    private JLabel discountdepart;
    private JLabel openinghourdepart;
    private JLabel productnamedepart;
    private JTextField storeNameTF;
    private JTextField openinghourTF;
    private JTextField totaldisdepartTF;
    private JTextField markedpricedepartTF;
    private JTextField locationdepartTF;
    private JTextField totalsalesdepartTF;
    private JTextField productdepartTF;
    private JPanel retaileraddpanel;
    private JPanel setloyaltypoint;
    private JPanel removeproduct;
    private JPanel clearndisplay;
    private JButton depaddbtn;
    private JLabel retailerstoreId;
    private JTextField retailerstoreIDTF;
    private JLabel retailerstoreName;
    private JTextField retailerstoreNameTF;
    private JLabel retaileropeninghourdepart;
    private JTextField retaileropeninghourTF;
    private JLabel retailerdist;
    private JTextField retailerdisTF;
    private JLabel retailerlocation;
    private JTextField retailertotalsalesTF;
    private JTextField retailerlocationTF;
    private JLabel retailervat;
    private JTextField retailervatTF;
    private JLabel retailerradio;
    private JLabel totalsalesdepart;
    private JLabel retailerpurchaseyrs;
    private JComboBox purchaseYearComboBox;
    private JButton retaileraddbtn;
    private JLabel dpstoreId;
    private JTextField dpstoreIdTF;
    private JLabel dpradio;
    private JRadioButton dpyesbtn;
    private JRadioButton dpnobtn;
    private JButton group;
    private JLabel dpmarkedprice;
    private JTextField dpmarkedpriceTF;
    private JTextField setloyaltystoreIdTF;
    private JLabel setloyaltyradio;
    private JRadioButton setloyaltyyesbutton;
    private JRadioButton setloyaltynobutton;
    private JButton dpcalc;
    private JLabel setloystoreId;
    private ButtonGroup grp;
    private JLabel setloyaltyvat;
    private JTextField setloyaltyvatTF;
    private JButton setloyaltybtn;
    private JLabel removestoreId;
    private JTextField removestoreIdTF;
    private JButton removeproductbtn;
    private JButton displaybtn;
    private JButton clearbtn;
    private BorderFactory departaddbrd;
    private BorderFactory retaileraddbrd;
    private BorderFactory discountcalcbrd;
    private BorderFactory setloyaltybrd;
    private BorderFactory clearndisplaybrd;
    private BorderFactory removebrd;
    private JButton addDepartmentButton;
   
    List<Store>storeList=new <Store>ArrayList();



    public StoreGUI() {
        

        // FRAME
        frame = new JFrame("StoreGUI");
        frame.setSize(1400, 850);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Panel to add department
        departaddpanel = new JPanel();
        departaddpanel.setBounds(10, 10, 640, 380);
        departaddpanel.setBackground(Color.LIGHT_GRAY);
        departaddpanel.setLayout(null);
        TitledBorder departaddbrd = BorderFactory.createTitledBorder("Add Department");
        departaddpanel.setBorder(departaddbrd);
        frame.add(departaddpanel);

        // Store ID Label and TextField
        storeId = new JLabel("Store ID:");
        storeId.setBounds(30, 40, 150, 25);
        departaddpanel.add(storeId);

        JTextField storeIdTF = new JTextField();
        storeIdTF.setBounds(120, 40, 150, 25);
        departaddpanel.add(storeIdTF);

        // Store Name Label and TextField
        storeName = new JLabel("Store Name:");
        storeName.setBounds(30, 100, 150, 25);
        departaddpanel.add(storeName);

        JTextField storeNameTF = new JTextField();
        storeNameTF.setBounds(120, 100, 150, 25);
        departaddpanel.add(storeNameTF);

       // Opening Hour Label and TextField
        openinghourdepart = new JLabel("Opening Hour:");
        openinghourdepart.setBounds(30, 160, 150, 25);
        departaddpanel.add(openinghourdepart);

        JTextField openinghourTF = new JTextField();
        openinghourTF.setBounds(120, 160, 150, 25);
        departaddpanel.add(openinghourTF);

       // Discount Label and TextField
        discountdepart = new JLabel("Discount:");
        discountdepart.setBounds(30, 220, 150, 25);
        departaddpanel.add(discountdepart);

        JTextField totaldisdepartTF = new JTextField();
        totaldisdepartTF.setBounds(120, 220, 150, 25);
        departaddpanel.add(totaldisdepartTF);

        // Location Label and TextField
        locationdepart = new JLabel("Location:");
        locationdepart.setBounds(380, 40, 150, 25);
        departaddpanel.add(locationdepart);

        JTextField locationdepartTF = new JTextField();
        locationdepartTF.setBounds(460, 40, 150, 25);
        departaddpanel.add(locationdepartTF);

        // Total Sales Label and TextField
        totalsalesdepart = new JLabel("Total Sales:");
        totalsalesdepart.setBounds(380, 100, 150, 25);
        departaddpanel.add(totalsalesdepart);

        JTextField totalsalesdepartTF = new JTextField();
        totalsalesdepartTF.setBounds(460, 100, 150, 25);
        departaddpanel.add(totalsalesdepartTF);

        // Product Name Label and TextField
        productnamedepart = new JLabel("Product Name:");
        productnamedepart.setBounds(375, 160, 140, 25);
        departaddpanel.add(productnamedepart);

        JTextField productdepartTF = new JTextField();
        productdepartTF.setBounds(460, 160, 150, 25);
        departaddpanel.add(productdepartTF);

        // Marked Price Label and TextField
        markedpridepart = new JLabel("Marked Price:");
        markedpridepart.setBounds(380, 220, 150, 25);
        departaddpanel.add(markedpridepart);

        JTextField markedpricedepartTF = new JTextField();
        markedpricedepartTF.setBounds(460, 220, 150, 25);
        departaddpanel.add(markedpricedepartTF);

        // JButton to add department
        JButton depaddbtn = new JButton("Add Department");
        depaddbtn.setBounds(440, 300, 180, 30);
        departaddpanel.add(depaddbtn);


 

        // Retailer Panel
        retaileraddpanel = new JPanel();
        retaileraddpanel.setBounds(10, 400, 640, 380);
        retaileraddpanel.setBackground(Color.LIGHT_GRAY);
        retaileraddpanel.setLayout(null);
        frame.add(retaileraddpanel);
        TitledBorder retaileraddbrd = BorderFactory.createTitledBorder("Add Retailer");
        retaileraddpanel.setBorder(retaileraddbrd);

        // StoreId Label and TextField
        retailerstoreId = new JLabel("Store ID:");
        retailerstoreId.setBounds(30, 40, 150, 25);
        retaileraddpanel.add(retailerstoreId);

        // Store ID TextField
        JTextField retailerstoreIDTF = new JTextField();
        retailerstoreIDTF.setBounds(110, 40, 150, 25);
        retaileraddpanel.add(retailerstoreIDTF);

        // storename
        retailerstoreName = new JLabel("Store Name:");
        retailerstoreName.setBounds(30, 100, 150, 25);
        retaileraddpanel.add(retailerstoreName);

        JTextField retailerstoreNameTF = new JTextField();
        retailerstoreNameTF.setBounds(120, 100, 150, 25);
        retaileraddpanel.add(retailerstoreNameTF);

        // openinh hours
        retaileropeninghourdepart = new JLabel("Opening Hour:");
        retaileropeninghourdepart.setBounds(30, 160, 150, 25);
        retaileraddpanel.add(retaileropeninghourdepart);

        JTextField retaileropeninghourTF = new JTextField();
        retaileropeninghourTF.setBounds(120, 160, 150, 25);
        retaileraddpanel.add(retaileropeninghourTF);

        // discount
        retailerdist = new JLabel("Discount:");
        retailerdist.setBounds(30, 220, 150, 25);
        retaileraddpanel.add(retailerdist);

        JTextField retailerdisTF = new JTextField();
        retailerdisTF.setBounds(120, 220, 150, 25);
        retaileraddpanel.add(retailerdisTF);

        // location for dep
        retailerlocation = new JLabel("Location:");
        retailerlocation.setBounds(380, 40, 150, 25);
        retaileraddpanel.add(retailerlocation);

        JTextField retailerlocationTF = new JTextField();
        retailerlocationTF.setBounds(460, 40, 150, 25);
        retaileraddpanel.add(retailerlocationTF);

        // total sales
        retailertotalsales = new JLabel("Total Sales:");
        retailertotalsales.setBounds(380, 100, 150, 25);
        retaileraddpanel.add(retailertotalsales);

        JTextField retailertotalsalesTF = new JTextField();
        retailertotalsalesTF.setBounds(460, 100, 150, 25);
        retaileraddpanel.add(retailertotalsalesTF);

        // Vat
        retailervat = new JLabel("VAT:");
        retailervat.setBounds(380, 160, 150, 25);
        retaileraddpanel.add(retailervat);

        retailervatTF = new JTextField();
        retailervatTF.setBounds(460, 160, 150, 25);
        retaileraddpanel.add(retailervatTF);

        // isinsales
        retailerradio = new JLabel("IsInSales:");
        retailerradio.setBounds(380, 220, 150, 25);
        retaileraddpanel.add(retailerradio);

        JRadioButton yesbutton = new JRadioButton("Yes");
        yesbutton.setBounds(450, 220, 60, 20);

        JRadioButton nobutton = new JRadioButton("No");
        nobutton.setBounds(520, 220, 60, 20);

        ButtonGroup groups = new ButtonGroup();
        groups.add(yesbutton);
        groups.add(nobutton);

        retaileraddpanel.add(yesbutton);
        retaileraddpanel.add(nobutton);

        // purchased year
        JLabel retailerpurchaseyrs = new JLabel("Purchase Year:");
        retailerpurchaseyrs.setBounds(30, 280, 150, 25);
        retaileraddpanel.add(retailerpurchaseyrs);
        purchaseYearComboBox = new JComboBox<>();
        for (int year = 2000; year <= 2024; year++) {
            purchaseYearComboBox.addItem(year);
        }
        purchaseYearComboBox.setBounds(120, 280, 150, 25);
        retaileraddpanel.add(purchaseYearComboBox);

        // JButton to add retailer
        JButton retaileraddbtn = new JButton("Add Retailer");
        retaileraddbtn.setBounds(420, 280, 150, 30);
        retaileraddpanel.add(retaileraddbtn);

    


        


        // Panel for discount price
        discountpricedepart = new JPanel();
        discountpricedepart.setBounds(670, 10, 350, 380);
        discountpricedepart.setBackground(Color.LIGHT_GRAY); // Ensure visibility
        discountpricedepart.setLayout(null);
        frame.add(discountpricedepart);
        TitledBorder discountcalcbrd = BorderFactory.createTitledBorder("Calculate Discount Price");
        discountpricedepart.setBorder(discountcalcbrd);

        // Store ID Label
        dpstoreId = new JLabel("Store ID:");
        dpstoreId.setBounds(30, 40, 150, 25);
        discountpricedepart.add(dpstoreId);

        // Store ID TextField
        JTextField dpstoreIdTF = new JTextField();
        dpstoreIdTF.setBounds(120, 40, 150, 25);
        discountpricedepart.add(dpstoreIdTF);

         // isonline
         dpradio = new JLabel("Is Online:");
         dpradio.setBounds(30, 100, 150, 25);
         discountpricedepart.add(dpradio);
 
         JRadioButton dpyesbtn = new JRadioButton("Yes");
         dpyesbtn.setBounds(120, 100, 60, 25);
 
         JRadioButton dpnobtn = new JRadioButton("No");
         dpnobtn.setBounds(200, 100, 60, 25);
 
         ButtonGroup group = new ButtonGroup();
         group.add(dpyesbtn);
         group.add(dpnobtn);
 
         discountpricedepart.add(dpyesbtn);
         discountpricedepart.add(dpnobtn);

         // Vat
         dpmarkedprice = new JLabel("Marked Price");
         dpmarkedprice.setBounds(30, 160, 150, 25);
         discountpricedepart.add(dpmarkedprice);
 
         dpmarkedpriceTF = new JTextField();
         dpmarkedpriceTF.setBounds(120, 160, 150, 25);
         discountpricedepart.add(dpmarkedpriceTF);

        // JButton to add retailer
        JButton dpcalc = new JButton("Discount Price");
        dpcalc.setBounds(120, 240, 150, 30);
        discountpricedepart.add(dpcalc);



        // to set loyalty point
        setloyaltypoint = new JPanel();
        setloyaltypoint.setBounds(1040, 10, 330, 380);
        setloyaltypoint.setBackground(Color.LIGHT_GRAY);
        setloyaltypoint.setLayout(null);
        frame.add(setloyaltypoint);  
        TitledBorder setloyaltybrd = BorderFactory.createTitledBorder("Loyalty Point");
        setloyaltypoint.setBorder(setloyaltybrd);

        // Store ID Label
        setloystoreId = new JLabel("Store ID:");
        setloystoreId.setBounds(30, 40, 150, 25);
        setloyaltypoint.add(setloystoreId);

        // Store ID TextField
        JTextField setloyaltystoreIdTF = new JTextField();
        setloyaltystoreIdTF.setBounds(120, 40, 150, 25);
        setloyaltypoint.add(setloyaltystoreIdTF);

        //isonline
        setloyaltyradio = new JLabel("Is Online:");
        setloyaltyradio.setBounds(30, 100, 150, 25);
        setloyaltypoint.add(setloyaltyradio);

        JRadioButton setloyaltyyesbutton = new JRadioButton("Yes");
        setloyaltyyesbutton.setBounds(120, 100, 60, 20);

        JRadioButton setloyaltynobutton = new JRadioButton("No");
        setloyaltynobutton.setBounds(200, 100, 60, 20);

        ButtonGroup grp = new ButtonGroup();
        grp.add(setloyaltyyesbutton);
        grp.add(setloyaltynobutton);

        setloyaltypoint.add(setloyaltyyesbutton);
        setloyaltypoint.add(setloyaltynobutton);

         // Vat
         setloyaltyvat = new JLabel("VAT:");
         setloyaltyvat.setBounds(30, 160, 150, 25);
         setloyaltypoint.add(setloyaltyvat);
 
         setloyaltyvatTF = new JTextField();
         setloyaltyvatTF.setBounds(120, 160, 150, 25);
         setloyaltypoint.add(setloyaltyvatTF);

         // JButton to set loyalty point
         JButton setloyaltybtn = new JButton("Set Loyalty Point");
         setloyaltybtn.setBounds(80,240, 180, 30);
         setloyaltypoint.add(setloyaltybtn);




        // to remove
        removeproduct = new JPanel();
        removeproduct.setBounds(670, 400, 350, 380);
        removeproduct.setLayout(null);
        removeproduct.setBackground(Color.LIGHT_GRAY);
        frame.add(removeproduct);
        TitledBorder removebrd = BorderFactory.createTitledBorder("Remove Product");
        removeproduct.setBorder(removebrd);


        // Store ID Label
        removestoreId = new JLabel("Store ID:");
        removestoreId.setBounds(30, 40, 150, 25);
        removeproduct.add(removestoreId);

        // Store ID TextField
        JTextField removestoreIdTF = new JTextField();
        removestoreIdTF.setBounds(120, 40, 150, 25);
        removeproduct.add(removestoreIdTF);

        // JButton to remove product
        JButton removeproductbtn = new JButton("Remove Product");
        removeproductbtn.setBounds(100,120, 150, 30);
        removeproduct.add(removeproductbtn);

        // to display and clear
        clearndisplay = new JPanel();
        clearndisplay.setBounds(1040, 400, 330, 380);
        clearndisplay.setLayout(null);
        clearndisplay.setBackground(Color.LIGHT_GRAY);
        frame.add(clearndisplay);
        TitledBorder clearndisplaybrd = BorderFactory.createTitledBorder("Clear and Display");
        clearndisplay.setBorder(clearndisplaybrd);
        

        // JButton to remove product
        JButton displaybtn = new JButton("Display");
        displaybtn.setBounds(100,120, 150, 30);
        clearndisplay.add(displaybtn);

        // JButton to remove product
        JButton clearbtn = new JButton("Clear");
        clearbtn.setBounds(100,200, 150, 30);
        clearndisplay.add(clearbtn);
        // Add Department Button ActionListener
depaddbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve and validate input fields as strings first
        String storeId = storeIdTF.getText();
            String storeName = storeNameTF.getText();
            String location = locationdepartTF.getText();
            String openingHour = openinghourTF.getText();
            String totalSales = totalsalesdepartTF.getText();
            String discount = totaldisdepartTF.getText();
            String productName = productdepartTF.getText();
           String markedPrice = markedpricedepartTF.getText();


        
        if (storeId.isEmpty() || storeName.isEmpty() || location.isEmpty() || openingHour.isEmpty() || 
            totalSales.isEmpty() || discount.isEmpty() || productName.isEmpty() || markedPrice.isEmpty()) {
            
            // Show a JOptionPane error message if any field is empty
            JOptionPane.showMessageDialog(null, "Please fill in all the required fields.", "Missing Information", JOptionPane.ERROR_MESSAGE);
        }  else {
            try {
                // Convert strings to numeric values where needed
                int store_id = Integer.parseInt(storeId);
                double total_sale = Double.parseDouble(totalSales);
                
                double discount_ = Double.parseDouble(discount);
                double marked_price = Double.parseDouble(markedPrice);
                // Check if departmentList is empty
                if (storeList.isEmpty()) {
                    Department dep = new Department(store_id, storeName, location, openingHour, total_sale, discount_, productName, marked_price);
                    storeList.add(dep);
                    JOptionPane.showMessageDialog(frame, "Department data successfully stored", "Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    boolean duplicate = false;
                    for (Store dep : storeList) {
                        if (dep.getStoreId() == store_id) {
                            JOptionPane.showMessageDialog(frame, "Duplicate department data", "Error", JOptionPane.WARNING_MESSAGE);
                            duplicate = true;
                            break;
                        }
                    }

                    // If no duplicate is found, add the department
                    if (!duplicate) {
                         Department dep = new Department(store_id, storeName, location, openingHour, total_sale, discount_, productName, marked_price);
                    storeList.add(dep);
                    JOptionPane.showMessageDialog(frame, "Department data successfully stored", "Successful", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid numeric values for ID and Budget", "Incorrect Detail", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
});

// Add Retailer Button ActionListener
retaileraddbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve and validate input fields as strings first
        String storeId = retailerstoreIDTF.getText();
        String storeName =retailerstoreNameTF.getText();
        String location = retailerlocationTF.getText();
        String openingHour = retaileropeninghourTF.getText();
        String totalSales = retailertotalsalesTF.getText();
        String discount = retailerdisTF.getText();
        String vat = retailervatTF.getText();
        boolean isPaymentOnline = yesbutton.isSelected();  // Assumes yesbutton refers to online payment option
        String purchaseYear = purchaseYearComboBox.getSelectedItem().toString();
        if (storeId.isEmpty() || storeName.isEmpty() || location.isEmpty() || openingHour.isEmpty() || 
    totalSales.isEmpty() || discount.isEmpty() || vat.isEmpty() || purchaseYear.isEmpty()) {
    
    // Show a JOptionPane error message if any field is empty
    JOptionPane.showMessageDialog(null, "Please fill in all the required fields.", "Missing Information", JOptionPane.ERROR_MESSAGE);
}else{
        try {
            // Convert strings to numeric values where needed
            int store_id = Integer.parseInt(storeId);
            double total_sale = Double.parseDouble(totalSales);
            int discount_ = Integer.parseInt(discount);
            int vat_ = Integer.parseInt(vat);

            // Check if storeList is empty
            if (storeList.isEmpty()) {
                Retailer ret = new Retailer(store_id, storeName, location, openingHour, total_sale, discount_, vat_, isPaymentOnline, purchaseYear);
                storeList.add(ret);
                JOptionPane.showMessageDialog(frame, "Your data is successfully stored", "Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
                boolean duplicate = false;
                for (Store store : storeList) {
                    if (store instanceof Retailer) {
                        if (store.getStoreId() == store_id) {
                            JOptionPane.showMessageDialog(frame, "Duplicate data", "Error", JOptionPane.WARNING_MESSAGE);
                            duplicate = true;
                            break;
                        }
                    }
                }

                // If no duplicate is found, add the retailer
                if (!duplicate) {
                    Retailer ret = new Retailer(store_id, storeName, location, openingHour, total_sale, discount_, vat_, isPaymentOnline, purchaseYear);
                    storeList.add(ret);
                    JOptionPane.showMessageDialog(frame, "Your data is successfully stored", "Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values", "Incorrect Detail", JOptionPane.WARNING_MESSAGE);
        }
    }}
});



clearbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Clear all text fields in the department panel
        storeIdTF.setText("");
        storeNameTF.setText("");
        openinghourTF.setText("");
        totaldisdepartTF.setText("");
        locationdepartTF.setText("");
        totalsalesdepartTF.setText("");
        productdepartTF.setText("");
        markedpricedepartTF.setText("");

        // Clear all text fields in the retailer panel
        retailerstoreIDTF.setText("");
        retailerstoreNameTF.setText("");
        retaileropeninghourTF.setText("");
        retailerdisTF.setText("");
        retailerlocationTF.setText("");
        retailertotalsalesTF.setText("");
        retailervatTF.setText("");

        // Clear all text fields in the discount price panel
        dpstoreIdTF.setText("");
        dpmarkedpriceTF.setText("");

        // Clear all text fields in the loyalty point panel
        setloyaltystoreIdTF.setText("");
        setloyaltyvatTF.setText("");

        // Clear all text fields in the remove product panel
        removestoreIdTF.setText("");

        // Clear the radio button selections and combo box in the loyalty and retailer panels
        grp.clearSelection();
        group.clearSelection();
        purchaseYearComboBox.setSelectedIndex(0);
    }
});
displaybtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        StringBuilder displayText = new StringBuilder();
        
        if (storeList.isEmpty()) {
            displayText.append("No stores available.\n");
        } else {
            for (Store store : storeList) {
                if (store instanceof Retailer) {
                    displayText.append("Retailer details:\n");
                    System.out.println("\n detail for Retailer");
                    // Call the display method and append the output
                    ((Retailer) store).display(); 
                }
                if (store instanceof Department) {
                    displayText.append("\n Department details:\n");
                    // Call the display method and append the output
                    System.out.println("detail for Department");
                    ((Department) store).display(); 
                }
            }
        }

        // Show the display text in a message dialog
        JOptionPane.showMessageDialog(frame, displayText.toString(), "Store Details", JOptionPane.INFORMATION_MESSAGE);
    }
});

dpcalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve and validate the store ID
                String inputStoreId = dpstoreIdTF.getText().trim();
                if (inputStoreId.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Store ID cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int storeId;
                try {
                    storeId = Integer.parseInt(inputStoreId);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid Store ID format. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Find the store with the given ID
                Store store = findStoreById(storeId);
                if (store == null) {
                    JOptionPane.showMessageDialog(frame, "No store found with the given ID.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Ensure the store object can be cast to Department
                if (store instanceof Department) {
                    Department department = (Department) store;

                    // Get the marked price from the text field
                    String markedPriceText = dpmarkedpriceTF.getText().trim();
                    double markedPrice;
                    try {
                        markedPrice = Double.parseDouble(markedPriceText);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Invalid marked price format. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Determine if the product is on sale
                    boolean isInSales = dpyesbtn.isSelected();

                    // Call the method to calculate the discount price
                    department.calculateDiscountPrice(isInSales, markedPrice);

                    // Show the discount price (this assumes you have a method to get the selling price)
                    double sellingPrice = department.getSellingPrice(); // Ensure this method exists
                    JOptionPane.showMessageDialog(frame, "The discount price is: " + sellingPrice, "Discount Price", JOptionPane.INFORMATION_MESSAGE);
                } 
            }
        });
        setloyaltybtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve and validate the store ID
        String inputStoreId = setloyaltystoreIdTF.getText().trim();
        if (inputStoreId.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Store ID cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int storeId;
        try {
            storeId = Integer.parseInt(inputStoreId);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid Store ID format. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Retrieve and validate the VAT
        String vatText = setloyaltyvatTF.getText().trim();
        double vat;
        try {
            vat = Double.parseDouble(vatText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid VAT format. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the payment is online
        boolean isPaymentOnline = setloyaltyyesbutton.isSelected();

        // Find the store with the given ID
        Store store = findStoreById(storeId);
        if (store == null) {
            JOptionPane.showMessageDialog(frame, "No store found with the given ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ensure the store object can be cast to Retailer
        if (store instanceof Retailer) {
            Retailer retailer = (Retailer) store;

            // Calculate the VAT-inclusive price
            double vatInclusivePrice = calculateVatInclusivePrice(retailer, vat);
            int vattt = (int) vatInclusivePrice ;

            // Set the loyalty points
            retailer.setLoyaltyPoint(vattt);

            JOptionPane.showMessageDialog(frame, "Loyalty points have been set successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } 
    }
});

removeproductbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Retrieve and validate the store ID
        String inputStoreId = removestoreIdTF.getText().trim();
        if (inputStoreId.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Store ID cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int storeId;
        try {
            storeId = Integer.parseInt(inputStoreId);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid Store ID format. Please enter a number.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Find the store with the given ID in storeList
        Store storeToRemove = null;
        for (Store store : storeList) {
            if (store.getStoreId() == storeId) {
                storeToRemove = store;
                break;
            }
        }

        if (storeToRemove == null) {
            JOptionPane.showMessageDialog(frame, "No store found with the given ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Ensure the store object can be cast to Retailer
        if (storeToRemove instanceof Retailer) {
            Retailer retailer = (Retailer) storeToRemove;

            // Call the method to remove the product
            retailer.removeProduct(); // Assuming this method handles product removal

            // Remove the store from the storeList
            storeList.remove(storeToRemove);

            JOptionPane.showMessageDialog(frame, "Product removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(frame, "The store object cannot be cast to Retailer.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
});





        

        frame.setVisible(true);
    }
     // Method to find a store by its ID
 
    private double calculateVatInclusivePrice(Retailer retailer, double vat) {
    // Assuming you have a method to get the marked price from the Retailer
    double markedPrice = retailer.getVATInclusivePrice(); // Ensure this method exists

    // Calculate VAT-inclusive price
    return markedPrice * (1 + vat / 100);
}

    // Method to find a store by its ID
    private Store findStoreById(int storeId) {
        for (Store store : storeList) {
            if (store.getStoreId() == storeId) {
                JOptionPane.showMessageDialog(null, "The store object cannot be cast to Department.", "Error", JOptionPane.ERROR_MESSAGE);
                return store;
            }
        }
        return null;
    }
    

    

    public static void main(String[] args) {
        new StoreGUI();
    }
}




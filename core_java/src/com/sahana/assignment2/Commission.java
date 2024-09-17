package com.sahana.assignment2;

public class Commission {
	private String Name;
    private String Address;
    private String Phone;
    private double Sales_amount;

    // Method to accept details of the sales employee
    public void acceptDetails(String name, String address, String phone, double sales_amount) {
        this.Name = name;
        this.Address = address;
        this.Phone = phone;
        this.Sales_amount = sales_amount;
    }

    // Method to calculate the commission
    public double calculateCommission() {
        double commission = 0.0;
        if (Sales_amount >= 100000) {
            commission = Sales_amount * 0.10;
        } else if (Sales_amount >= 50000) {
            commission = Sales_amount * 0.05;
        } else if (Sales_amount >= 30000) {
            commission = Sales_amount * 0.03;
        }
        return commission;
    }

    // Method to display the commission
    public void displayCommission() {
        double commission = calculateCommission();
        System.out.println("The commission for " + Name + " is: " + commission);
    }

}

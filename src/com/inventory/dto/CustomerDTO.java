package com.inventory.dto;

public class CustomerDTO {
    private int customersId;
    private String customerCode;
    private String fullName;
    private String location;
    private String phone;
    private double debit;
    private double credit;
    private double balance;

    public int getCustomersId(){
        return customersId;
    }    

    public void setCustomersId(int customersId) {
        this.customersId = customersId;
    }

    public String getCustomerCode(){
        return customerCode;
    }

    public void setCustomersCode(String customerCode) {
        this.customerCode = customerCode;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public double getDebit(){
        return debit;
    }


    public void setDebit(double debit) {
        this.debit = debit;
    }


    public double getCebit() {
        return credit;
    }

    public void setCredit(double credit){
        this.credit = credit;
    }


    public double getBalance(){
        return balance;
    }


    public void setBalance(double balance){
        this.balance = balance;
    }
}

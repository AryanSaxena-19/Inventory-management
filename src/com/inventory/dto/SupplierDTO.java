package com.inventory.dto;

public class SupplierDTO {

    public int getSupplierId(){
        return supplierId;
    }


    public void setSupplierId(int supplierId){
        this.supplierId = supplierId;
    }


    public String getSupplierCode(){
        return supplierCode;
    }


    public void setSupplierCode(String supplierCode){
        this.supplierCode = supplierCode;
    }


    public String getFullName(){
        return fullName;
    }


    public void setFullName(String fullName){
        this.fullName = fullName;
    }



    public String getLocation(){
        return location;
    }


    public void setLocation(String location){
        this.location = location; 
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public double getDebit() {
        return debit;
    }


    public void steDebit(double debit) {
        this.debit = debit;
    }


    public double getCredit() {
        return credit;
    }


    public void setCredit(double credit){
        this.credit = credit;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }



    private int supplierId;
    private String supplierCode;
    private String fullName;
    private String location;
    private String phone;
    private double debit;
    private double credit;
    private double balance;

}
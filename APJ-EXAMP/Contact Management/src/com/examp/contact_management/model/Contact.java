package com.examp.contact_management.model;

public class Contact {
    private int rollNo;
    private String phoneNumber;
    private String contactGroup;
    private String fullName;
    private String gender;
    private String address;
    private String dob;
    private String email;

    public Contact() {
    }

    public Contact(String phoneNumber, String contactGroup, String fullName, String gender, String dob, String address, String email) {
        this.phoneNumber = phoneNumber;
        this.contactGroup = contactGroup;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.email = email;
    }

    public Contact(int rollNo, String phoneNumber, String contactGroup, String fullName, String gender,String dob, String address, String email) {
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
        this.contactGroup = contactGroup;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toStringCSV(){
        return rollNo+","+phoneNumber+","+contactGroup+","+fullName+","+gender+","+dob+","+address+","+email+"\n";
    }

    public void displayContact(){
        System.out.printf("|| %12s | %20s | %30s | %10s | %11s | %30s | %25s ||",phoneNumber,contactGroup,fullName,gender,dob,address,email);
        System.out.println();
    }
    public void displayContactNonEmail(){
        System.out.printf("|| %12s | %20s | %30s | %10s | %11s | %30s ||",phoneNumber,contactGroup,fullName,gender,dob,address);
        System.out.println();
    }
}

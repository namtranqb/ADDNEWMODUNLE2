package com.examp.contact_management.service;

import com.examp.contact_management.dal.ContactDB;
import com.examp.contact_management.model.Contact;
import com.sun.xml.internal.ws.util.StringUtils;

import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactService {

    ContactDB contactDB = new ContactDB();
    Scanner sc = new Scanner(System.in);

    public void loadFromFile(){
        contactDB.read();
    }

    public void writeToFile(){
        contactDB.write();
    }

    public void readFromFile(){
        displayHeader();
        for (Contact ct: contactDB.contactList) {
            ct.displayContact();
        }
    }

    public void searchContact() {
        System.out.println("*-- TÌM KIẾM DANH BẠ --*");
        System.out.println("N(tìm kiếm theo tên) / P(tìm kiếm theo SĐT) / G(tìm kiếm theo nhóm danh bạ) / khác(thoát)");
        System.out.print("Lựa chọn: ");
        switch (toUpperCase(sc.nextLine())){
            case "N":
                searchContactByName();
                break;
            case "P":
                searchContactByPhoneNumber();
                break;
            case "G":
                searchContactByGroup();
                break;
            default:
                System.out.println("Bạn muốn dừng tìm kiếm ?");
                System.out.println("Chọn Y(thoát) / khác(quay lại)");

                switch (toUpperCase(sc.nextLine())){
                    case "Y":
                        break;
                    default:
                        searchContact();
                }
        }
    }

    public void search1Contact(){
        System.out.println("*-- TÌM KIẾM DANH BẠ --*");
        System.out.println("Nhập chuỗi tìm kiếm (tên hoặc nhóm hoặc SĐT hoặc email): ");
        boolean check = false;
        int count = 0;
        String string = removeAccent(toLowerCase(sc.nextLine()));
        for (Contact ct: contactDB.contactList) {
            String tempName = removeAccent(toLowerCase(ct.getFullName()));
            String tempPhone = ct.getPhoneNumber();
            String tempGroup = removeAccent(toLowerCase(ct.getContactGroup()));
            String tempEmail = ct.getEmail();
            if(tempName.contains(string) || tempPhone.contains(string) || tempGroup.contains(string) || tempEmail.contains(string)){
                check = true;
                if(++count == 1){
                    displayHeader();
                }
                ct.displayContact();
            }
        }
        if(!check){
            System.out.println("Không tìm thấy trong danh bạ !");
        }
    }

    public void searchContactByPhoneNumber() {
        boolean check = false;
        int count = 0;
        System.out.println("Nhập số ĐT tìm kiếm(xxx.xxx.xxxx): ");
        String phoneNumber = sc.nextLine();
        for (Contact ct: contactDB.contactList) {
            if(ct.getPhoneNumber().contains(phoneNumber)){
                check = true;
                if(++count == 1){
                    displayHeader();
                }
                ct.displayContact();
            }
        }
        if(!check){
            System.out.println("Không tìm thấy số ĐT !");
        }
    }


    // chuyển chuỗi có dấu sang chuỗi không dấu
    public String removeAccent(String s) {

        String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(temp).replaceAll("").replace('đ','d').replace('Đ','D');
    }


    public void searchContactByName() {
        boolean check = false;
        System.out.println("Nhập tên tìm kiếm: ");
        int count = 0;
        String name = removeAccent(toLowerCase(sc.nextLine()));

        for (Contact ct: contactDB.contactList) {
            String temp = removeAccent(toLowerCase(ct.getFullName()));
            if(temp.contains(name) ){
                check = true;
                count ++;
                if(count == 1){
                    displayHeader();
                }
                ct.displayContact();

            }
        }
        if(!check){
            System.out.println("Không tìm thấy trong danh bạ !");
        }
    }

    public void searchContactByGroup(){
        boolean check = false;
        System.out.println("Nhập tên nhóm tìm kiếm: ");
        String nameGroup = removeAccent(toLowerCase(sc.nextLine()));
        int count = 0;
        for (Contact ct: contactDB.contactList) {
            String temp = removeAccent(toLowerCase(ct.getContactGroup()));
            if( temp.contains(nameGroup)){
                check = true;
                count++;
                if(count == 1) {
                    displayHeader();
                }
                ct.displayContact();

            }
        }
        if(!check){
            System.out.println("Không tìm thấy trong danh bạ !");
        }
    }


    public void deleteContact() {
        boolean check = false;
        System.out.println("*--XÓA THÔNG TIN DANH BẠ--*");
        System.out.println("Nhập số ĐT cần xóa(xxx.xxx.xxxx): ");
        String phoneNumber = sc.nextLine();
        for (int i = 0; i < contactDB.contactList.size(); i++) {
            if(contactDB.contactList.get(i).getPhoneNumber().equals(phoneNumber)){
                check = true;
                displayHeader();
                contactDB.contactList.get(i).displayContact();
                System.out.println("Bạn muốn xóa số ĐT này ?");
                System.out.println("Chọn Y(tiếp tục) / khác(thoát)");
                switch (toUpperCase(sc.nextLine())){
                    case "Y":
                        String temp = contactDB.contactList.get(i).getFullName();
                        contactDB.contactList.remove(contactDB.contactList.get(i));
                        System.out.println("Bạn vừa xóa <"+temp+"> khỏi danh bạ !");
                        writeToFile();
                        break;

                    default:
                        break;
                }
            }
        }
        if(!check){
            System.out.println("Không tìm thấy số ĐT !");
        }
    }


    public void updateContact(){
        System.out.println("*--SỬA THÔNG TIN DANH BẠ--*");
        System.out.println("Nhập số ĐT cần sửa(xxx.xxx.xxxx): ");
        boolean check = false;
        String phoneNumber = sc.nextLine();
        for (Contact ct: contactDB.contactList) {
            if(ct.getPhoneNumber().equals(phoneNumber)){
                check = true;
                ct.setContactGroup(inputContactGroup());
                ct.setFullName(inputName());
                ct.setDob(inputDOB());
                ct.setGender(inputGender());
                ct.setAddress(inputAddress());
                ct.setEmail(inputEmail());
                displayHeader();
                ct.displayContact();
                writeToFile();
                System.out.println("Bạn vừa cập nhật <"+ct.getFullName()+"> thành công !");

            }
        }
        if(!check){
            System.out.println("Không tìm thấy số ĐT !");
        }
    }



    public void addContact() {
        System.out.println("*--THÊM MỚI DANH BẠ--*");
        String phoneNumber = inputPhoneNumber();
        String name = inputName();
        String contactGroup = inputContactGroup();
        String gender = inputGender();
        String dob = inputDOB();
        String address = inputAddress();
        String email = inputEmail();
        Contact contact = new Contact(0,phoneNumber,contactGroup,name,gender,dob,address,email);
        contactDB.contactList.add(contact);
        displayHeader();
        contact.displayContact();
        writeToFile();
        System.out.println("Bạn vừa thêm <"+name+"> vào danh bạ !");


    }

    public void displayContactList() {

        int size = contactDB.contactList.size();
        if(size == 0){
            System.out.println("Danh bạ trống!");
        }else {
            displayHeaderNonEmail();
            for (int i = 0; i < size; i++) {
                if(i==0 || (i)%5 != 0 ){
                    contactDB.contactList.get(i).displayContactNonEmail();
                }else {
                    System.out.print("Nhấn enter để xem tiếp... ");
                    switch (sc.nextLine()){
                        case "":
                            displayHeaderNonEmail();
                            contactDB.contactList.get(i).displayContactNonEmail();
                            break;
                        default:
                            return;
                    }
                }
            }
        }
    }

    public String inputPhoneNumber(){
        String phoneNumber;
        do{
            System.out.println("Nhập số ĐT(xxx.xxx.xxxx): ");
            phoneNumber = sc.nextLine();
        }while (!checkPhoneNumber(phoneNumber) || checkPhoneNumberExists(phoneNumber));

        return phoneNumber;
    }


    public boolean checkPhoneNumberExists(String phoneNumber){
        for (Contact ct: contactDB.contactList) {
            if(ct.getPhoneNumber().equals(phoneNumber)){
                System.out.println("Đã tồn tại số ĐT này trong danh bạ !");
                return true;
            }
        }
        return false;
    }


    public boolean checkPhoneNumber(String phoneNumber){
        String regex = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])+.+[0-9]{3}+.+[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.find()? true:false;
    }

    public String inputName(){
        String name;
        do{
            System.out.println("Nhập tên:  ");
            name = toUpperCase(sc.nextLine());
        }while (!checkName(name));

        return name;
    }

    public boolean checkName(String name){
        String regex = "^[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶẸẺẼỀỀỂẾưăạảấầẩẫậắằẳẵặẹẻẽềềểếỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s\\W|_]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.find()? true:false;
    }

    public String inputContactGroup(){
        System.out.println("Nhập nhóm danh bạ:  ");
        String contactGroup = toUpperCase(sc.nextLine());
        return contactGroup;
    }

    public String inputGender(){
        System.out.println("Nhập giới tính:  ");
        String gender = toUpperCase(sc.nextLine());
        switch (gender){
            case "Nam":
            case "Male":
                gender = "Male";
                break;
            case "Nu":
            case "Nữ":
            case "Fimale":
                gender = "Fimale";
                break;
            case "Khac":
            case "Khác":
            case "Other":
                gender = "Other";
                break;
            default:
                inputGender();
        }
        return gender;
    }

    public String inputDOB(){
        String dob;
        do {
            System.out.println("Nhập ngày sinh: ");
            dob = sc.nextLine();
        }while (!checkDOB(dob));
        return dob;
    }


    public boolean checkDOB(String dob){
        String regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/1|2[0-9]{3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dob);
        return matcher.find()? true:false;
    }

    public String inputAddress(){
        System.out.println("Nhập địa chỉ: ");
        String address = toUpperCase(sc.nextLine());
        return address;
    }

    public String inputEmail(){
        String email;
        do{
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if(checkEmailExists(email)){
                System.out.println("* Bạn muốn thêm email này ! *");
                System.out.println("Y(tiếp tục) / khác(bỏ qua)");
                switch (toUpperCase(sc.nextLine())){
                    case "Y":
                        break;
                    default:
                        inputEmail();
                }
            }
        }while (!checkEmail(email));

        return email;
    }

    public boolean checkEmailExists(String email){
        for (Contact ct: contactDB.contactList) {
            if(ct.getEmail().equals(email) ){
                System.out.println("Đã tồn tại email !");
                return true;
            }
        }
        return false;
    }


    public boolean checkEmail(String email){
        String regex = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}+(([\\w+mail]|[outlook]+.com)|codegym.vn)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find()? true:false;
    }

    public String toUpperCase(String string){
        char[] charArray = string.toCharArray();
        boolean foundSpace = true;
        for(int i = 0; i < charArray.length; i++) {
            charArray[i] = Character.toLowerCase(charArray[i]);
            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }
            else {
                foundSpace = true;
            }
        }
        String outputString = String.valueOf(charArray);
        return outputString;
    }

    public String toLowerCase(String string) {
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++)
            charArray[i] = Character.toLowerCase(charArray[i]);

        String outputString = String.valueOf(charArray);
        return outputString;

    }



    public void displayHeader(){
        System.out.printf("|  %12s | %20s | %30s | %10s | %11s | %30s | %25s  |","Số ĐT","Nhóm danh bạ","Họ tên","Giới tính","Ngày sinh","Địa chỉ","Email");
        System.out.println();
    }

    public void displayHeaderNonEmail(){
        System.out.printf("|  %12s | %20s | %30s | %10s | %11s | %30s  |","Số ĐT","Nhóm danh bạ","Họ tên","Giới tính","Ngày sinh","Địa chỉ");
        System.out.println();
    }


}

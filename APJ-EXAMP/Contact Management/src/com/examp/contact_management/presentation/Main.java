package com.examp.contact_management.presentation;

import com.examp.contact_management.service.ContactService;

import java.util.Scanner;

public class Main {
    static Main main = new Main();
    static ContactService contactService = new ContactService();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        contactService.loadFromFile();
        main.status();
        main.chooseMenu();


    }

    public void status(){
        System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ-----");
        System.out.println("Chọn chức năng theo số (để tiếp tục): ");
    }

    public void displayMenu(){
        System.out.println("\t1. Xem danh sách");
        System.out.println("\t2. Thêm mới");
        System.out.println("\t3. Cập nhật");
        System.out.println("\t4. Xóa");
        System.out.println("\t5. Tìm kiếm");
        System.out.println("\t6. Đọc từ file");
        System.out.println("\t7. Ghi vào file");
        System.out.println("\t8. Thoát");
        System.out.println("--------------------------------------");

    }

    public void chooseMenu(){

        displayMenu();
        System.out.println("Chọn chức năng: ");
        String choose = sc.nextLine();

        switch (choose){
            case "1":
                contactService.displayContactList();
                chooseYN();
                break;
            case "2":
                contactService.addContact();
                chooseYN();
                break;
            case "3":
                contactService.updateContact();
                chooseYN();
                break;
            case "4":
                contactService.deleteContact();
                chooseYN();
                break;
            case "5":
                contactService.searchContact();
                chooseYN();
                break;
            case "6":
                contactService.readFromFile();
                chooseYN();
                break;
            case "7":
                contactService.writeToFile();
                System.out.println("Danh bạ vừa được cập nhật !");
                chooseYN();
                break;
            case "8":
                System.exit(0);
            default:
                System.out.println("Nhập sai !");
                chooseMenu();
        }
    }

    public void chooseYN(){
        System.out.println("--------------------------------------");
        System.out.println("Chọn Y(tiếp tục) / N(thoát):");
        String chooseYN;
        do{
            chooseYN = sc.nextLine();
            switch (contactService.toUpperCase(chooseYN)){
                case "Y":
                    chooseMenu();
                    break;
                case "N":
                    System.out.println("Thoát");
                    System.exit(0);
                default:
                    chooseYN();
            }
        }while (true);
    }
}

package com.examp.contact_management.dal;

import com.examp.contact_management.model.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDB {

    final String CONTACT_FILE ="D:\\CODEGYM\\MODUNLE2\\APJ-EXAMP\\Contact Management\\data\\contact.csv";
    File file = new File(CONTACT_FILE);
    public List<Contact> contactList = new ArrayList<>();
    int countContact = 0;

    public void write(){
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(CONTACT_FILE));
            countContact = 0;
            for (Contact ct:contactList) {
                if(countContact == 0){
                    bufferedWriter.write(ct.toStringHeaderCSV());
                }
                ct.setRollNo(++countContact);
                bufferedWriter.write(ct.toStringCSV());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bufferedWriter != null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void read(){

        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(CONTACT_FILE));
            String line ;
            while ((line = bufferedReader.readLine()) != null){
                if(line.isEmpty() || (line.contains("STT")&&line.contains("Họ tên")&&line.contains("Số ĐT"))&&line.contains("Nhóm Danh Bạ")){
                    continue;
                }

                String[] arr = line.split(",");
                Contact contact = new Contact(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7]);
                add(contact);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void add(Contact contact){
        contact.setRollNo(++countContact);
        contactList.add(contact);
    }

}

package com.nam.demo.abtract;

public class TestDemo {
    public static void main(String[] args) {
        NhanVienFull sep = new NhanVienFull("SEP",Configs.SEP,3);
        NhanVienFull linh = new NhanVienFull("LINH",Configs.LINH,5);
        NhanVienPartTime tam = new NhanVienPartTime("PART-TIME",200);

        sep.xuatThongTin();
        linh.xuatThongTin();
        tam.xuatThongTin();

        NhanVienFull sep1 = new NhanVienFull("SEP1",Configs.SEP,10);
        NhanVienFull linh1 = new NhanVienFull("LINH1",Configs.LINH,4);
        NhanVienPartTime tam1 = new NhanVienPartTime("PART-TIME1",100);

        sep1.xuatThongTin();
        linh1.xuatThongTin();
        tam1.xuatThongTin();
    }
}

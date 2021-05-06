package com.nam.demo.abtract;

public abstract class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien(){}
    public NhanVien(String ten) {
        this.ten = ten;
    }
    protected abstract String loaiNhanVien();
    public abstract void tinhLuong();
    public void xuatThongTin(){
        tinhLuong();
        System.out.println("Ten: "+this.ten
                            +"\nLuong: "+this.luong);
    }
}

package com.library.model;

public class SachThamKhao extends Sach {
    private double thanhTien;
    private double thue;



    public SachThamKhao(int stt, String maSach, String tenSach, String nhaXuatBan, String theLoai, double gia, int soLuong, double thue, double thanhTien) {
        super(stt, maSach, tenSach, nhaXuatBan, theLoai, gia, soLuong);
        this.thanhTien = thanhTien;
        this.thue = thue;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public String toString(){
        return super.toString()+","+thue+","+thanhTien+"\n";
    }
}

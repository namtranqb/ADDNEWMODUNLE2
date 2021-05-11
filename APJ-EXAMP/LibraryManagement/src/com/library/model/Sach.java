package com.library.model;

public class Sach {
    private int stt;
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private String theLoai;
    private double gia;
    private int soLuong;

    public Sach() {
    }

    public Sach(int stt, String maSach, String tenSach, String nhaXuatBan, String theLoai, double gia, int soLuong) {
        this.stt = stt;
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.theLoai = theLoai;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString(){
        return stt+","+maSach+","+tenSach+","+nhaXuatBan+","+theLoai+","+gia+","+soLuong;
    }
}

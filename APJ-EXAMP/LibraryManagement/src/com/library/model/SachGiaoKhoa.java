package com.library.model;

public class SachGiaoKhoa extends Sach {
    private String tinhTrang;
    private double thanhTien;

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public SachGiaoKhoa(int stt, String maSach, String tenSach, String nhaXuatBan, String theLoai, double gia, int soLuong, String tinhTrang) {
        super(stt, maSach, tenSach, nhaXuatBan, theLoai, gia, soLuong);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString(){
        return super.toString()+","+tinhTrang+","+thanhTien+"\n";
    }
}

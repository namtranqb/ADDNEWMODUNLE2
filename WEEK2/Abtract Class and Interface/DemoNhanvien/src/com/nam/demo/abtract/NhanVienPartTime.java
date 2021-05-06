package com.nam.demo.abtract;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec) {
        super(ten);
        this.gioLamViec = gioLamViec;
    }


    @Override
    protected String loaiNhanVien() {
        return "PART-TIME";
    }

    @Override
    public void tinhLuong() {
        this.luong = this.gioLamViec * Configs.LAMTHEMGIO;
    }
}

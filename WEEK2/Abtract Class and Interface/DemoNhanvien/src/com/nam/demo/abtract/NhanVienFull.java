package com.nam.demo.abtract;

public class NhanVienFull extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;


    public NhanVienFull(String ten, int loaiChucVu, int ngayLamThem) {
        super(ten);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }
    @Override
    protected String loaiNhanVien(){
        return (loaiChucVu==Configs.SEP)? "FULLTIME-SEP":"FULLTIME-LINH";
    }
    @Override
    public void tinhLuong(){
        switch (loaiNhanVien()){
            case "FULLTIME-SEP":{
                this.luong = Configs.LUONGSEP + this.ngayLamThem * Configs.LAMTHEMNGAY;
                break;
            }
            case "FULLTIME-LINH":{
                this.luong = Configs.LUONGLINH + this.ngayLamThem * Configs.LAMTHEMNGAY;
                break;
            }
        }
    }
}

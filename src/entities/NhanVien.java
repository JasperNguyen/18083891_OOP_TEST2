
package entities;

import core.NgayThang;


public abstract class NhanVien{

    public NhanVien(String maNhanVien, String hoTen, NgayThang ngayThangNamSinh) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.ngayThangNamSinh = ngayThangNamSinh;
    }

    public NhanVien() {
        this.maNhanVien = "";
        this.hoTen = "";
        this.ngayThangNamSinh = new NgayThang(01,01,2021);
    }
    
    // Kiem tra xem co phai la lao dong tien tien khong
    public abstract Boolean isLaoDongTienTien();

    @Override
    public String toString() {
        return String.format(
                "Ma nhan vien: %s\n"
                    + "Ho ten: %s\n"
                    + "Ngay thang nam sinh: %s",
                this.maNhanVien, this.hoTen, this.ngayThangNamSinh);
    }
    
    protected String maNhanVien, hoTen;
    protected NgayThang ngayThangNamSinh;
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    
    public String getMaNhanVien() {
        return maNhanVien;
    }
    
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public NgayThang getNgayThangNamSinh() {
        return ngayThangNamSinh;
    }
    
    public void setNgayThangNamSinh(NgayThang ngayThangNamSinh) {
        this.ngayThangNamSinh = ngayThangNamSinh;
    }
    
    //</editor-fold>
}

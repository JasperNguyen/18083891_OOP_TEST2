
package entities;

import core.NgayThang;

// 18083891 Nguyen Quoc Tuan
public class NhanVienVanPhong extends NhanVien{

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public NhanVienVanPhong(
            Integer soLuongLopBoiDuongChuyenMon,
            Integer soGioLaoDongCongIch,
            String maNhanVien,
            String hoTen,
            NgayThang ngayThangNamSinh)
    {
        super(maNhanVien, hoTen, ngayThangNamSinh);
        this.soLuongLopBoiDuongChuyenMon = soLuongLopBoiDuongChuyenMon;
        this.soGioLaoDongCongIch = soGioLaoDongCongIch;
    }
    
    public NhanVienVanPhong(
            Integer soLuongLopBoiDuongChuyenMon,
            Integer soGioLaoDongCongIch)
    {
        this.soLuongLopBoiDuongChuyenMon = soLuongLopBoiDuongChuyenMon;
        this.soGioLaoDongCongIch = soGioLaoDongCongIch;
    }
    
    public NhanVienVanPhong() {
        this.soLuongLopBoiDuongChuyenMon = 0;
        this.soGioLaoDongCongIch = 0;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Method">
    
    @Override
    public Boolean isLaoDongTienTien() {
        // Nhân viên văn phòng: tham gia ít nhất 1 lớp bồi dưỡng và ít nhất 20 giờ lao động công ích.
        return
                this.soLuongLopBoiDuongChuyenMon >= 1 // tham gia ít nhất 1 lớp bồi dưỡng.
                && this.soGioLaoDongCongIch >= 20; // ít nhất 20 giờ lao động công ích.
    }
    
    @Override
    public String toString() {
        return String.format(
                "%s \n" // Goi phuong thuc toString o lop cha (1)
                        + "So luong lop boi duong chuyen mon da tham gia: %s (lop) \n"
                        + "So gio tham gia lao dong cong ich: %s (gio) \n",
                
                super.toString(), // Goi phuong thuc toString o lop cha (1)
                this.soLuongLopBoiDuongChuyenMon,
                this.soGioLaoDongCongIch);
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="variable declare">
    private Integer
            soLuongLopBoiDuongChuyenMon,
            soGioLaoDongCongIch;
    //</editor-fold>

    
    //<editor-fold defaultstate="collapsed" desc="Public properties">
    public Integer getSoLuongLopBoiDuongChuyenMon() {
        return soLuongLopBoiDuongChuyenMon;
    }
    
    public void setSoLuongLopBoiDuongChuyenMon(Integer soLuongLopBoiDuongChuyenMon) {
        this.soLuongLopBoiDuongChuyenMon = soLuongLopBoiDuongChuyenMon;
    }
    
    public Integer getSoGioLaoDongCongIch() {
        return soGioLaoDongCongIch;
    }
    
    public void setSoGioLaoDongCongIch(Integer soGioLaoDongCongIch) {
        this.soGioLaoDongCongIch = soGioLaoDongCongIch;
    }
    //</editor-fold>

    
}

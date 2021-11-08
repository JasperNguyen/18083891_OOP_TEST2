
package entities;

import core.NgayThang;


public class NghienCuuVien extends NhanVien{

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    public NghienCuuVien(
            Integer soLuongDeTaiNghienCuu,
            Integer soLuongBaiBaoKhoaHoc,
            String maNhanVien,
            String hoTen,
            NgayThang ngayThangNamSinh)
    {
        super(maNhanVien, hoTen, ngayThangNamSinh);
        this.soLuongDeTaiNghienCuu = soLuongDeTaiNghienCuu;
        this.soLuongBaiBaoKhoaHoc = soLuongBaiBaoKhoaHoc;
    }
    
    public NghienCuuVien(
            Integer soLuongDeTaiNghienCuu,
            Integer soLuongBaiBaoKhoaHoc)
    {
        this.soLuongDeTaiNghienCuu = soLuongDeTaiNghienCuu;
        this.soLuongBaiBaoKhoaHoc = soLuongBaiBaoKhoaHoc;
    }
    
    public NghienCuuVien()
    {
        this.soLuongDeTaiNghienCuu = 0;
        this.soLuongBaiBaoKhoaHoc = 0;
    }  
    
    //</editor-fold>
    
    @Override
    public Boolean isLaoDongTienTien() {
        // Nghiên cứu viên: tham gia ít nhất 1 đề tài nghiên cứu và có ít nhất 2 bài báo khoa học.
        return 
                this.soLuongDeTaiNghienCuu >= 1 // Tham gia ít nhất 1 đề tài nghiên cứu 
                && this.soLuongBaiBaoKhoaHoc >= 2; // Có ít nhất 2 bài báo khoa học.
    }

    @Override
    public String toString() {
        return String.format("%s\n"
                + "So de tai nghien cuu: %s(de tai) \n"
                + "So bai bao khoa hoc: %s(bai bao)", 
                super.toString(), 
                this.soLuongDeTaiNghienCuu, 
                this.soLuongBaiBaoKhoaHoc);
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Variables declare">
    private Integer
            soLuongDeTaiNghienCuu,
            soLuongBaiBaoKhoaHoc;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    public Integer getSoLuongDeTaiNghienCuu() {
        return soLuongDeTaiNghienCuu;
    }
    
    public void setSoLuongDeTaiNghienCuu(Integer soLuongDeTaiNghienCuu) {
        this.soLuongDeTaiNghienCuu = soLuongDeTaiNghienCuu;
    }
    
    public Integer getSoLuongBaiBaoKhoaHoc() {
        return soLuongBaiBaoKhoaHoc;
    }
    
    public void setSoLuongBaiBaoKhoaHoc(Integer soLuongBaiBaoKhoaHoc) {
        this.soLuongBaiBaoKhoaHoc = soLuongBaiBaoKhoaHoc;
    }
    //</editor-fold>

    
}

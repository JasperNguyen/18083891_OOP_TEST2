
package entities;

import core.NgayThang;

public class GiangVien extends NhanVien{

    //<editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * @param soTietGiangDayTrongNam
     * @param soDeTaiKhoaLuan
     * @param maNhanVien
     * @param hoTen
     * @param ngayThangNamSinh
     */
    public GiangVien(Integer soTietGiangDayTrongNam, Integer soDeTaiKhoaLuan, String maNhanVien, String hoTen, NgayThang ngayThangNamSinh) {
        super(maNhanVien, hoTen, ngayThangNamSinh);
        this.soTietGiangDayTrongNam = soTietGiangDayTrongNam;
        this.soDeTaiKhoaLuan = soDeTaiKhoaLuan;
    }
    
    /**
     * @param soTietGiangDayTrongNam
     * @param soDeTaiKhoaLuan
     */
    public GiangVien(Integer soTietGiangDayTrongNam, Integer soDeTaiKhoaLuan) {
        this.soTietGiangDayTrongNam = soTietGiangDayTrongNam;
        this.soDeTaiKhoaLuan = soDeTaiKhoaLuan;
    }
    
     public GiangVien() {
        this.soTietGiangDayTrongNam = 0;
        this.soDeTaiKhoaLuan = 0;
    }
    
    //</editor-fold>
    
    @Override
    public Boolean isLaoDongTienTien() {
        // Giảng viên: giảng dạy ít nhất 300 tiết và hướng dẫn ít nhất 5 khóa luận
        return 
                this.soTietGiangDayTrongNam >= 300
                && this.soDeTaiKhoaLuan >= 5;
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "So tiet giang day trong nam: %s\n"
                + "So de tai khoa luan: %s\n"
                , super.toString(), this.soTietGiangDayTrongNam, this.soDeTaiKhoaLuan);
    }
    
    private Integer soTietGiangDayTrongNam;
    private Integer soDeTaiKhoaLuan;
    
    //<editor-fold defaultstate="collapsed" desc="Properties">
    public Integer getSoTietGiangDayTrongNam() {
        return soTietGiangDayTrongNam;
    }
    
    public void setSoTietGiangDayTrongNam(Integer soTietGiangDayTrongNam) {
        this.soTietGiangDayTrongNam = soTietGiangDayTrongNam;
    }
    
    public Integer getSoDeTaiKhoaLuan() {
        return soDeTaiKhoaLuan;
    }
    
    public void setSoDeTaiKhoaLuan(Integer soDeTaiKhoaLuan) {
        this.soDeTaiKhoaLuan = soDeTaiKhoaLuan;
    }
    //</editor-fold>
    
}


package core;

import entities.GiangVien;
import entities.NghienCuuVien;
import entities.NhanVien;
import entities.NhanVienVanPhong;

// 18083891 Nguyen Quoc Tuan
public class QLNV extends Input{
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    
    public QLNV(NhanVien[] danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
    
    public QLNV() {
        danhSachNhanVien = new NhanVien[0];
    }
    
    //</editor-fold>
    
    
    
    
    private NhanVien nhapThongTinCanBanCuaNhanVien(NhanVien nhanVien){
        nhanVien.setHoTen(
                super.nextStr("Nhap ho ten nhan vien: ")
        );
        
        nhanVien.setMaNhanVien(
                super.nextStr("Nhap ma nhan vien: ")
        );
        
        nhanVien.setNgayThangNamSinh(
                super.nextDate("Nhap ngay thang nam sinh: ")
        );
        return nhanVien;
    }
    
    private GiangVien nhapThongTinGiangVien(NhanVien nhanVien){
        GiangVien giangVien =  (GiangVien)nhanVien;
        
        this.nhapThongTinCanBanCuaNhanVien(giangVien);
        
        giangVien.setSoTietGiangDayTrongNam(
                super.nextInt("Nhap so tiet giang day trong nam: ")
        );
        
        giangVien.setSoDeTaiKhoaLuan(
                super.nextInt("Nhap so de tai khoa luan: ")
        );
        
        return giangVien;
    }
    
    private NghienCuuVien nhapThongTinNghienCuuVien(NhanVien nhanVien){
        NghienCuuVien nghienCuuVien = (NghienCuuVien)nhanVien;
        
        this.nhapThongTinCanBanCuaNhanVien(nghienCuuVien);
        
        nghienCuuVien.setSoLuongDeTaiNghienCuu(
                super.nextInt("Nhap so luong de tai nghien cuu: ")
        );
        
        nghienCuuVien.setSoLuongBaiBaoKhoaHoc(
                super.nextInt("Nhap so luong bai bao khoa hoc: ")
        );
        
        return nghienCuuVien;
    }
    
    private NhanVienVanPhong nhapThongTinNhanVienVanPhong(NhanVien nhanVien){
        NhanVienVanPhong nhanVienVanPhong = (NhanVienVanPhong)nhanVien;
        
        this.nhapThongTinCanBanCuaNhanVien(nhanVienVanPhong);
        
        nhanVienVanPhong.setSoLuongLopBoiDuongChuyenMon(
                super.nextInt("Nhap so luong lop boi duong chuyen mon: ")
        );
        
        nhanVienVanPhong.setSoGioLaoDongCongIch(
                super.nextInt("Nhap so gio lao dong cong ich: ")
        );
        
        return nhanVienVanPhong;
    }
    
    private Integer getLoaiNhanVien(){
        while(true){
            String loaiNhanVien = super.nextStr("Nhap loai nhan vien muon them: ");
            
            switch(loaiNhanVien){
                case "GV":
                case "Giang Vien": {
                    return 0;
                }

                case "NCV":
                case "Nghien Cuu Vien":{
                    return 1;
                }

                case "NVVP":
                case "Nhan Vien Van Phong":{
                    return 2;
                }
                
                case "Thoat":
                    return 3;
            }
            
            System.out.println("Ban can nhap [ (GV|Giang Vien) (NCV|Nghien Cuu Vien) (NVVP|Nhan Vien Van Phong) (Thoat)] !!!");
        }
    }
    
    // Vi chua hoc list, ArrayList nen se su dung mang de thay the
    
    public void themNhanVien(NhanVien nhanVien){
        // Tao ra mang tam co so luong phan tu bang so luong phan tu cua danhSachNhanVien + 1
        NhanVien tmp[] = new NhanVien[this.danhSachNhanVien.length + 1];
        
        tmp[0] = nhanVien;
        
        // Sao chep cac phan tu tu danhSachNhanVien => tmp
        for(int i = 1; i < tmp.length; i++){
            tmp[i] = danhSachNhanVien[i - 1];
        }
        
        // Gan lai
        this.danhSachNhanVien = tmp;
    }
    
    public void nhap(){
        while(true){
            NhanVien nhanVien;
            
            switch(getLoaiNhanVien()){
                case 0:{ // Giang vien
                    nhanVien = new GiangVien();
                    this.nhapThongTinGiangVien(nhanVien);
                    this.themNhanVien(nhanVien);
                    break;
                }
                case 1: { // Nghien cuu vien
                    nhanVien = new NghienCuuVien();
                    this.nhapThongTinNghienCuuVien(nhanVien);
                    this.themNhanVien(nhanVien);
                    break;
                }
                
                case 2: { // Nhan vien van phong
                    nhanVien = new NhanVienVanPhong();
                    this.nhapThongTinNhanVienVanPhong(nhanVien);
                    this.themNhanVien(nhanVien);
                    break;
                }
                
                case 3: { // Thoat
                    return;
                }
                
                default: {
                    System.err.println("Gia tri tra ve tu ham getLoaiNhanVien khong hop le");
                    return;
                }
            }
            
            System.out.println("\n=============\n");
        }
    }
    
    public void xuat(){
        for(NhanVien nhanVien: danhSachNhanVien){
            if(nhanVien.isLaoDongTienTien()){
                System.out.println("\n");
                System.out.println(nhanVien);
            }
        }
    }
    
    // Variables declare
    private NhanVien[] danhSachNhanVien;
}

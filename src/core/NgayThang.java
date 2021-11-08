
package core;


import java.sql.Date;


// 18083891 Nguyen Quoc Tuan
public class NgayThang extends Date{
        
    public NgayThang() {
        super(2021, 9, 1);
    }
    
    public NgayThang(int dd, int mm, int yy) {
        super(yy, mm-1, dd);
    }
    
    public NgayThang(Long time){
        super(time);
    }

    @Override
    public String toString() {
        return "Ngay " + super.getDate()
            + " Thang " + (super.getMonth() + 1)
            + " Nam " + super.getYear();
    }
}

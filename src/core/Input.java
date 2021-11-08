
package core;

import java.util.Scanner;

/**
 * 
 */
public abstract class Input {

    protected Input() {
        this.scan = new Scanner(System.in);
    }
    
    private boolean isInteger(String val){
        try{
            Integer.parseInt(val);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
    
    protected String nextStr(String mess){
        System.out.print(mess);
        return scan.nextLine();
    }
    
    protected Integer nextInt(String mess){
        while(true){
            String tmp = this.nextStr(mess);
            
            if(this.isInteger(tmp)){
                return Integer.parseInt(tmp);
            }
            
            System.out.println("    ERROR: Gia tri ban vua nhap vao khong phai la so!");
        }
    }
    
    protected NgayThang nextDate(String mess){
        while(true){
            String tmp[] = this.nextStr(mess).split("-");
            if(tmp.length == 3){
                
                Boolean a = true;
                
                for(String item: tmp){
                    if(!this.isInteger(item)){
                        a = false;
                    }
                }
                
                if(a){
                    return new NgayThang(Integer.parseInt(tmp[0]),  Integer.parseInt(tmp[1]), Integer.parseInt(tmp[2]));
                }
            }
            
            System.out.println("    ERROR: Ngay thang nam nhap vao khong dung voi dinh dang (dd-mm-yy)!");
        }
    }
    
    private final Scanner scan;
    
    protected Scanner getScanner(){
        return this.scan;
    }
}

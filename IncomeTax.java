
package incometax;

import java.util.Scanner;


public class IncomeTax {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ctc ;
        System.out.println("enter your ctc=");
        ctc=sc.nextInt();
        if(ctc <= 180000 && ctc >0){
        System.out.println("tax payable= nil");
        
        }else if(ctc>181001 && ctc<=300000){
        System.out.println("tax payable=" +(ctc/10));
        } else if(ctc>300001 && ctc<=500000){
          
            System.out.println("tax payable=" +(ctc/20));
        }
    }
    
}

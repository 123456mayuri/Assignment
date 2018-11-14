
package marks;

import java.util.Scanner;

public class Marks {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int marks[] = new int[3];
        System.out.println("enter all three subject marks=");
        for(int i=0;i<3;i++){
        marks[i]=sc.nextInt();
        }
        int total=marks[0]+marks[1]+marks[2];
        int result = total/3;
        for (int i=0;i<3;i++){
            if(marks[i]>60){
                System.out.println("passed");
            }
            
                
        }
        
        
        
        }
        
         
    }
    


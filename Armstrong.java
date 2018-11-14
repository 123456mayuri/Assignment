import java.util.*
class Armstrong{
public static void main(String args[]){
int rem;
int num;
int result=0;
 Scanner scanner=new Scanner(System.in);
System.out.println("Enter number");

 num=scanner.nextInt();

while(num>0){
rem=num%10;
num=num/10;
result=result+(rem*rem*rem);

if(num==result){
System.out.println("number is armstrong");
}
else{
System.out.println("number is not armstrong");

}
}}
}
import java.util.Scanner;
 public class Prime {
 public static void main(String[] args){
 int n,i,c=0;
 Scanner input = new Scanner(System.in);
 System.out.println("enter number u want to chek");
 n=input.nextInt();
 for(i=2;i<=(n/2);++i){
	if(n%i==0)
	c=c+1;
	}
 if(c==0)
  System.out.println("number is prime");

 else if(c>0)
   System.out.print("number is not prime");
 }
}

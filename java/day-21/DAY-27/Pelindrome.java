import java.util.Scanner;
public class Pelindrome{
public static void main(String[] args){
    int rem,sum=0,n,temp;
    Scanner input=new Scanner(System.in);
    System.out.print("enter the number for check");
    n=input.nextInt();
    temp=n;
    while(n>0){
        rem=n%10;
        sum=(sum*10)+rem;
        n=n/10;
    }
    if(sum==temp)
    System.out.print("the number u entered is pellindrome");
    else
    System.out.print("the number u entered is not  pellindrome");


   }
}

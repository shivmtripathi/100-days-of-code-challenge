import java.util.Scanner;
public class Linear{
 public static void main(String[] args){
	int n,n1,i,c=0;
	int a[];
	Scanner input= new Scanner(System.in);
	System.out.print("enter the size of array");
	n=input.nextInt();
	a=new int[n];
	System.out.print("enter the numbers");
	for(i=0;i<n;i++){

	a[i]=input.nextInt();

          }
	System.out.print("enter the number u want to search in array");
	n1=input.nextInt();
	for(i=0;i<=a.length;++i){
	if( a[i]==n1){
	++c;
	break;
	}
	
	}
	if(c==1)
	System.out.print(n1 + " is present at location " + (i + 1) + ".");
	else
	System.out.print("number is not present in array");
}
}

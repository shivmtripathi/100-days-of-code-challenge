import java.util.Scanner;
public class Power {
   
    public static void main(String[] args) {
        Scanner readme = new Scanner(System.in);
      int power=1000000,t,c;
      System.out.println("your initial power is = \n" + power);
      System.out.println("after how many second you want to check power ");
      t= readme.nextInt();
       Update_power(power, t);
       

    }

     public static void Update_power(int power, int t) {
        int n=10000;
        power=(power-(n*t));
        System.out.println("your updated power is = \n" + power);
 
       
    }
}
 
 

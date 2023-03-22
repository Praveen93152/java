import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean w=true;
        int e=1;
        while(e==1) {
            System.out.print("enter a number you want to check prime or not:");
            int q = input.nextInt();
            if(q==0||q==1)
                w=false;
            else{
                for (int i = 2; i < q; i++) {
                    if (q % i == 0) {
                        w = false;
                        break;
                    }
                }
            }
            if (w == true) {
                System.out.println(q + "is a prime number");
            } else
                System.out.println(q + " is not a prime number");
            System.out.print("do yo want repeat again press 1 for yes any othet numer for no:");
            e=input.nextInt();
        }
    }
}

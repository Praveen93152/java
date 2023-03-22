import java.util.Scanner;
class fact{
    int fact(int x){
        int a=1;
        for(int i=1;i<=x;i++){
             a*=i;
        }
        return a;

    }

}
class factorial{
public static void main(String[]args){
    Scanner input=new Scanner(System.in);
    int t=1;
    while(t==1) {
        System.out.print("which no you want factorial:");
        int s = input.nextInt();
        fact r = new fact();
        System.out.println("factorial of a number is:" + r.fact(s));
        System.out.print("do uou want a factorial of another no press 1 for yes and any other no means no: ");
        t= input.nextInt();
    }
}
        }
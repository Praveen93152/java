import java.util.*;
    class logic{
      void logic1(int a, int b) {
      if(a==b)
          System.out.println("DRAW.........");
      else if (a==1&&b==2||a==2&&b==3||a==3&&b==1)
          System.out.println("WIN THE MATCH.......");
       else
          System.out.println("LOSS THE MATCH.......");

          if(a==1){
              System.out.println("Computer choice: Scissor");
          }
          else if(a==2){
              System.out.println("Computer choice: rock");
          }
          else if(a==3){
              System.out.println("Computer choice: Paper");
          }
          if(b==1){
              System.out.println("your choice: Scissor");
          }
          else if(b==2){
              System.out.println("your choice: rock");
          }
          else if(b==3){
              System.out.println("your choice: Paper");
          }
      }
    }
    public class game {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Random r=new Random();
        logic j=new logic();
        int i=1;
        while (i==1){
            System.out.print("1.scissor\n2.stone\n3.paper\nenter your choice:");
            int ui=s.nextInt();
            int cgn=r.nextInt(1,4);
            j.logic1(cgn,ui);
            System.out.print("\nif yo want repeat game the game press 1 otherwise press any other number:");
            i=s.nextInt();
        }
    }
}

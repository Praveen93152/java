import java.util.*;
class setting{
     void issueingbooks(ArrayList<String> x) {
         System.out.print("enter a book name:");
         Scanner b=new Scanner(System.in);
         String m = b.nextLine();
         x.add(m);
         System.out.println("your book is added");
     }
     void returnbooks(ArrayList<String> y){
      System.out.print("enter the name of the book you want to return: ");
      Scanner c=new Scanner(System.in);
      String f = c.nextLine();
      y.remove(f);
      System.out.println("your book is removed");
     }
   void showbooks(ArrayList<String> z){
       for (int u = 0;u < z.size(); u++)
         System.out.println(z.get(u));
   }
}

class library {
        public static void main(String[] args) {
        ArrayList<String> lib= new ArrayList<>(30);
        setting jh=new setting();
        Scanner a=new Scanner(System.in);
        int p=1;
        while(p==1) {
            System.out.print("1.add books\n2.remove books\n3.show all books in lib\nenter your choose:");
            int i = a.nextInt();
            switch (i) {

               case 1: {
                   jh.issueingbooks(lib);
                    break;
                }
               case 2: {
                   jh.returnbooks(lib);
                   break;
                }
                case 3: {
                    jh.showbooks(lib);
                    break;
                }
            }
            System.out.print("do yo want repeat again press 1 for yes any othet numer for no:");
            p=a.nextInt();
        }
    }
}


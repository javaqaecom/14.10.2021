import java.util.Scanner;

public class function5 {


   static String zogiOrNot(int x){

       if (x%2==0)
           return "zogi";
       else
           return "ei zogi";
    }
    public static void main(String[] args) {

        Scanner hodi = new Scanner(System.in);
        int x = hodi.nextInt();
        System.out.println(zogiOrNot(x));

    }
}

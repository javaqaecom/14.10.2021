import java.util.Arrays;
import java.util.Scanner;

public class GRA {

    static void p(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner maria = new Scanner(System.in);
        p("please enter the number of students that your have in the class");
        int arraySize=maria.nextInt();
        int [] grades= new int[arraySize];

        for(int i=0;i < grades.length;i++) {
            p("please enter the grade");
            grades[i]=maria.nextInt();
        }

        for (int grade:grades) {
            if (grade>75){
                p("pass");
            }
            else
                p("fail");
        }
        p(Arrays.toString(grades));


    }
}

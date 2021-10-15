import java.util.Scanner;

public class finction2 {

    static void printInfo(){
        Scanner sc1= new Scanner(System.in);
        String fName,lName;
        int age;
        System.out.println("your name is : ");
        fName = sc1.next();
        System.out.println("your last name is : ");
        lName = sc1.next();
        System.out.println("your age is : ");
        age = sc1.nextInt();
        System.out.println("Hi "+fName+" "+lName+" your age is : "+age);
    }// פונקציה קולטת שם וגיל ומדפיסה אןתם מסודר

    public static void main(String[] args) {

        for (int i=0;i<1000;i++){

            printInfo();
        }//לולאה רצה  1000 פעם וקוראת ל פונקציה printInfo

    }
}

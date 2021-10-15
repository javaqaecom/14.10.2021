public class overloadFunc {

    static int div(int x,int y){
        return x/y;
    }
    static double div (double number1,double number2){
        return number1/number2;
    }
    public static void main(String[] args) {

        System.out.println(div(15,4));
        System.out.println(div(15.0,4));
    }
}

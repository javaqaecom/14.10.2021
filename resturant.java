import java.util.Arrays;

public class resturant {

    public static void main(String[] args) {
        String [] menu = {"flafel", "pizza ","sushi","alfrdo pasta", "kaaaabab","rips", "chips"};
        System.out.println(Arrays.toString(menu));

        for(String r: menu ){
            if (r.length()>5){
                System.out.print(150);
                System.out.print(",");
            }
            else {
                System.out.print(93);
                System.out.print(",");
            }
        }


    }
}

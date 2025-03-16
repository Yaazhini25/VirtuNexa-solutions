import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.*;

public class ASCII_convertor{
    public static void main(String args[]){
        String c;
        System.out.println("Enter the input character");
        Scanner sc = new Scanner(System.in);
        c = sc.next();
        byte[] ans = c.getBytes(StandardCharsets.UTF_8);
        if(ans.length<1){
            System.out.println("Cannot find the ASCII value for the given input character");
        }
        else{
            if(ans[0]>127){
                System.out.println("Cannot find the ASCII value of the given character but the UTF_8 value is "+ans[0]);
            }
            else{
                System.out.println("The ASCII value of the given character " + c + " is " + ans[0]);
            }
        }
    }
}
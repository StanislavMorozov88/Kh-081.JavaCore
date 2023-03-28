package edu11.practical;
import java.util.regex.*;


public class task1 {
    public static void main(String[] args) {
        String str1 = "IT";
        String str2 = "IT Academy IT312312IT";

        //First way
        boolean result = str2.contains(str1);
        System.out.println(result);

        //Second way
        Pattern p = Pattern.compile(str1);
        Matcher m = p.matcher(str2);
        if(m.find()){
            System.out.println("True");
        }



    }
}

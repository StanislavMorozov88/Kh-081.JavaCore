package Lesson11.PracticalTasks;

public class PrTask1 {
    public static void main(String[] args) {
        String str1 = "IT";
        String str2 = "IT Academy";
        String str3 = "Academy";
        System.out.println(ifSubString(str1,str2));
        System.out.println(ifSubString(str1,str3));


    }
    public static boolean ifSubString (String sub, String mainStr){
        return mainStr.contains(sub);
    }
}

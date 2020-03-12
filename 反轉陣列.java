
package 作業;


public class 反轉陣列 {
    // Function to reverse a string in Java using recursion
    private static String reverse(String str) {
        // base case: if string is null or empty
        if (str == null || str.equals(""))
            return str;
        // last character + recurse for remaining string
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";
        // string is immutable
        str = reverse(str);
        System.out.println("反轉陣列 : " + str);
    }
}
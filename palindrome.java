import java.util.*;
class palindrome{
    static Scanner sc=new Scanner(System.in);
    public static String reverse(String a)
    {
        String rev=" ";
        for (int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            rev=ch+rev;
        }
        return rev;
    }
    public static boolean isPlaindrome(String a)
    {
        String rev=reverse(a);
        System.out.println("reverse string:"+rev);
        if (reverse(a).equalsIgnoreCase(rev))
            return  true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("enter the string:");
        String str= sc.nextLine();
        if (isPlaindrome(str))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}

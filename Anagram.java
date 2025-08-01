import java.util.*;
class anagram{
    static Scanner sc=new Scanner(System.in);
    public static boolean isAanagram(String stri1,String stri2)
    {
         String str1=stri1.toLowerCase();
         String str2=stri2.toUpperCase();

         char[] ch1=str1.toCharArray();
         char[] ch2=str2.toCharArray();

          Arrays.sort(ch1);
          Arrays.sort(ch2);

          String str=new String(ch1);
          String strn=new String(ch2);

          if (str.equalsIgnoreCase(strn))
              return true;
          else
              return false;
    }

    public static void main(String[] args) {
        System.out.println("enter the string 1:");
        String stri1=sc.nextLine();
        System.out.println("enter the string 2:");
        String stri2= sc.nextLine();
        if(isAanagram(stri1,stri2))
            System.out.println(" it is anagram");
        else
            System.out.println("not anagram");
    }
}

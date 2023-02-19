import java.util.*;
class palindrome{
    public static void main(String args[])
    {
String str,rev="";
Scanner Sc=new Scanner(System.in);
System.out.println("Enter a string:");
str=Sc.nextLine();
int length=str.length();
for(int i=length-1;i>=0;i--)
rev=rev+str.charAt(i);
if(str.equals(rev))
System.out.println(str+"  is a palindrome");
else
System.out.println(str+"  is not a palindrome");
    }
}
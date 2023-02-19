import java.util.Scanner;
import java.util.Scanner;
public class frequency {
    public static void main (String args[])
    {
    System.out.println("enter the string whose frequency needs to be checked:");
    Scanner Sc=new Scanner(System.in);
    String str=Sc.next();
    System.out.println("enter the character whose frequency needs to be checked:");
    char chr=Sc.next().charAt(0);
    int length=str.length();
    int count=0;
    char arr[]=str.toCharArray();
    for(int i=0;i<length;i++){
        if(arr[i]==chr){
            count+=1;
        }
    }
    System.out.println("total occurance"+count);

}
}

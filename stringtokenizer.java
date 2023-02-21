import java.util.Scanner;
public class stringtokenizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(inputString);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }    
        scanner.close();
    }
}

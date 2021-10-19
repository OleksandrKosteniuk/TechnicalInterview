import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        System.out.println(isPalindrome(text));
    }

    private static boolean isPalindrome(String text) {
        Boolean result = false;


        String adjustedText = text.toLowerCase().replaceAll("[^A-za-z]","");

        StringBuffer revertedText = new StringBuffer(adjustedText).reverse();

        for (int i = 0;i<adjustedText.length();i++){
            if (adjustedText.charAt(i)!=revertedText.charAt(i)){
                result = false;
                break;
            }
            else result = true;
        }
        return result;
    }
}

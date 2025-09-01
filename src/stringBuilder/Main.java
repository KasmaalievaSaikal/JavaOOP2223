package stringBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1 Task:
        Scanner scanner = new Scanner(System.in);
        System.out.println(getReverseWord("Java"));

        String[] words = {"Java", "Saikal", "Aiana"};

        String result = joinText(words);
        System.out.println("Koшулган саптар" + result);

        String text = "азаовтмфукгпфщс";
        int count = countVowels(text);
        System.out.println("unduu tamgalar" + count);

        System.out.println("soz jaz:");
        String word = scanner.nextLine();
        boolean result1 = isPalindrome(word);
        if (result1) {
            System.out.println(word + "paliandrom");
        } else {
            System.out.println(word + "paliandrom emes");
        }

        String sentense = "Python tilindegi misal";
        String result2 = capitalizeWords(sentense);
        System.out.println(result2);

        String coz1 = "ABC";
        String asciResult = convertToAscii(coz1);
        System.out.println("Ascii menen: " + asciResult);

        String sentense1 = "создордогу боштук ;";
        String result3 = removeSpaces(sentense1  );
        System.out.println("жыйынтык :" + result3);

    }

    public static StringBuilder getReverseWord(String word) {
        StringBuilder stringBuilder = new StringBuilder(word);
        return stringBuilder.reverse();
    }

    public static String joinText(String[] words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(word).append(" ");
        }
        if (builder.length() > 0) {
            builder.setLength(builder.length() - 1);
        }
        return builder.toString();
    }

    public static int countVowels(String text) {
        String vowels = "ОАЫДЛЬЖЛВМ";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }return count;
    }
public static boolean isPalindrome(String word){
        StringBuilder reversed=new StringBuilder(word).reverse();
        return word.equalsIgnoreCase(reversed.toString());
    }
    public static String capitalizeWords(String sentense){
        StringBuilder result=new StringBuilder();
        String[] words =sentense.split("\\s");
         for(String word:words){
             if (word.length()>0){
                 String capitalized=word.substring(0,1).toUpperCase()+word.substring(1);
                 result.append(capitalized).append("");
             }
         }
         return result.toString().trim();
    }
    public static int countWords(String sentense){
        String cleaned=sentense.trim();
        StringBuilder sb=new StringBuilder(cleaned);
        if (sb.length()==0){
            return 0;
        }
          String[]  words = sb.toString().split("s");
        return words.length;
    }
    public  static String convertToAscii(String coz) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < coz.length(); i++) {
            char ch = coz.charAt(i);
            int ascii = (int) ch;
            sb.append(ascii);
            if (i != coz.length() - 1) {
                sb.append("");
            }
        }
        return sb.toString();
    }public  static String removeSpaces(String sentnce){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < sentnce.length(); i++) {
            char ch=sentnce.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
        }return sb.toString();
    }
}

package isp.lab2.Exercise4StringSearch;

import java.util.Scanner;

public class Exercise4StringSearch {
    /**
     * This method should return an array of strings that contain the substring.
     * @param input
     * @param substring what to search for
     * @return
     */
    public static String[] searchSubstrings(String input, String substring) {
        String[] strArray = input.split(",");
        String[] result = new String[strArray.length];
        int j=0;
        for(String string : strArray){
            if (string.contains(substring)) {
                result[j]=string;
                j++;
            }
        }
        return result;
    }

    public static String readFromConsoleInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter line: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        String input = "apples,computer,bread,tea,car";
        String substring = "te";
        String[] result = searchSubstrings(input, substring);
        for (String string : result) {
            if(string ==null)
                break;
            else
                System.out.println(string);
        }
    }
}

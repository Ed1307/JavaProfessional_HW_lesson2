package task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            words.add(sc.next());
        }
        words = doubleValues(words);
        for (int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }
    }
    static ArrayList<String> doubleValues (ArrayList<String> words){
        ArrayList<String> returnArray = new ArrayList<>();
        for (String s: words) {
            char[] first = s.toCharArray();
            char[] second = new char[first.length*2];
            int j = 0;
            for (int i = 0; i < first.length; i++) {
                second[j] = first[i];
                j++;
                second[j] = first[i];
                j++;
            }
            String returnString = "";
            returnString = returnString.copyValueOf(second);
            returnArray.add(returnString);
        }
        return returnArray;
    }
}

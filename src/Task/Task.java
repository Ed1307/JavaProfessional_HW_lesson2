package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            System.out.println("Введите строку");
            String s = sc.next();
            if(s.equals("end")){
                break;
            }
            list.add(s);
        }
        System.out.println(list);
    }
}

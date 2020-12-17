package task3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        getIntegerList(N, list);
        System.out.println(getMinimum(list));

    }
    static void getIntegerList (int N, LinkedList list){
        for (int i = 0; i < N; i++) {
            list.addFirst((int)(Math.random()*1000));
        }
    }
    static int getMinimum (LinkedList<Integer> list){
        Integer x = list.getFirst();
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(x> it.next()){
                x = it.next();
            }
        }
        return x;
    }
}

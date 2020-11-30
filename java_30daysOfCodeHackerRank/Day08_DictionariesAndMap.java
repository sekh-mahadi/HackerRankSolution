package java_30daysOfCodeHackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08_DictionariesAndMap {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> hMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            hMap.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if (hMap.containsKey(s)) {
                System.out.println(s + "=" + hMap.get(s));

            } else {
                System.out.println("Not found");
            }

            // Write code here
        }
        in.close();
    }
}

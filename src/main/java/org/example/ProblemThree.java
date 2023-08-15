package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProblemThree {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        if(! file.exists()){
            System.out.println(file.getName()+"dose Not exist !!");
            return;
        }
        Scanner sc = new Scanner(file);
        Map<String, List<Integer>> map = new HashMap<>(132);
        int index = 0 ;
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, ".=<>\"+-*/(){},0123456789[];");
            while (stk.hasMoreElements()){
                String word = stk.nextToken();
                if(map.get(word)==null){
                    map.put(word,new LinkedList<>());
                }
                map.get(word).add(++index);
            }

        }
        sc.close();
//        System.out.println(map);
        for(Map.Entry<String, List<Integer>> entry: map.entrySet()){
            System.out.println(entry.getKey()+"("+entry.getValue().size()+"): ");
            for (Integer i : entry.getValue()){
                System.out.println("@"+i+" ");
            }
            System.out.println();
        }
    }
}

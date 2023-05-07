package inflearnjavaalgo.p0402;

import java.util.HashMap;
import java.util.Scanner;

class Main {

    public String solution(String s1, String s2) {
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char x : s1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char x : s2.toCharArray()) {
            map2.put(x, map2.getOrDefault(x, 0) + 1);
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return "NO";
        }

        for (char key : map1.keySet()) {
            if (map1.get(key) != map2.get(key)) {
                return "NO";
            }
        }

        return "YES";

    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner in = new Scanner(System.in);

        String s1 = in.next();
        String s2 = in.next();
        System.out.println(T.solution(s1, s2));
    }

}


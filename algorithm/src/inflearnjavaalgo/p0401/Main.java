package inflearnjavaalgo.p0401;

import java.util.Scanner;

class Main {

    public void solution(int n, String s) {
        int arr[] = new int[5];
        for (int i = 0; i< n ; i++) {
            char c = s.charAt(i);
            arr[c - 'A']++;
        }

        int answer = 0;
        int answerIndex = 0;
        for (int i=0; i<5; i++) {
            if (answer < arr[i]) {
                answer = arr[i];
                answerIndex = i;
            }
        }

        System.out.println((char)(answerIndex + 'A'));
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String s = in.next();
        T.solution(n, s);
    }

}


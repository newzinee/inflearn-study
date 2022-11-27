package inflearnjavaalgo.p0306;

import java.util.Scanner;

class Main {

    public void solution(int n, int k, int[] arr) {

        int answer = 0;


    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }

        T.solution(n, k, arr);
    }

}


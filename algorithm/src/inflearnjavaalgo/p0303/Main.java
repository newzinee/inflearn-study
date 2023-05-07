package inflearnjavaalgo.p0303;

import java.util.Scanner;

class Main {

    public void solution(int n1, int[] arr1, int n2) {

        int max = 0 ;

        for (int i = 0; i < n1 - 1 - n2; i++) {
            int result = 0;
            for (int j = 0; j < n2; j++) {
                result += arr1[i + j];
            }
            if (max < result) {
                max = result;
            }
        }
        System.out.println(max);

    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }

        T.solution(n1, arr1, n2);
    }

}


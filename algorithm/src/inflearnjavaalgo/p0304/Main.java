package inflearnjavaalgo.p0304;

import java.util.Scanner;

class Main {

    public void solution(int n, int[] arr, int m) {

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {   // O(n^2)
                sum += arr[j];
                if (sum == m) {
                    answer++;
                    break;
                } else if (sum > m) {
                    break;
                }
            }
        }

        System.out.println(answer);
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


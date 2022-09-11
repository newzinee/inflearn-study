package inflearnjavaalgo.p0305;

import java.util.Scanner;

class Main {

    public void solution(int n) {

        int answer = 0, lt = 1, rt = 1, sum = rt;

        while (rt < n) {
            if (sum == n) {
                answer++;
                sum -= lt;
                lt++;
            } else if (n < sum && lt < rt) {
                sum -= lt;
                lt++;
            } else {
                rt++;
                sum += rt;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();

        T.solution(n1);
    }

}


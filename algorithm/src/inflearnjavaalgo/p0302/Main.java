package inflearnjavaalgo.p0302;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public void solution(int n1, int[] arr1, int n2, int[] arr2) {
        final int[] sortedArr1 = Arrays.stream(arr1).sorted().toArray();
        final int[] sortedArr2 = Arrays.stream(arr2).sorted().toArray();

        int index1 = 0;
        int index2 = 0;
        while (index1 < n1 && index2 < n2) {
            if (sortedArr1[index1] == sortedArr2[index2]) {
                System.out.print(sortedArr1[index1] + " ");
                index1++;
                index2++;
            } else if (sortedArr1[index1] < sortedArr2[index2]) {
                index1++;
            } else {
                index2++;
            }
        }

        while (index1 < n1) {
            if (sortedArr1[index1] == sortedArr2[index2 - 1]) {
                System.out.print(sortedArr1[index1] + " ");
            }
            index1++;
        }

        while (index2 < n2) {
            if (sortedArr1[index1 - 1] == sortedArr2[index2]) {
                System.out.print(sortedArr1[index1 - 1] + " ");
            }
            index2++;
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner in = new Scanner(System.in);

        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }

        T.solution(n1, arr1, n2, arr2);
    }

}


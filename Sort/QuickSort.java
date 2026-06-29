package Sort;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    private static final Random rand = new Random();

    public static void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partitionRandom(A, p, r);
            quickSort(A, p, q - 1);
            quickSort(A, q + 1, r);
        }
    }

    // pivot 을 가장 마지막 데이터로 지정 : 이미 정렬된 상태면 시간 복잡도가 최악임
    private static int partitionLast(int[] A, int low, int high) {
        int pivot = A[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (A[j] < pivot) {
                i++;
                swap(A, i, j);
            }
        }
        swap(A, i + 1, high);
        return i + 1;
    }

    private static int partitionRandom(int[] A, int low, int high) {

        int pivotIndex = low + rand.nextInt(high - low + 1);

        swap(A, pivotIndex, high);

        return partitionLast(A, low, high);

    }

    private static void swap(int[] A, int p, int q) {
        int temp;
        temp = A[p];
        A[p] = A[q];
        A[q] = temp;
    }

    public static void main(String[] args) {
        int[] data = { 9, 3, 7, 1, 8, 2, 5, 3, 6, 0 };
        System.out.println(Arrays.toString(data));
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

}
package Sort;

public class MergeSort {

    // tmp를 한번만 호출하게 refactoring
    public static void mergeSort(int[] A) {
        if (A == null || A.length < 2) {
            return;
        }

        int[] tmp = new int[A.length];

        mergeSort(A, 0, A.length - 1, tmp);
    }

    private static void mergeSort(int[] A, int p, int r, int[] tmp) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(A, p, q, tmp);
            mergeSort(A, q + 1, r, tmp);
            merge(A, p, q, r, tmp);
        }
    }

    private static void merge(int[] A, int p, int q, int r, int[] tmp) {
        int i = p;
        int j = q + 1;
        int k = p;
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[k++] = A[i++];
            } else {
                tmp[k++] = A[j++];
            }
        }
        while (i <= q) {
            tmp[k++] = A[i++];
        }
        while (j <= r) {
            tmp[k++] = A[j++];
        }
        for (int g = p; g <= r; g++) {
            A[g] = tmp[g];
        }
    }

    public static void main(String[] args) {
        int[] data = { 9, 3, 7, 1, 8, 2, 5, 3, 6, 0 };
        System.out.println(java.util.Arrays.toString(data));
        mergeSort(data);
        System.out.println(java.util.Arrays.toString(data));
    }
}

package Sort;

public class CountingSortBasic {
    // arr의 모든 값은 0 이상 k이하의 정수
    static int[] sort(int[] arr, int k) {
        int[] count = new int[k + 1];

        for (int x : arr) {
            count[x]++;
        }

        int[] result = new int[arr.length];
        int idx = 0;
        for (int value = 0; value <= k; value++) {
            for (int c = 0; c < count[value]; c++) {
                result[idx] = value;
                idx++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 3, 0, 2, 3, 0, 3 };
        int[] sorted = sort(arr, 5);

        System.out.println(java.util.Arrays.toString(sorted));
    }
}
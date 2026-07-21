package Sort;

public class HeapSort<T extends Comparable<T>> {

    private int size;

    public void sort(T[] arr) {
        this.size = arr.length;

        for (int i = parent(size - 1); i >= 0; i--) {
            siftDown(arr, i);
        }

        while (size > 0) {
            swap(arr, 0, size - 1);
            size--;
            siftDown(arr, 0);
        }

    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private int leftChild(int i) {
        return i * 2 + 1;
    }

    private int rightChild(int i) {
        return i * 2 + 2;
    }

    private void siftDown(T[] arr, int i) {
        while (true) {
            int largest = i;
            int left = leftChild(i);
            int right = rightChild(i);

            if (left < size && arr[left].compareTo(arr[largest]) > 0) {
                largest = left;
            }

            if (right < size && arr[right].compareTo(arr[largest]) > 0) {
                largest = right;
            }

            if (largest == i) {
                break;
            }
            swap(arr, i, largest);
            i = largest;
        }
    }

    private void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 1, 9, 5, 2, 8, 7, 4 };
        HeapSort<Integer> heapsort = new HeapSort<>();
        heapsort.sort(arr);
        System.out.println("heap sort result");
        for (Object x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
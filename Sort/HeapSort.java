package Sort;

public class HeapSort<T extends Comparable<T>> {

    private Object[] heap;
    private int size;
    private int capacity;

    public HeapSort(T[] arr) {
        this.capacity = arr.length;
        this.size = arr.length;
        this.heap = new Object[capacity];

        for (int i = 0; i < size; i++) {
            heap[i] = arr[i];
        }

        for (int i = parent(size - 1); i >= 0; i--) {
            siftDowm(i);
        }

        while (size > 0) {
            swap(0, size - 1);
            siftDowm(0);
            size--;
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

    @SuppressWarnings("unchecked")
    private void siftDowm(int i) {
        while (true) {
            int largest = i;
            int left = leftChild(i);
            int right = rightChild(i);

            if (left < size && ((T) heap[left]).compareTo((T) heap[largest]) > 0) {
                largest = left;
            }

            if (right < size && ((T) heap[right]).compareTo((T) heap[largest]) > 0) {
                largest = right;
            }

            if (largest == i) {
                break;
            }
            swap(i, largest);
            i = largest;
        }
    }

    private void swap(int i, int j) {
        Object tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 1, 9, 5, 2, 8, 7, 4 };
        HeapSort<Integer> heapsort = new HeapSort<>(arr);
        System.out.println("heap sort result");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
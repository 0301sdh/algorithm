package Sort;

public class CountingSortRecord {

    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + "(" + score + ")";
        }
    }

    static Student[] sortByScore(Student[] arr, int k) {

        int n = arr.length;
        int[] count = new int[k + 1];

        for (Student s : arr) {
            count[s.score]++;
        }

        for (int i = 1; i < k + 1; i++) {
            count[i] += count[i - 1];
        }

        Student[] output = new Student[n];
        for (int i = n - 1; i >= 0; i--) {
            Student s = arr[i];
            count[s.score]--;
            output[count[s.score]] = s;
        }
        return output;
    }

    public static void main(String[] args) {
        Student[] arr = {
                new Student("Ann", 3),
                new Student("Bob", 1),
                new Student("Cara", 3),
                new Student("Dan", 2),
                new Student("Eve", 1),
                new Student("Kim", 5)
        };
        Student[] sorted = sortByScore(arr, 5);

        System.out.println(java.util.Arrays.toString(sorted));

    }
}

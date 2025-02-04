public class BigOTime {
    public static void main(String[] args) {

    }

    private static void constantTime() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("First element: " + arr[0]); // O(1)
    }

    private static void linearTime() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int e : arr) {
            System.out.println(arr[e]); // O(n)
        }
    }

    private static void quadraticTime() {
        int[] arr = {1, 2, 3, 4, 5};

        for (int e : arr) {
            for (int i : arr) {
                System.out.println(arr[e] + ", " + i); // O(n^2)
            }
        }
    }

    private static void logarithmicTime() {
        // Binary search is a classic example if logarithmic time complexity
        // With each iteration, the search space is halved.
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 7;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid); // O(log n)
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}

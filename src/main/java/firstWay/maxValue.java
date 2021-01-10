package firstWay;

public class maxValue {

    public static void main(String[] args) {
        int n = 10;
        int x = 100;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * x);
        }
        for (int i : arr) {
            System.out.print("Массив рандомных чисел: " + i + " ");
        }

        int firstMax = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        System.out.println(" ");
        System.out.println("Второе максимальное число: " + secondMax);
    }
}
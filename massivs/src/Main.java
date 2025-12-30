import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задание 1
        int[] inputArray1 = {10_000, 100_000, 15_000, 25_000, 1500};
        int minPay = inputArray1[0];
        float averagePay = 0;
        int sumPay = 0;
        int maxPay = inputArray1[0];
        for (int min : inputArray1) {
            if (min < minPay) {
                minPay = min;
            }
        }
        for (int max : inputArray1) {
            if (max > maxPay) {
                maxPay = max;
            }
        }
        for (int sum : inputArray1) {
            sumPay += sum;
        }
        averagePay = (float) sumPay / inputArray1.length;
        float[] outputArray1 = {sumPay, maxPay, minPay, averagePay};
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));
        // задание 2
        int [] inputArray2 = {100_000, 150_000, 40_000, 30_000, 70_000};
        int count = 0;
        float[] outputArray2 = new float[inputArray2.length];
        for (int value : inputArray2) {
            float tax = value * 0.13f;
            outputArray2[count] = tax;
            count++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));
        //задание 3
        int [] inputArray3 = {10_000, 3_000, 2_000, 7_000, 6_000};
        int count1 = 0;
        boolean[] outputArray3 = new boolean[inputArray3.length];
        for (int value1 : inputArray3) {
            if (value1 > 5000) {
                outputArray3[count1] = true;
            } else {
                outputArray3[count1] = false;
            }
            count1++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));
        //задание 4
        int [] inputArray4 = {10_000, 5000, -3000, 4000, 2000};
        boolean[] outputArray4 = new boolean[1];
        boolean dolg = false;
        for (int value2 : inputArray4) {
            if (value2 < 0) {
                dolg = true;
                break;
            }
        }
        outputArray4[0] =! dolg;
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));
        //задание 5
        int [] inputArray5 = {100_000, 200_000, -300_000, 400_000, -50_000};
        int count2 = 0;
        for (int value3 : inputArray5) {
            if (value3 > 0) {
                count2++;
            }
        }
        int[] outputArray5 = {count2};
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задание 1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        System.out.println(Arrays.toString(arr2));
        boolean[] arr3 = {true, true, false, true};
        System.out.println(Arrays.toString(arr3));
        //задание 2
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (int r = 0; r < arr2.length; r++) {
            if (r == arr2.length - 1) {
                System.out.println(arr2[r]);
                break;
            }
            System.out.print(arr2[r] + ", ");
        }
        for (int g = 0; g < arr3.length; g++) {
            if (g == arr3.length - 1) {
                System.out.println(arr3[g]);
                break;
            }
            System.out.print(arr3[g] + ", ");
        }
        //задание 3
        for (int s = arr.length - 1; s >= 0; s--) {
            if (s == 0) {
                System.out.println(arr[s]);
                break;
            }
            System.out.print(arr[s] + ", ");
        }
        for (int f = arr2.length - 1; f >= 0; f--) {
            if (f == 0) {
                System.out.println(arr2[f]);
                break;
            }
            System.out.print(arr2[f] + ", ");
        }
        for (int h = arr3.length - 1; h >= 0; h--) {
            if (h == 0) {
                System.out.println(arr3[h]);
                break;
            }
            System.out.print(arr3[h] + ", ");
        }
        //задание 4
        for (int o = 0; o < arr.length; o++) {
            if (arr[o] % 2 != 0) {
                arr[o] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
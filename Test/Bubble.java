import java.util.Arrays;

/**
 * Created by Дмитрий on 19.02.2015.
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {422, 425, 326, 98, 542, 43, 34, 34, 43, 34, 53, 463};
        int count = 0;
        boolean isStop = true;
        for (int k = 0; k < arr.length; k++) {
            for (int n = 0; n < arr.length - 1; n++) {
                count++;
                if (arr[n] > arr[n + 1]) {
                    isStop = false;
                    int temp = arr[n];
                    arr[n] = arr[n + 1];
                    arr[n + 1] = temp;

                }

            }
            if (isStop) {
                break;
            }
            if (k == 4) {
                for (int m = 0; m < arr.length; m++) {
                    System.out.print(arr[m] + " ");

                }
                System.out.println();
                System.out.println(count);
            }
        }
//       System.out.print(Arrays.toString(arr));

    }
}
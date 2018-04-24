import java.util.Arrays;

public class MyArrays {

    public static double median(int[] a) {

        double num = 0;
        Arrays.sort(a);

            if (a.length % 2 == 0)
                num = (a[a.length / 2] + a[(a.length / 2) - 1]) / 2.0;
            else
                num = a[a.length / 2];

        return num;
    }

    public static int countMatches(int[] a1, int[] a2) {

        Arrays.sort(a1);
        Arrays.sort(a2);
        int count =0;
        int  right1 = a1.length-1, right2 = a2.length-1;
        int i = 0, j = 0;

        while (i <= right1 && j <= right2) {
            if(a1[i] == a2[j]) {
                count++;
                i++;
                j++;
            }
            else if(a1[i] > a2[j]) {
                j++;
            }
            else {
                i++;
            }
        }

            return count;
        }

    }





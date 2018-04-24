import java.util.Arrays;

public class MyArrays {

    public static double median(int[] a) {

        double num = 0;
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {

            if (a.length % 2 == 0)
                num = (a[a.length / 2] + a[(a.length / 2) - 1]) / 2;
            else
                num = a[a.length / 2];
        }


        return num;
    }

    public static int countMatches(int[] a1, int[] a2) {

        Arrays.sort(a1);
        Arrays.sort(a2);
        int a3Size = a1.length + a2.length;
        int[] a3 = new int[a3Size];

        int left1 = a1[0], left2 = a2[0], right1 = a1.length, right2 = a2.length;
        int i = left1, j = left2, k = 0, matchedNumbers = 0;

        while (i <= right1 && j <= right2) {
            a3[k] = a3[i];
            a3[k+1] = a3[j];

            k++;
            i++;
            j++;
        }
        Arrays.sort(a3);


     /*  while (i<= right1 && j<= right2) {
            if(a1[i] <= a2[j]) {
                a3[k] = a1[i];
                i++;
                k++;
            }
            else if(a1[i] >= a2[j]) {
                a3[k] = a2[j];
                j++;
                k++;
            }
        }
        if(i <= right1) {
            while (i <= right1) {
                a3[k] = a1[i];
                k++;
                i++;
            }
        }
        else if(j <= right2) {
            while(j <= right2) {
                a3[k] = a2[j];
                k++;
                j++;
            }
        } */

        for(int y=0; y < a3.length; y++) {
            int index =0;

            for(int r=1; r< a3.length; r++) {
                index = a3[r];

                if(a3[y] == index) {
                    matchedNumbers++;
                }
            }

        }

            return matchedNumbers;
        }

    }





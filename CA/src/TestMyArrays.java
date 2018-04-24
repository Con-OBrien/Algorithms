//Conor O'Brien
//T00193238
//10-04-18
public class TestMyArrays {
    public static void main(String[] args) {
        int[] myArray = { 3, 7, 18, 9, 1};

       double medianValue = MyArrays.median(myArray);
        System.out.println(medianValue); //Expect 7

        int[] myArray2 = {10, 13, 5, 6, 1, 18};

        double medianValue2 = MyArrays.median(myArray2);
        System.out.println(medianValue2); //With this even array, the answer should be the average of 6 and 10 which is 8

        int[] myArray3 = {40, 11, 86, 9, 70, 50, 3};

        double medianValue3 = MyArrays.median(myArray3);
        System.out.println(medianValue3); //Expect 40 as it is the median of the set of values


        int[] lottoNumbers = {18, 23, 4, 15, 20};
        int[] myNumbers = {23, 1, 2, 25, 15};

        int matchedNumbers = MyArrays.countMatches(lottoNumbers, myNumbers);
        System.out.println("You matched " + matchedNumbers + " lotto numbers");

    }
}

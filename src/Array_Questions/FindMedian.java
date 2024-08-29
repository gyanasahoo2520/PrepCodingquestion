package Array_Questions;

import java.util.Arrays;

//Sort the array in ascending order
//Check whether n is odd or even
//Calculate the median accordingly. Here’s a quick demonstration of the same

public class FindMedian {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 5, 6};
        getMedian(arr);
    }
    static void getMedian(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        if(n%2==0){
            int f=(n/2)-1;
            int s=n/2;
            System.out.println((double) (arr[f]+arr[s])/2);
        }
        else
            System.out.println(arr[n/2]);
    }
}

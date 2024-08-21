package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr={ 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        duplicateRemove1(arr);
    }
    static void duplicateRemove(int[] arr){
        int n=arr.length;
        int[] check=new int[n];
        Arrays.fill(check, 1);
        for(int i=0;i<n;i++){
            if(check[i]==1){
                for (int j=i+1;j<n;j++){
                    if(arr[i]==arr[j])
                        check[j]=0;
                }
            }
        }
        for (int i=0;i<n;i++){
            if(check[i]==1)
                System.out.print(arr[i]+" ");
        }
    }
    static void duplicateRemove1(int[] arr){
        HashSet<Integer> result=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            result.add(arr[i]);
        }
        System.out.println(result);
    }
}

package Array_Questions;

import java.util.HashMap;

public class FindReapeating {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        find(arr);
    }
    static void find(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        for(Integer i:hm.keySet()){
            if(hm.get(i)>1)
                System.out.print(i + " ");
        }
    }
}

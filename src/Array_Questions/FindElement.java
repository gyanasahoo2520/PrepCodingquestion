package Array_Questions;

public class FindElement {
    public static void main(String[] args) {
        int[] arr={1,5,7,12,24};
        int n=arr.length;
        int key=5,ans=-1;
        boolean find=false;
        int s=0,e=n-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>key)
                e=m-1;
            else if(arr[m]<key)
                s=m+1;
            else {
                find=true;
                ans=m;
                break;
            }
        }
        if(find)
            System.out.println("Element Present in " + ans + " index");
        else
            System.out.println("Element is not Present");
    }
}

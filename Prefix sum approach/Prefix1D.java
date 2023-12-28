import java.util.Arrays;

public class Prefix1D {
    public static int[] preFixSum(int[] arr){
        for(int i=1; i<arr.length; i++){
            arr[i]+=arr[i-1];
        }
        return arr;
    }
    public static void main(String args[]){
        int[] arr={2,4,6,8,10};
        int[] arr2=preFixSum(arr);
        
        System.out.println(Arrays.toString(arr));
    }
}

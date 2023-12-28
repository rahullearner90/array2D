import java.util.Arrays;

class Prefixsum2D{
    public static void main(String[] args) {
        int sum=0;
        int arr[][]={
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        // Sum of the elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[arr.length-1].length; j++) {
                sum+=arr[i][j];
            }
        }
        
        for(var i : arr){
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Sum of the Elements is : "+sum);
    }
}
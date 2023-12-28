import java.util.Arrays;

public class RotationOfMatrix {

    public static void rotateMatrix(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0; i<m; i++){
            for(int j=i; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }     
    }
    public static void  swaped(int[][] arr){
        int m=arr.length;
        int n=arr[m-1].length;

        for(int k=0; k<m; k++){
            int ri=n-1;
            int li=0;
            
            while(li<ri){
                int temp=arr[k][li];
                arr[k][li]=arr[k][ri];
                arr[k][ri]=temp;

                li++;
                ri--;
            }
        }    
    }
    
    public static void main(String args[]){
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        // printing array before rotation
        for(var mat: arr){
            System.out.println(Arrays.toString(mat));
        }
        
        // calling function
        rotateMatrix(arr);

        // printing array after transpose
        for(var mat: arr){
            System.out.println(Arrays.toString(mat));
        }

        swaped(arr);
        for(var mat: arr){
            System.out.println("Swaped Elements : "+Arrays.toString(mat));
        }
   
    }
}
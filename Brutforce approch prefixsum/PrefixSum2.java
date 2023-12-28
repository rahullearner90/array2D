import java.util.Scanner;

public class PrefixSum2 {
    static int r1,r2,c1,c2;
    static void acceptValue(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter r1 :");
        r1=sc.nextInt();
        System.out.print("Enter c1 :");
        c1=sc.nextInt();
        System.out.print("Enter r2 :");
        r2=sc.nextInt();
        System.out.print("Enter c2 :");
        c2=sc.nextInt();
    }
    static int sumOfEl(int arr[][]){
        int sum=0;
        acceptValue();
        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flage=1;
        int[][] arr={
        {1,1,1,1},
        {1,1,1,1},
        {1,1,1,1},
        {1,1,1,1}
    };

    while(flage==1){
        int sum=sumOfEl(arr);
        System.out.println("\nSum of the Elements is :"+sum);
        System.out.println("Enter 1 for continue");
        flage=sc.nextInt();
        
    }
        
    }
}

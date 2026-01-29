import java.util.*;
public class Cupcake {
        public static void bubbleSort(int n,int arr[]){
                for(int i=0;i<n;i++){
                        for(int j=0;j<n-i-1;j++){
                                if(arr[j]<arr[j+1]){
                                        int temp=arr[j];
                                        arr[j]=arr[j+1];
                                        arr[j+1]=temp;
                                }
                        }
                }
        }
        public static long Miles(int n,int arr[]){
                long calorie=0;
                long multi=1;
                for(int i=0;i<n;i++){
                        calorie=calorie+arr[i]*multi;
                        multi*=2;
                }
                return calorie;
        }
        public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=sc.nextInt();
                        
                }
                bubbleSort(n,arr);
                long result=Miles(n,arr);
                System.out.print(result);                
        }
        // TODO: Read n
        // TODO: Read calorie counts into an array
        // TODO: Sort the array (think about ascending vs descending)
        // TODO: Calculate the minimum miles using the formula (c * 2^j)
        // TODO: Print the result (Use 'long' for the sum to avoid overflow)
    
}

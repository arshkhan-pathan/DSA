import java.util.Arrays;

public class MergeArray {
    static void merge(int arr1[], int arr2[], int n, int m) {

        int i=0;
        int j=0;
        while(i<n & j<m){

            if(arr1[i]>arr2[j]){
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                i++;
                       
                      
            }
            else{
                int temp=arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
                j++;
                 

            }
            Arrays.sort(arr1); 
            Arrays.sort(arr2); 
        }

        
    }


    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        merge(arr1,arr2,4,5);
        for(int i=0;i<4;i++){
            System.out.println(arr1[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println(arr2[i]);
        }


    }
}

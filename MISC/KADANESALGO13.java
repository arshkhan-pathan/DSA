import java.math.MathContext;

public class KADANESALGO13 {
    static int maxSubarraySum(int arr[], int n){
        
        int maxend=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++){
            maxend=Math.max(arr[i], maxend+arr[i]);
            res=Math.max(maxend,res);
            }


        
        return res;
        
    }
    

    public static void main(String[] args) {

        
        int ar[]={1,2,3,-2,5};
        System.out.println(maxSubarraySum(ar,5));


        
    }
}

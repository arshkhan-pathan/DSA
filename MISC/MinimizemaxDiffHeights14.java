import java.util.*;

public class MinimizemaxDiffHeights14 {

    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int left =arr[0]+k;
        int right= arr[n-1]-k;
        int minleft=arr[0];
        int maxright=arr[n-1];
        int ans=maxright-minleft;
        for(int i=1;i<n;i++){

            minleft=Math.min(minleft, arr[i]);
            maxright=Math.max(maxright,arr[i-1]);
            if(minleft<0){
                continue;
            }
            else{
                ans=Math.min(maxright-minleft, ans);
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
    int ar[]={1,2,2,2,3,3,4,6,7,10};
    System.out.println(getMinDiff(ar,10,5));    
    }
    
}

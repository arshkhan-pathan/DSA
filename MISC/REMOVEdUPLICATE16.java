public class REMOVEdUPLICATE16 {

    static int findDuplicate(int[] nums) {

            int n=nums.length;
            int m=n-1;
            int total=(m*(m+1))/2;
            int sums=0;
            for(int i=0;i<n;i++){

                    sums=sums+nums[i];

            }
        return sums-total;
    
    }
    public static void main(String[] args) {
        

            int ar[]={3,1,3,4,2};
            System.out.println(findDuplicate(ar));

        
    }
    
}

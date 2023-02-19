import java.util.*;
class Solution{
    static double AREA(long R){
        double arr=R*R;
        return arr;
    }
    static double solve(int R, int A, int B){
        double sum=0.0;
        long CRADIUS=R,COUT=1;
        while(CRADIUS!=0){
            sum+=AREA(CRADIUS);
            if(COUT%2==0)
                CRADIUS=CRADIUS/B;
            else
                CRADIUS=CRADIUS*A;
            COUT++;
        }
        sum=sum*Math.PI;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int R=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            
            System.out.println("Case #"+i+": "+ solve(R,A,B));
        }
    }
}
import java.util.*;
class Solution{
    public int[] plusOne(int a[]){
        int i=0;
        int n=a.length;
        while(i<=n-1 && a[n-1-i]==9){
            i++;
        }
        int o[]=(n==i)? new int[n+1] : new int[n];
        if(n==i){
            o[0]=1;
        }else{
            for(int j=0;j<=n-1-i;j++){
                o[j]=a[j];
            }
            o[n-1-i]=o[n-1-i]+1;
        }
        return o;
    }
}
public class PlusOne1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Solution s= new Solution();
        int[] r= s.plusOne(a);
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
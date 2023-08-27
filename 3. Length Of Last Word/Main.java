class Solution{
    public int lengthOfStrings(String s){
        String nstr=s.trim();
        int i=nstr.length()-1;
        int c=0;
        while(i>=0 && nstr.charAt(i)!=' '){
            c++;
            i--;
        }
        return c;
    }
}

public class Main{
    public static void main(String args[]){
        String s= "hello World";
        Solution sol = new Solution();

    
        System.out.println(sol.lengthOfStrings(s));
    }
}

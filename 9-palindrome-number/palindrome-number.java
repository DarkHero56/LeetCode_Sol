class Solution {
    public boolean isPalindrome(int x) {
        int rem=0;
        int x1=x;
        int rev=0;
        boolean res=false;
        if(x<0){
             res=false;
        }else{
            while(x!=0){
                rem = x %10;
                rev = (rev*10)+rem;
                x=x/10;
            }
            if(x1==rev){
                res=true;
            }
            System.out.println(rev);

        }
        return res;
    }
}
class Solution {
    public int hammingWeight(int n) {
    int count=0;
    int num=n;

    while(num>0){
        if((num & 1)==1)
            count++;
            num=num>>1;
    }    
    return count;
    }
}
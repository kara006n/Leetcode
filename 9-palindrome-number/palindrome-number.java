class Solution {
    public boolean isPalindrome(int x) {

        if(x<0)
        return false;

        int rev = 0;
        int n = x;
        while(x!=0){
            rev = rev*10 + x%10;
            x = x/10;
        }
        
        return rev == n;
    }

    // public boolean isPalindrome(int x) {

    //     if(x<0)
    //     return false;

    //     String s = Integer.toString(x);
    //     StringBuilder s1 = new StringBuilder(s);

    //     return s1.reverse().toString().equals(s);		
        
    // }

    
}
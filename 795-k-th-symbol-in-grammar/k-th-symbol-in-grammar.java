class Solution {
    public int kthGrammar(int n, int k) {

        if(n==1){
            return 0;
        }

        int mid = (int)Math.pow(2, n-1)/2;
        //System.out.println(" mid value is "+ mid);

        if(k<=mid){
            //System.out.println("k value is "+k);
            return kthGrammar(n-1,k);
        }
        else{
            //System.out.println("k value is "+k);
            if(kthGrammar(n-1, k-mid)==1){
                return 0;
            }else{
                return 1;
            }
        }

        
        
    }
}
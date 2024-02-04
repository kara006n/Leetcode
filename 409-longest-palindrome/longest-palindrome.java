class Solution {
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();


        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        int count = 0;
        for(int x: map.values()){
            if(x%2!=0){
                count++;
            }
        }

        return (count>0?s.length()-count+1:s.length());
        //+1 is done because we can take one odd number in between
    }
}
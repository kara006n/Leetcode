class Solution {
    public int lengthOfLongestSubstring(String s) {
		
		Set<Character> set = new HashSet<>();
		
		int start = 0;
		int end = 0;
		
		int max = 0;
		
		
		for(int i =0; i<s.length(); i++) {
			if(!set.contains(s.charAt(i))) {
				set.add(s.charAt(i));
				end = i;
			}
			
			else {
				while(s.charAt(start)!= s.charAt(i)) {
					set.remove(s.charAt(start));
					start++;
				}
				start++;
				end = i;
			}
			
			if(end - start +1 > max) {
				max = end -start + 1;
			}	
		}
		
		return max;
	}
}
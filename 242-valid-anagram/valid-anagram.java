class Solution {
    public boolean isAnagram(String s, String t) {
		
		//HashMap<Character, Integer> map = new HashMap<>();

        int arr[] = new int[26];
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		for(int i = 0; i < s.length(); i++) {
			// map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			// map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
		}
		
		for(int x: arr) {
			if(x!=0) {
				return false;
			}
		}
		
		return true;

	}
}
class Solution {
    public boolean isAnagram(String s, String t) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		for(int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
			map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
		}
		
		System.out.println(map);
		
		for(int x: map.values()) {
			if(x!=0) {
				return false;
			}
		}
		
		return true;

	}
}
class Solution {
    public String minWindow(String str, String arr) {

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : arr.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		

		int start = 0;
		int end = 0;
		int count = map.size();
		String temp ="";


		while (end < str.length()) {		

			if (map.get(str.charAt(end)) == null) {
				end++;
				continue;
			}
			map.put(str.charAt(end), map.get(str.charAt(end)) - 1);
			if (map.get(str.charAt(end)) == 0) {
				count--;
			}
			
			if(count ==0 && start==0) {
				temp = str.substring(start, end+1);
			}
			while (count <= 0) {
				
				if (map.get(str.charAt(start)) == null) {
					start++;
				} else {
					map.put(str.charAt(start), map.get(str.charAt(start)) + 1);
					if (map.get(str.charAt(start)) > 0) {
						count++;
					}
					start++;
				}
				if (count == 0) {

					if(end-start+1<temp.length()) {
						temp = str.substring(start, end+1);
					}
				}
			}
			end++;
		}
		return temp;
	}
}
class Solution {
   public  List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.isEmpty()||s.length()<p.length()){
            return list;
        }
            
		int[] arr = new int[26];
		for (int i = 0; i < p.length(); i++) {
			arr[p.charAt(i) - 'a'] -= 1;
			arr[s.charAt(i) - 'a'] += 1;
		}
		
		int i=0;
		for (; i < s.length() - p.length(); i++) {
			checkAnagram(arr,list,i);
			arr[s.charAt(i) - 'a'] -= 1;
			arr[s.charAt(i + p.length()) - 'a'] += 1;
		}
		checkAnagram(arr, list,i);
		return list;
	}

	private void checkAnagram(int[] arr,List<Integer> list,int i) {
		boolean anagram=true;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] != 0) {
				anagram = false;
				break;
			}
		}
		if (anagram) {
			list.add(i);
		}
	}
}

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> containsS = new HashMap<Character,Integer>();
        HashMap<Character,Integer> containsT = new HashMap<Character,Integer>();

        for(int i=0; i<s.length(); i++){

            containsS.put(s.charAt(i), containsS.getOrDefault(s.charAt(i),0)+1);
            containsT.put(t.charAt(i), containsT.getOrDefault(t.charAt(i),0)+1);



        }

        return containsS.equals(containsT);

    }
}

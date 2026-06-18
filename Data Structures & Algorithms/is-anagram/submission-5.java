class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> checkS = new HashMap<Character,Integer>();
        HashMap<Character,Integer> checkT = new HashMap<Character,Integer>();

        for(int i=0; i<s.length(); i++){

            checkS.put(s.charAt(i), checkS.getOrDefault(s.charAt(i),0)+1);
            checkT.put(t.charAt(i), checkT.getOrDefault(t.charAt(i),0)+1);


        }

        return checkS.equals(checkT);

    }
}

class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> containS = new HashMap<Character,Integer>();
        HashMap<Character,Integer> containT = new HashMap<Character,Integer>();

        for(int i=0; i<s.length(); i++){

            containS.put(s.charAt(i),containS.getOrDefault(s.charAt(i),0)+1);
            containT.put(t.charAt(i),containT.getOrDefault(t.charAt(i),0)+1);

        }


        return containS.equals(containT);
        

    }
}

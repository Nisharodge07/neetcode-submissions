class Solution {

    public String encode(List<String> strs) {

        StringBuilder res = new StringBuilder();
        for(String s: strs){

            res.append(s.length()).append("#").append(s);

            
        }
        return res.toString();
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<String>();
        int i=0;
        while(i<str.length()){

            int j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j)); //len=5
            i=j+1; // 2
            j=i+length; // 7
            res.add(str.substring(i,j));

            i=j;
        }

        return res;
    }
}

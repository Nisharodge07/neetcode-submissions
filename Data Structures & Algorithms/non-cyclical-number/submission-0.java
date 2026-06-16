class Solution {
    public boolean isHappy(int n) {

        Set<Integer> set = new HashSet<Integer> ();


        while(! set.contains(n)){

            set.add(n);

            n=sumOfSquares(n);

            if(n==1){
                return true;
            }
        }

        return false;
        
    }



    private int sumOfSquares(int n){

        int sum=0;

        while(n!=0){
            int digit = n % 10;
            digit= digit*digit;
            sum+=digit;
            n/=10;
        }

        return sum;
    }
}

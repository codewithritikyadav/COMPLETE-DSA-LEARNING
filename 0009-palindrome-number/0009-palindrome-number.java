class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int org = x;
        int reverse , temp = 0 ;
        if(num==0 ){
            return true;
        }
        else if(num<0){
            return false;
        }
        while(num>0){
            reverse = num%10;
            temp= temp*10 + reverse;
            num = num/10;


       } 
       if(temp == org){
        return true;
       }
       else{
        return false;
       }
    }
}
class Solution {
    public String longestPalindrome(String s) {
        String subs="";
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                subs=s.substring(i,j+1);
                if(isPalin(subs)&& res.length()<subs.length())
                res=subs;
            
        }
        }
        
       return res;


        
    }
    public boolean isPalin(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

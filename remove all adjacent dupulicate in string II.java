class Solution {
    public String removeDuplicates(String s, int k) {
       StringBuilder str=new StringBuilder();
       int count[]=new int[s.length()];
       for(char c:s.toCharArray()){
        int n=str.length();
        str.append(c);
        if(n>0 && str.charAt(n-1)==c)
        count[n]=count[n-1]+1;
        else
        count[n]=1;
        if(count[n]==k)
        str.delete(n-k+1,n+1);
       }
       return str.toString();
       }
}
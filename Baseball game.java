class Solution {
    public int calPoints(String[] operations) {
        int a[]=new int[operations.length];
        int n=0,sum=0;
        for(String s:operations){
            if(s.equals("C"))sum-=a[--n];
            else if(s.equals("D")) { a[n]=2*a[n-1]; sum+=a[n++];}
            else if(s.equals("+")) { a[n] =a[n-1]+a[n-2]; sum+= a[n++];}
            else { a[n]=Integer.parseInt(s); sum+=a[n++];}
        }
        return sum;
    }
}
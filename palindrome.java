 
class palindrome{
    public static void main(String[]args){

        int x = 121;
       palindrome obj = new palindrome();
       boolean out = obj.palindromeNumber(x);
       System.out.println(out);
    }



    public boolean palindromeNumber(int x){

        int reverse = 0;
        if(x<0||x%10==0&&x!=0){
            return false;
        }
        while(reverse<x){
            reverse = reverse*10 + x%10;
            x/=10;
        }
        return(reverse==x||reverse/10==x);
    }
}
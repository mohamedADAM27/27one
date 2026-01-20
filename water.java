
class water{
    public static void main (String[]args){

        int[] height={8,2,3,4,7};

        water w = new water();
        int answer = w.container(height);
        System.out.println(answer);
    }
    public int container(int[]height){

        int left =0;
        int right =height.length-1;
        int result = 0;

        while(left<right){
            int width = right-left;
            int heightone=Math.min(height[left],height[right]);

           int watervolume = width*heightone;
            result = Math.max(result,watervolume);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
    

    return result;
}
}
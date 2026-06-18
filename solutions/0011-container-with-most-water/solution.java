class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int h=0,w=0;
        int area=0;
        while(i<j){
             w=j-i;
            if(height[i]<height[j]){
                 h=height[i];
                 i++;
            }
            else{
                h=height[j];
                j--;
            }
            int temp=w*h;
            if(area<temp){

                area=temp;
            }

            
        }
        return area;
        
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max =-1;
        for(int i:candies){
            if(i>max){
                max =i;
            }
        }
        List<Boolean> re = new ArrayList();
        for(int i : candies){
            if(i+extraCandies >= max){
                re.add(true);

            }
            else{
                re.add(false);
            }
        }
        return re;
    }
}
         
        
    

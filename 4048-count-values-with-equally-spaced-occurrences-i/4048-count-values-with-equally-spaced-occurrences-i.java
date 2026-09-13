class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans=0;
        for(ArrayList<Integer> pos:map.values()){
            if(pos.size()==3 && pos.get(1)-pos.get(0)==pos.get(2)-pos.get(1)){
                ans++;
            }
        }
        return ans;
    }
}
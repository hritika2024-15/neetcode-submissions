class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        int[] ans = new int[k];

        for(int j=0;j<k;j++){
            int max = map.keySet().iterator().next();

            for(int n : map.keySet())
                if(map.get(n) > map.get(max))
                    max = n;

            ans[j] = max;
            map.remove(max);
        }
        return ans;
    }
}
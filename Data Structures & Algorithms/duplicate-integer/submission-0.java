class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(var ele:nums)
            if(!st.add(ele))
                return true;
        return false;
    }
}
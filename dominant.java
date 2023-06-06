class dominant{
    public int dominantIndex(int[] nums) {
        int max=0;
        int j=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                    j=i;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[n-1]<2*nums[i]){
                return -1;
            }
        }
        return j;
    }
}

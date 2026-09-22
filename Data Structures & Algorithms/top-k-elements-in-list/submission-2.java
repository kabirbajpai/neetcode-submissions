class Solution {
    class info implements Comparable<info>{
        int val;
        int freq;
        info(int val,int freq){
            this.val=val;
            this.freq=freq;
        }
        @Override
        public int compareTo(info i2){
            return i2.freq-this.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
            
        }

        PriorityQueue<info> pq = new PriorityQueue<>();
        for(Integer key: map.keySet()){
            pq.add(new info(key,map.get(key)));
        }
        int i=0;
        int ans[]=new int[k];



        while(k!=0){
            info curr=pq.remove();
            ans[i++]=curr.val;
            k--;
        

        }

        return ans ;
       

        

        
    }
}

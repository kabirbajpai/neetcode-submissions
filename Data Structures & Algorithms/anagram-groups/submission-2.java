class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(!map.containsKey(str)){
                map.put(str,new LinkedList<>());
            }

           map.get(str).add(strs[i]);
            

        }

        List<List<String>> ans = new LinkedList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
            
            
        }

        return ans ;

       
        
    }
}

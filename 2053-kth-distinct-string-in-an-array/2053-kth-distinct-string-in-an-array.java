class Solution {
    public String kthDistinct(String[] arr, int k) {
        //count freuency of each strings
        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        List<String> list=new ArrayList<String>();
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                list.add(entry.getKey());
            }
        }
        if(list.size()<k){
            return "";
        }
        String result=list.get(k-1);
        return result;
    }
}
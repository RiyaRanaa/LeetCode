class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> _map= new HashMap();
        for(int t:target){
            int count=_map.getOrDefault(t,0);
            _map.put(t,count+1);
        }
        for(int a:arr){
            if(_map.containsKey(a) && _map.get(a)>0){
                _map.put(a, _map.get(a)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
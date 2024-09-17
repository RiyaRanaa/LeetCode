class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String str : s1.split(" ")) {
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }
        for (String str : s2.split(" ")) {
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }
        List<String> list = new ArrayList<>();
        for (String str : s1.split(" ")) {
            if(this.check(map1, map2, str)){
                list.add(str);
            }
        }
        for (String str : s2.split(" ")) {
            if(this.check(map1, map2, str)){
                list.add(str);
            }
        }
        return list.toArray(new String[0]);
    }

    private boolean check(Map<String,Integer> map1, Map<String,Integer> map2, String str){
        if(((map1.containsKey(str) && !map2.containsKey(str)) ||
         (!map1.containsKey(str) && map2.containsKey(str))) && 
         !(map1.getOrDefault(str, 0) > 1) && !(map2.getOrDefault(str, 0) > 1)){
                return true;
        }
        return false;
    }
}
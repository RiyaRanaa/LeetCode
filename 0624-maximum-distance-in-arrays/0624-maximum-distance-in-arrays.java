import java.util.List;
class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=arrays.get(0).get(0);
        int max=arrays.get(0).get(arrays.get(0).size()-1);
        int maxDis=0;

        for(int i=1;i<arrays.size();i++){
            int minVal=arrays.get(i).get(0);
            int maxVal=arrays.get(i).get(arrays.get(i).size()-1);

            maxDis=Math.max(maxDis, Math.abs(maxVal - min));
            maxDis=Math.max(maxDis, Math.abs(max - minVal));

            min=Math.min(min,minVal);
            max=Math.max(max,maxVal);
        }
        return maxDis;
    }
}
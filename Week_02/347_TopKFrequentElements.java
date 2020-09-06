class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       // 统计出现次数
       Map<Integer,Integer> map = new HashMap<>();
       for(int n : nums){
           map.put(n,map.getOrDefault(n,0)+1);
       }
       // 创建堆
       PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           heap.add(entry);
       }
       // 取出堆顶元素
       int[] res = new int[k];
       for(int i=0;i<k;i++){
           Map.Entry<Integer,Integer> entry = heap.poll();
           res[i] = entry.getKey();
       }
       return res;

    }
}
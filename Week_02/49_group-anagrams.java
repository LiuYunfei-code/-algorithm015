class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       if (strs.length == 0){
           return new ArrayList();
       }
       Map<String,List> res = new HashMap<>();
       for (String s : strs){
           char[] str = s.toCharArray();
           Arrays.sort(str);
           String key = String.valueOf(str);
           if (!res.containsKey(key)) {
               res.put(key,new ArrayList());
           }
           res.get(key).add(s);
       }
       return new ArrayList(res.values());
    }
}
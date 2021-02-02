class Solution {
    public String convert(String s, int numRows) {
        Map<Integer,StringBuilder> map = new HashMap<>();
            int pas = 0;
            boolean incr = true;
            for(char c: s.toCharArray()){
                if(pas == numRows) incr = false;
                if(pas == 1) incr = true;
                if(incr) pas++;
                else
                    pas--;
                if(!map.containsKey(pas))
                    map.put(pas, new StringBuilder());
                map.get(pas).append(c);
            }
            StringBuilder res = new StringBuilder();
            for(int i : map.keySet()){
              res.append(map.get(i));
            }
            return res.toString();
    }
}
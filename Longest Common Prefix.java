  public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String profix = strs[0];
        for(int i = 1; i < strs.length;i++){
       while(strs[i].indexOf(profix) != 0){
            profix = profix.substring(0, profix.length() -1);
       }
        }
        return profix;
    }
}
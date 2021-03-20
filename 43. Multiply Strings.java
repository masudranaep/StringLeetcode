  public String multiply(String num1, String num2) {
        char[] chs1 = num1.toCharArray();
        char[] chs2 = num2.toCharArray();
        int n1 = chs1.length, n2 = chs2.length;
       char[] res = new char[n1+n2];
        Arrays.fill(res, '0');
        
        for(int i = n2 - 1; i >= 0; i--){
            for(int j = n1 - 1; j >= 0; j--){
                int prduct = (chs1[j] - '0') * (chs2[i] - '0');
                
                int temp = res[j + i + 1] - '0' + prduct;
                res[j + i + 1] = (char) (temp %10 + '0');
                res[j + i ] = (char) ((res[j + i] - '0' + temp/10) + '0');
                
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean seen = false;
        for(char c : res){
            if(c == '0' && !seen)continue;
                sb.append(c);
            seen = true;
            
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        String f_string = "";
        for(char c : s.toCharArray()){
           if(Character.isDigit(c) || Character.isLetter(c)){
                f_string += c;
           }
        }
        f_string = f_string.toUpperCase();
        int a_pinter = 0;
        int b_pinter = f_string.length() - 1;
        while(a_pinter <= b_pinter){
            if(f_string.charAt(a_pinter) != f_string.charAt(b_pinter)){
                return false;
                
            }
            a_pinter += 1;
            b_pinter -= 1;
        }
        return true;
    }
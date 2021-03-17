    public int myAtoi(String s) {
       long num = 0;
        char[] chars = s.toCharArray();
        if(chars.length == 0) return 0;
        int i = 0, sign = 1;
        char current = chars[i];
        
        //skip all the prosecing whitespace
        while(current == ' '){
            i++;
            if(i == chars.length)return 0; 
            current = chars[i];
        }
        //check if there is either a '+' or '-' in front of the numbe and if ther is 
        // set the integer sign to refleat the current parity of the number
        if(current == '-'){
            sign = -1;
            i++;
      }
        else if(current == '+'){
            sign = 1;
            i++;
        }
        // go through the rest of the characters int String
        for(; i < chars.length;i++){
            current  = chars[i];
         // in the charaters is not an integer, then the integer  is done   
         // and ewejust have to return the whatover we already get
            
          if(current < '0' || current > '9' )break;
            
          // is the current charaters is an Integer, then we have to append it to the 
          // exiting number, and check if the number is going out of if integer bounds
          else {
              num *= 10;
              num += current  -'0';
              if(sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
              else if (sign * num > Integer.MAX_VALUE)return Integer.MAX_VALUE;
          }
        } 
        //append the sign to the number and return the number
        num *= sign;
        return(int) num;
      
    }
}
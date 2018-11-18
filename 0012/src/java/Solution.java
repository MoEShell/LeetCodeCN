class Solution {
    public String intToRoman(int num) {

        if ( num <= 0 || num > 3999)    return "";

        String temp10 = "IXCM";
        String temp5 = "VLD";
        String roman = "";
        char ch1, ch2;
        int scale = 1000, digit = 4;

        while (scale > 0 && num > 0){
            int tmp = num / scale;

            if(tmp > 0){


                if (tmp / 5 == 0){
                    if (tmp == 4){
                        roman += String.valueOf(temp10.charAt(digit - 1)) + String.valueOf(temp5.charAt(digit - 1));
                    }
                    else {
                        for ( int i = 0; i < tmp; i++){
                            roman += String.valueOf(temp10.charAt(digit - 1));
                        }
                    }
                }
                else {
                    if (tmp == 9){
                        roman += String.valueOf(temp10.charAt(digit - 1)) + String.valueOf(temp10.charAt(digit));
                    }
                    else {
                        roman += String.valueOf(temp5.charAt(digit - 1));
                        for ( int i = 5; i < tmp; i++){
                            roman += String.valueOf(temp10.charAt(digit - 1));
                        }
                    }
                }
            }

            num -= (tmp * scale);
            scale /= 10;
            digit -= 1;

        }

        return roman;
    }
} 

package impl;


public class StringUtility {
    public String reverseString(String str) {
        StringBuilder strb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0;i--){
            strb.append(str.charAt(i));
        }

        return strb.toString();
    };

    public String capitalizeString(String str) {
        //List of ASCII values for chars:https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        StringBuilder strb = new StringBuilder();
        for(int i = 0; i<str.length();i++){

            char ch = str.charAt(i);
            if(97<=ch && ch <= 122){
                ch = (char) (ch-32);
            }
            strb.append(ch);
        }

        return strb.toString();
    };

    public String lowercaseString(String str) {
        //List of ASCII values for chars:https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        StringBuilder strb = new StringBuilder();
        for(int i = 0; i<str.length();i++){

            char ch = str.charAt(i);
            if(65<=ch && ch <= 90){
                ch = (char) (ch+32);
            }
            strb.append(ch);
        }

        return strb.toString();
    };
}

import java.util.*;
class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String ans ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans+=Character.toLowerCase(s.charAt(i));
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans+=s.charAt(i);
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans+=s.charAt(i);
            }


        }
        String ans1="";
        for(int i=ans.length()-1;i>=0;i--){
            ans1+=ans.charAt(i);
        }
        if(ans.equals(ans1)){
            //return true;
            System.out.print(true);
            System.exit(0);

        }
        //return false;
        System.out.print(false);

    }
}

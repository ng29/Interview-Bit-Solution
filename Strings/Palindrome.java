public class Solution {
    public int isPalindrome(String s) {
   s = s.toLowerCase();

StringBuilder builder = new StringBuilder();

for(int index = 0; index < s.length(); index++) {

Character temp = s.charAt(index);

if(Character.isLetterOrDigit(temp)) {

builder.append(temp.toString());

}

}

String tempString = builder.toString();

String otherString = builder.reverse().toString();

if(tempString.equals(otherString)) return 1;

return 0;
    }
}

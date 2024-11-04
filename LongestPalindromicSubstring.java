public class LongestPalindromicSubstring {

    public static void main(String[] args) {
    
    String input = "babad";
    
    System.out.println("Longest Palindromic Substring: " + longestPalindrome (input));
    
}
    
    public static String longestPalindrome(String str) {
    
    int n =str.length();
    
    int maxLength = 1;
    
    int start = 0;
    
    for (int i=0; i<n; i++) {
    
    for (int j = 1; j<n; j++) {
    
    if (isPalindrome(str, i, j)) {
    
    int length =j-i+1;
    
    if (length>maxLength)
    {
         maxLength=length;
         start = i; 
    } 
    }
  }
}
    
    String result = "";
    
    for (int i=start; i < start + maxLength; i++) { 
        result += str.charAt(i); 
    }
    
    return result;
    
    }
    public static boolean isPalindrome (String str, int l, int r){

while (l<r) {

if (str.charAt(l) != str.charAt(r))

{

return false;

}

l++;

r--;

}

return true;

}

}
    
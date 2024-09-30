package dsa.string.substring;

public class RepeatedSubstringPattern {
    public static void main(String[] args){
        String s = "abzab";
        System.out.println(patternRepeated(s));

    }

    private static boolean patternRepeated(String s) {
        return (s+s).substring(1,(s+s).length()-1).contains(s);
    }
}


//Pattern Repetition:
//If s can be constructed by repeating a substring p, then s will appear multiple times in the concatenated string s + s.
//By removing the first and last characters, we ensure that any repeated pattern p that forms s will still be present in the middle of the modified string.
//No False Positives:
//If s cannot be constructed by repeating a substring, then s will not appear as a substring in the modified string
// concatenatedString.substring(1, concatenatedString.length() - 1).

package dsa.string.easy;

public class ReverseVowelsOfString {
    public static void main(String[] args){
        String s = "abo";
        System.out.println(revereVowel(s));
    }

    private static String revereVowel(String s) {
        int l = 0;
        int r = s.length()-1;
        char[] array = s.toCharArray();
        while (l<r){
            if((array[l] == 'a' || array[l] == 'e' || array[l] == 'i' || array[l] == 'o' || array[l] == 'u'||
                    array[l] == 'A' || array[l] == 'E' || array[l] == 'I' || array[l] == 'O' || array[l] == 'U') &&
                    (array[r] == 'a' || array[r] == 'e' || array[r] == 'i' || array[r] == 'o' || array[r] == 'u'||
                            array[r] == 'A' || array[r] == 'E' || array[r] == 'I' || array[r] == 'O' || array[r] == 'U')){
                char temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            } else if ((array[l] != 'a' || array[l] != 'e' || array[l] != 'i' || array[l] != 'o' || array[l] != 'u'||
                    array[l] != 'A' || array[l] != 'E' || array[l] != 'I' || array[l] != 'O' || array[l] != 'U') &&
                    (array[r] == 'a' || array[r] == 'e' || array[r] == 'i' || array[r] == 'o' || array[r] == 'u'||
                            array[r] == 'A' || array[r] == 'E' || array[r] == 'I' || array[r] == 'O' || array[r] == 'U')) {
                l++;
            } else {
                r--;
            }
        }
        return new String(array);
    }
}

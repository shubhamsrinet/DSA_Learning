package dsa.string.easy;

public class ExcelSheetToColumnNumber {
    public static void main(String[] args){
        String s1 = "ZY";
        System.out.println(convert(s1));
    }

    private static int convert(String s1) {
        int result =0;
        for(int i=0;i<s1.length();i++){
            int number = s1.charAt(i) - 'A'+1;
            result = result * 26 + number;
        }
        return result;
    }
}

package dsa.string.easy;

public class ExcelSheetColumnTile {
    public static void main(String[] args){
        int num = 701;
        System.out.println(returnString(num));
    }

    private static String returnString(int num) {

        StringBuilder column = new StringBuilder();

        while (num > 0){
            num--;
            int reminder = num % 26;
            column.append((char)(reminder+'A'));
            num = num / 26;
        }
        return column.reverse().toString();
    }
}


//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
//For example:
//A -> 1
//B -> 2
//C -> 3
//Example 1:
//Input: columnNumber = 1
//Output: "A"
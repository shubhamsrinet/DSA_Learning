package dsa.string.easy;

public class ConvertDateToBinary {
    public static void main(String[] args){
        String s = "1900-01-01";
        System.out.println(convertBinary(s));
    }

    private static String convertBinary(String s) {
        String[] strArray = s.split("-");
        StringBuilder ssb = new StringBuilder();
        for (String string : strArray) {
            int num = Integer.parseInt(string);
            StringBuilder sb = new StringBuilder();
            while (num > 1) {
                if (num % 2 == 1) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                num = num / 2;
            }
            sb.append(1);
            ssb.append(sb.reverse()).append("-");
        }
        return ssb.substring(0, ssb.length() - 1);
    }
}

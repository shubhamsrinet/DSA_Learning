package dsa.string.medium;

public class CountAndSay {
    public static void main(String[] args){
        System.out.println(count(4));
    }

    private static String count(int num) {
        String result ="1";
        for(int i=1;i<num;i++){
            result = createArrayOfPairs(result);
        }
        return result;
    }

    private static String createArrayOfPairs(String num) {

        StringBuilder sb = new StringBuilder();
        int count=1;
        char currentChar = num.charAt(0);
        for(int i=1;i<num.length();i++){
            if(currentChar == num.charAt(i)){
                count++;
            }else{
                sb.append(count).append(currentChar);
                currentChar = num.charAt(i);
                count=1;
            }
        }
        sb.append(count).append(currentChar);
        return sb.toString();
    }
}

package dsa.string;

public class LongSubstringWithoutRepeatNaive {
    public static void main(String[] args){
        String s = "geeksforgeeks";
        System.out.println(longestSubstring(s));

    }

    private static int longestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int res =0;
        for(int i=0;i<s.length();i++){
            boolean[] visited = new boolean[256];
            for(int j=i;j<s.length();j++){
                if(visited[s.charAt(j)]){
                    break;
                }
                else {
                    res = Math.max(res,j-i+1);
                    visited[s.charAt(j)] = true;
                }

            }
        }
        return res;
    }
}

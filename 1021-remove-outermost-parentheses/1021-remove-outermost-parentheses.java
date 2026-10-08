class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int opened=0;
        char[] arr=s.toCharArray();
        for(char c:arr){
            if(c=='('){
                if(opened>0){
                    res+=c;
                   
                }
                 opened++;
            }
            else if(c==')'){
                if(opened>1){
                    res+=c;
                    
                }
                opened--;
            }
        }
        return res;
    }
}
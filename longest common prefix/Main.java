class Solution{
    public String longestCommon(String str[],int n){
        int min = str[0].length();
        int index = 0;
        for(int i=1;i<n;i++){
            if(min>str[i].length()){
                min = str[i].length();
                index = i;
            }
        }
        int count=0;
        String res = "";
        for(int i=0;i<min;i++){
            char ch = str[index].charAt(i);
            boolean valid = true;
            for(int j=0;j<n;j++){
                if(str[j].charAt(i)!=ch){
                    valid = false;
                    break;
                }
            }
            if(!valid)
                break;
            else
                res = res+ch;
        }
        if(res.length()!=0)
            return res;   
        return "-1";
    }
}
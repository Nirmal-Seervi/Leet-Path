class Solution {
    public int minChanges(String str) {
        char current = str.charAt(0);
        int count = 0;
        int mincount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == current){
                count++;
                continue;
            }
            if(count % 2 == 0){
                count = 1;
                //mincount++;
            }else{
                count = 0;
                mincount++;
            }
            current = str.charAt(i);
        }
        return mincount;
    }
}
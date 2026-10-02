class Solution {
    List<String> result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        BackTrack("",0,0,n);
        return result;
    }

    public void BackTrack(String current,int open,int close,int n){
        if(current.length()==2*n){
            result.add(current);
            return;
        }

        if(open<n){
            BackTrack(current+"(",open+1,close,n);
        }

        if(close<open){
            BackTrack(current+")",open,close+1,n);
        }
    }
}

class Solution {
   
    void solve(String s, int count,StringBuilder curr, int i,HashSet<String>st){

        if(count<0) return;
        if(i==s.length()){
            if(count==0){
                st.add(curr.toString());
            }
           
            return;
        }

        char ch=s.charAt(i);
        if(ch!='(' && ch!=')') {//means normal alphabet
        curr.append(ch);
        solve(s,count,curr,i+1,st);
        curr.deleteCharAt(curr.length() - 1); //backtrack
        return; 
        }

        curr.append(ch);//'(' or')
        solve(s,count + (ch == '(' ? 1 : -1),curr,i+1,st);
        curr.deleteCharAt(curr.length() - 1); //backtrack
        solve(s,count,curr,i+1,st);

    }
    public List<String> removeInvalidParentheses(String s) {
        HashSet<String>st=new HashSet<>();
        ArrayList<String>ans=new  ArrayList<>();
        int maxLen=0;
        
        
        solve(s,0,new StringBuilder(),0,st);

        for(String ele:st){
            maxLen=Math.max(maxLen,ele.length());
        }
        for(String ele:st){
           if(ele.length()==maxLen) ans.add(ele);
        }

return ans;
        
    }
}
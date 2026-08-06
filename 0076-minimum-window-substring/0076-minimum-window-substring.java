class Solution {
    HashMap<Character,Integer> map = new HashMap<>();
    HashMap<Character,Integer> map1 =new HashMap<>();
    public String minWindow(String s, String t) {
        
        for(char i:t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int l =0;
        int st=0;
        int e=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
            while(fre()){
                 if(e == Integer.MAX_VALUE ||(i-st+1)<(e-l+1)) {
                    l=st;
                    e=i;
                 }
                char left = s.charAt(st);
                map1.put(left, map1.get(left)-1);
                st++;
            }
            
        }
        if(e == Integer.MAX_VALUE)
            return "";
        return s.substring(l,e+1);
    }
         boolean fre(){
         for(char ch : map.keySet()){
            if(map1.getOrDefault(ch,0) < map.get(ch))
              return false;
         } 
        return true;
    }
}
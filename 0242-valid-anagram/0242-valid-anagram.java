import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(map.containsKey(current)){
                int oldCount = map.get(current);
                int newCount = oldCount + 1;
                map.put(current,newCount);
            }
            else{
                map.put(current, 1);
            }
        }
        for(int j = 0; j < t.length(); j++){
            char current = t.charAt(j);
            if(map.containsKey(current)){
                int oldCount  =  map.get(current);
                int newCount = oldCount - 1;
                map.put(current,newCount);
            
            if(newCount < 0){
                return false;
            }
         }
            else{
                return false;
            }
        }
        return true;
    }      
        

    
}
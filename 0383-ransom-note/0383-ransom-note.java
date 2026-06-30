import java.util.HashMap;
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> map = new HashMap<>();
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        for(int i = 0; i < magazine.length(); i++){
            char current = magazine.charAt(i);
            if(map.containsKey(current)){
                int oldCount = map.get(current);
                int newCount = oldCount + 1;
                map.put(current,newCount);
            }
            else{
                map.put(current,1);
            }
        } 
        for(int j = 0;j < ransomNote.length(); j++){
            char current = ransomNote.charAt(j);
            if(map.containsKey(current)){
                int oldCount = map.get(current);
                int newCount = oldCount-1;

            if(newCount<0){
                return false;
            }
            map.put(current,newCount);
                }
            else{
                return false;
            }
            
        }
        return true;
    }
}
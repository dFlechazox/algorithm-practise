package datas.exercise;

import java.util.HashMap;

public class FirstUniqueCharacter387 {                                      //哈希表存储频数
    public int firstUniqChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }
        for (int i = 0; i < s.length(); i++){
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}

package Hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Construct {
    public boolean canConstruct(String ransomNote, String magazine){        //我也是神人了，与异位词基本一样，想复杂了
        Map<Character, Integer> maga = new HashMap<>();
        int[] res = new int[ransomNote.length()];
        for (int i = 0; i < magazine.length(); i++){
            maga.put(magazine.charAt(i), maga.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++){
            maga.put(ransomNote.charAt(i), maga.getOrDefault(ransomNote.charAt(i), 0) - 1);
        }
        for (int i = 0; i < ransomNote.length(); i++){
            res[i] = maga.get(ransomNote.charAt(i));
            if (res[i] < 0){
                return false;
            }
        }
        return true;
    }

    public boolean canConstruct1(String ransomNote, String magazine){
        int[] res = new int[26];
        for (char i : magazine.toCharArray()){
            res[i - 'a'] += 1;
        }
        for (char i : ransomNote.toCharArray()){
            res[i - 'a'] -= 1;
        }
        for (int i = 0; i < 26; i++){
            if (res[i] < 0){
                return false;
            }
        }
        return true;
    }
}

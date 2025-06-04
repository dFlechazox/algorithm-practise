package Hash;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n){
        Set<Integer> record = new HashSet<>();
        while (!record.contains(n)){        //注意会无限循环
            record.add(n);
            n = getNextnumber(n);
        }
        return n == 1;
    }

    public int getNextnumber(int n){
        int res = 0;
        while (n != 0){
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}

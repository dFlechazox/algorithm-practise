package datas.exercise;

import java.util.ArrayList;
import java.util.List;

public class YangHui118 {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0;i < numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0;j <= i;j++){
                if (j == i || j == 0){
                    row.add(1);
                }
                else {
                    row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}

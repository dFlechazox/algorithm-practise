package datas.sort;

public class Selection extends SortAlgorithm{
    @Override
    public void sort(Comparable[] objs) {
        int N = objs.length;
        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                if (less(objs[j],objs[i])){
                    exchange(objs,i,j);
                }
            }
        }
    }
}

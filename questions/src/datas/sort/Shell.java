package datas.sort;

public class Shell extends SortAlgorithm{
    @Override
    public void sort(Comparable[] objs) {
        int gap = objs.length;
        int N = objs.length;
        while (gap>1)
        {
            //每次对gap折半操作
            gap = gap / 2;
            //单趟排序
            for (int i = 0; i < N - gap; ++i)
            {
                int end = i;
                while (end >= 0)
                {
                    if (less(objs[end + gap],objs[end]))
                    {
                        exchange(objs,end + gap,end);
                    }
                    else
                    {
                        break;
                    }
                }
            }
        }
    }
}

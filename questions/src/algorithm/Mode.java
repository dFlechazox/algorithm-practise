package algorithm;

public class Mode {
    public static void mode(int arr[], int l, int r) {
        int chong=0,zhong=0;
        int m, c1 = 0, c2 = 0, i, j, val;
        m = (r + l) / 2;
        i = m;
        j = m;
        val = arr[m];
        while (i >= l && arr[i] == val) {
            i--;
            c1++;
        }

        while (j <= r && arr[j] == val) {
            j++;
            c2++;
        }
        if (chong < j - i - 1) {
            chong = j - i - 1;
            zhong = val;
        }
        if (i - l + 1 > chong)
            mode(arr, l, i);
        if (r - j + 1 > chong)
            mode(arr, j, r);
    }
}

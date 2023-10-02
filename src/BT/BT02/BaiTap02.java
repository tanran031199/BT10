package BT.BT02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaiTap02 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(25, 64, 12, 64, 75, 23, 35, 27, 72, 37);

        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            arr.set(count, arr.get(i));
            count++;
        }

        System.out.println(arr);
    }
}

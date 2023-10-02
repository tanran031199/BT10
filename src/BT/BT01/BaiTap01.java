package BT.BT01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaiTap01 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        int n = (int)(Math.random() * 10);

        for (int i = 0; i <= n; i++) {
            arr.add((int)(Math.random() * 10) + 1);
        }

        System.out.println(arr);
        System.out.println(Collections.max(arr));
    }
}

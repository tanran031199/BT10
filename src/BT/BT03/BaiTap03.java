package BT.BT03;

import java.util.Arrays;
import java.util.List;

public class BaiTap03 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(14, 52, 72, 34, 82, 87, 12, 6, 41);

        arr.sort((o1, o2) -> o2 - o1);

        System.out.println(arr);
    }
}

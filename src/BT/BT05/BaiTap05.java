package BT.BT05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BaiTap05 {
    public static void main(String[] args) {
        String str = "Bố Thành vạn tuế blahhhhh bla blah";
        String[] p = str.split(" ");
        List<String> arr = new ArrayList<>();

        Collections.addAll(arr, p);

        int min = arr.get(0).length();
        String minStr = arr.get(0);

        for (String e: arr) {
            if(min > e.length()) {
                min = e.length();
                minStr = e;
            }
        }

        System.out.println("Ký tự có ít ký tự nhất là " + minStr.length() + " ký tự: " + minStr);
    }
}

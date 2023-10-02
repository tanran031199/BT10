package BT.BT04;

import java.util.ArrayList;
import java.util.List;

public class BaiTap04 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        List<Character> newList = new ArrayList<>();
        String kdl = "Rekkei Academy để nông dân biết code";

        for (int i = 0; i < kdl.length(); i++) {
            if (kdl.charAt(i) != 32) {
                list.add(kdl.charAt(i));
            }
        }
        System.out.println(list);


        System.out.print("Các ký tự có 3 lần xuất hiện trở lên là: ");
        for (char c : list) {
            int count = 0;

            for (char c1 : list) {
                if (c1 == c) count++;
            }

            if (count >= 3) {
                if (!newList.contains(c)) {
                    newList.add(c);
                }
            }
            ;
        }

        newList.forEach(e -> {
            if (e == list.get(list.size() - 1)) {
                System.out.print("\u001B[33m" + e);
            } else {
                System.out.print("\u001B[33m, " + e);
            }
        });
    }
}

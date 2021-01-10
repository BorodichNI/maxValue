package secondWay;

import java.util.ArrayList;
import java.util.Collections;

public class maxValue2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(129);
        list.add(56);
        list.add(23);
        list.add(3);
        list.add(196);
        list.add(111);
        Collections.sort(list);
        System.out.println("Максимальный элемент: " + list.get(list.size() - 1));
        System.out.println("Второй максимальный: " + list.get(list.size() - 2));
    }

}

package thirdWay;

import java.util.ArrayList;

public class maxValue3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(3);

        int max1 = 0;
        int max2 = 0;

        for (Integer i: list){
            if(i > max1){
                max2 = max1;
                max1 = i;
            } else if (max2 < i) {
                max2 = i;
            }
        }

        System.out.println(max2);
    }

}

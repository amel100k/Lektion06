package rekursion;

import java.util.ArrayList;

public class Opgave01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(10);
        list.add(17);
        list.add(4);
        list.add(8);
        list.add(45);
        list.add(29);
        System.out.println(ligeTal2(list));

    }
    public static int ligeTal1(ArrayList<Integer> list){
        if (list.size() == 0){
            return 0;
        }
        else if (list.get(0) % 2 == 0){
            list.remove(0);
            return ligeTal1(list) + 1;
        }
        list.remove(0);
        return ligeTal1(list);
    }
    public static int ligeTal2(ArrayList<Integer> list){
        return ligeTal2(list, 0);
    }
    public static int ligeTal2(ArrayList<Integer> list, int index){
        int result;
        int firstElement = list.remove(0);
        if (list.size() == 0){
            return 0;
        }
        else if (firstElement % 2 == 0) {
            return ligeTal2(list) + 1;
        }
        return ligeTal2(list);
    }
}

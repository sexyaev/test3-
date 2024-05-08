import java.util.ArrayList;
import java.util.List;

public class ListSwap {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(7);
        int x = 4;

        System.out.println("Исходный список: " + list);

        int left = 0;
        int right = list.size() - 1;



        while (left < right) {

            if (list.get(left) <= x) {
                left++;
            } else if (list.get(right) > x) {
                right--;
            } else {

                int temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;


            }


        }



        System.out.println("Список после перестановки: " + list);
    }


}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        // можно из исходного списка удалять элементы, которые не соответствуют условиям, но
        // временная сложность операции для ArrayList О(n), поэтому для скорости работы программы
        // создадим новый список
        List<Integer> result = new ArrayList<>();
        for (Integer x : intList) {
            if ((x > 0) && (x % 2 == 0) ) {
                result.add(x);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
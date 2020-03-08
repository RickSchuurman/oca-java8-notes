package core_java_apis.arrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(99,5,81);
        Collections.sort(list);
        System.out.println(list); // [5, 81, 99]
    }
}

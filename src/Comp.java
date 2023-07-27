import java.util.*;

public class Comp {
    public static void main(String[] args) {
       List<Integer> arrayList = Arrays.asList(12,5,10,18,15);

        Collections.sort(arrayList,new IntComparator());

        System.out.println(arrayList);
    }
}
class IntComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
package StreamApi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer>nums = List.of(2,4,1,8,9,2,4,8,5);
        Set<Integer>uniqueNums = new HashSet<>();
        //Duplicates
        Set<Integer> duplicates  = nums.stream().filter(i->!uniqueNums.add(i)).collect(Collectors.toSet());
        System.out.println(duplicates);

        //max

    }
}

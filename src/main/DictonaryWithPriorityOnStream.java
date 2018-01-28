package main;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Konopatova on 28.01.2018.
 */
public class DictonaryWithPriorityOnStream {
    private String result = "[]";

    public DictonaryWithPriorityOnStream(String string) {
        if (string != "") {
            Map<String, List<String>> groups = Arrays.stream(string.split(" "))
                    .sorted(new StringLengthComparator())
                    .collect(Collectors.groupingBy((p) -> p.substring(0, 1))
                );
            String  filter = groups.entrySet().stream()
                    .filter(el -> el.getValue().size() > 1)
                    .sorted((p1, p2) -> p1.getKey().compareTo(p2.getKey()))
                    .map(p ->  p.getKey() + "=" + p.getValue())
                    .collect(Collectors.joining(", " , "[", "]")
                );
            result = filter;
        }
    }

    @Override
    public String toString(){
        return  result;
    }
}

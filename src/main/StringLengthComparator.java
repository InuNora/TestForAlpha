package main;

import java.util.Comparator;

/**
 * Created by Konopatova on 27.01.2018.
 */
public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y)
    {
        if (x.length() > y.length())
        {
            return -1;
        }
        if (x.length() < y.length())
        {
            return 1;
        }
        int result = x.compareTo(y);
        return result;
    }
}

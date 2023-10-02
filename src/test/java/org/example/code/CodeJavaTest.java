package org.example.code;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

public class CodeJavaTest extends TestCase {

    public void testMain() {
        List<Integer> list = Arrays.asList(1, 23, 45, 67, 89, 0);

        List<Integer> ll = Collections.singletonList(list.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst().get());
        assertEquals(89,ll);



    }
}
package Greedy;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PartitionLabelsTest {
    @Mock
    private PartitionLabels solution;

    @Before
    public void setUp() {
        solution = new PartitionLabels();
    }

    @Test
    public void testcase1() {
        String input = "ababcbacadefegdehijhklij";
        List<Integer> expected = Arrays.asList(9, 7, 8);
        assertEquals(expected, solution.partitionLabels(input));
    }
}

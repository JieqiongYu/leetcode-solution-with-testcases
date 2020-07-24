package BreadthFirstSearch.Graph;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

public class TopologicalSortingTest {

    @Mock
    private TopologicalSorting solution;

    @Before
    public void setUp() {
        solution = new TopologicalSorting();
    }

    /**
     * Example 1.
     */
    @Test
    public void testcase1() {
        ArrayList<String> expected = getExpectedList();
        ArrayList<DirectedGraphNode> input = new ArrayList<>();
        input = initializeInput(input);
        ArrayList<DirectedGraphNode> result = solution.topSort(input);
        String actual = resultToArray(result);
        Assert.assertTrue(expected.contains(actual));

    }

    public ArrayList<String> getExpectedList() {
        String expected1 = "023154";
        String expected2 = "012345";
        ArrayList<String> expected = new ArrayList<>();
        expected.add(expected1);
        expected.add(expected2);
        return expected;
    }

    public ArrayList<DirectedGraphNode> initializeInput(ArrayList<DirectedGraphNode> input) {
        DirectedGraphNode node4 = new DirectedGraphNode(4);
        input.add(node4);
        DirectedGraphNode node5 = new DirectedGraphNode(5);
        input.add(node5);
        DirectedGraphNode node3 = new DirectedGraphNode(3);
        node3.neighbors.add(node4);
        node3.neighbors.add(node5);
        input.add(node3);
        DirectedGraphNode node2 = new DirectedGraphNode(2);
        node2.neighbors.add(node4);
        node2.neighbors.add(node5);
        input.add(node2);
        DirectedGraphNode node1 = new DirectedGraphNode(1);
        node1.neighbors.add(node4);
        input.add(node1);
        DirectedGraphNode node0 = new DirectedGraphNode(0);
        node0.neighbors.add(node1);
        node0.neighbors.add(node2);
        node0.neighbors.add(node3);
        input.add(node0);
        return input;
    }

    public String resultToArray(ArrayList<DirectedGraphNode> result) {
        StringBuilder sb = new StringBuilder();
        int[] actual = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i).label);
        }
        return sb.toString();
    }
}

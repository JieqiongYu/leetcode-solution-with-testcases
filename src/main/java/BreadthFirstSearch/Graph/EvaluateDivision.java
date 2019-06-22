package BreadthFirstSearch.Graph;

import java.util.*;

public class EvaluateDivision {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.length; i++) {
            addArc(graph, equations[i][0], equations[i][1], values[i]);
            addArc(graph, equations[i][1], equations[i][0], 1 / values[i]);
        }

        double[] answer = new double[queries.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getValue(graph, queries[i][0], queries[i][1]);
        }

        return answer;
    }

    public void addArc(Map<String, Map<String, Double>> graph, String vexStart, String vexEnd, double value) {
        Map<String, Double> arcMap;
        if (graph.containsKey(vexStart)) {
            arcMap = graph.get(vexStart);
        } else {
            arcMap = new HashMap();
        }
        arcMap.put(vexEnd, value);
        graph.put(vexStart, arcMap);
    }

    public double getValue(Map<String, Map<String, Double>> graph, String vexStart, String vexEnd) {
        if (graph.get(vexStart) == null || graph.get(vexEnd) == null) {
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        Map<String, Double> valueMap = new HashMap<>();
        Set<String> set = new HashSet<>();

        // init
        queue.offer(vexStart);
        valueMap.put(vexStart, 1d);
        set.add(vexStart);

        String currentVex;
        String nextVex;
        while (!queue.isEmpty()) {
            currentVex = queue.poll();
            for (Map.Entry<String, Double> arc : graph.get(currentVex).entrySet()) {
                nextVex = arc.getKey();
                // From the vexStart to vexEnd
                valueMap.put(nextVex, valueMap.get(currentVex) * arc.getValue());
                if (nextVex.equals(vexEnd)) {
                    return valueMap.get(vexEnd);
                } else if (!set.contains(nextVex)) {
                    queue.offer(nextVex);
                    set.add(nextVex);
                }
            }
        }

        return -1;
    }
}

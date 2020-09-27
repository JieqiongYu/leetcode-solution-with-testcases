package BreadthFirstSearch.Graph;

import java.util.*;

public class EvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            addArc(graph, equations.get(i).get(0), equations.get(i).get(1), values[i]);
            addArc(graph, equations.get(i).get(1), equations.get(i).get(0), 1 / values[i]);
        }

        double[] answer = new double[queries.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = getValue(graph, queries.get(i).get(0), queries.get(i).get(1));
        }

        return answer;
    }

    public void addArc(Map<String, Map<String, Double>> graph, String vexStart, String vexEnd, double value) {
        Map<String, Double> arcMap;
        if (graph.containsKey(vexStart)) {
            arcMap = graph.get(vexStart);
        } else {
            arcMap = new HashMap<>();
        }

        arcMap.put(vexEnd, value);
        graph.put(vexStart, arcMap);
    }

    public double getValue(Map<String, Map<String, Double>> graph, String vexStart, String vexEnd) {
        if (graph.get(vexStart) == null || graph.get(vexEnd) == null) {
            return -1;
        }

        Queue<String> queue = new LinkedList<>();
        Map<String, Double> value = new HashMap<>();
        Set<String> set = new HashSet<>();

        // init
        queue.offer(vexStart);
        value.put(vexStart, 1d);
        set.add(vexStart);

        // BFS
        String currentVex;
        String nextVex;
        while (!queue.isEmpty()) {
            currentVex = queue.poll();
            for (Map.Entry<String, Double> arc : graph.get(currentVex).entrySet()) {
                nextVex = arc.getKey();
                value.put(nextVex, value.get(currentVex) * arc.getValue());
                if (nextVex.equals(vexEnd)) {
                    return value.get(nextVex);
                } else if (!set.contains(nextVex)) {
                    queue.offer(nextVex);
                    set.add(nextVex);
                }
            }
        }

        return -1;
    }
}

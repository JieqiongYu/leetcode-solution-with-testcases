package BFS;

import java.util.*;

/**
 * [LeetCode][433] Minimum Genetic Mutation. 
 *
 * @author jieqiong.yu
 */
public class MinimumGeneticMutation {
    
    public int minMutation(String start, String end, String[] bank) {
        if (bank == null || bank.length == 0) {
            return -1;
        }
        
        Set<String> bankSet = new HashSet<>();
        bankSet.addAll(Arrays.asList(bank));
        
        bankSet.add(start);
        
        Queue<String> queue = new LinkedList<>();
        Set<String> set = new HashSet<>();
        queue.offer(start);
        set.add(start);
        
        int length = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            length++;
            for (int i = 0; i < size; i++) {
                String dna  = queue.poll();
                for (String nextDNA : getNextDNA(dna, bankSet)) {
                    if (set.contains(nextDNA)) {
                        continue;
                    }
                    if (end.equals(nextDNA)) {
                        return length;
                    }
                    queue.offer(nextDNA);
                    set.add(nextDNA);
                }
            }
        }
        
        return -1;
        
    }
    
    private List<String> getNextDNA(String dna, Set<String> bankSet) {
        List<String> nextDNAList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < dna.length(); j++) {
                String nextDNA = replace(dna, i, j);
                if (bankSet.contains(nextDNA)) {
                    nextDNAList.add(nextDNA);
                }
            }
        }
        return nextDNAList;
    }
    
    private String replace(String dna, int i, int j) {
        char[] dnaChar = dna.toCharArray();
        switch(i) {
            case 0:
                dnaChar[j] = 'A';
                break;
            case 1: 
                dnaChar[j] = 'C';
                break;
            case 2: 
                dnaChar[j] = 'G';
                break;
            default:
                dnaChar[j] = 'T';
        }
        
        return new String(dnaChar);
    }
}

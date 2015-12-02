package week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordNet {

    // Adjacency List.
    private Map<String, List<String>> adjacencyList = new HashMap<>();

    // Nouns Map
    private Map<String, String> nounsMap = new HashMap<>();

    // constructor takes the name of the two input files
    public WordNet(String synsets, String hypernyms) throws IOException {
        if (synsets == null || hypernyms == null) {
            throw new NullPointerException();
        }

        //Consume Synsets
        BufferedReader br = new BufferedReader(new FileReader(synsets));
        String line = null;

        while ((line = br.readLine()) != null) {
            String[] values1 = line.split(",");
            adjacencyList.put(values1[0], new LinkedList<String>());
            String[] synset = values1[1].split(" ");
            for (String syn : synset) {
                nounsMap.put(syn, values1[0]);
            }
        }
        br.close();

        //Consume Hypernyms
        BufferedReader br2 = new BufferedReader(new FileReader(hypernyms));
        String line2 = null;

        while ((line2 = br2.readLine()) != null) {
            String[] values2 = line2.split(",");
            if (adjacencyList.containsKey(values2[0])) {
                List<String> values = adjacencyList.get(values2[0]);
                for (int i = 1; i < values2.length; i++) {
                    values.add(values2[i]);
                }
                adjacencyList.put(values2[0], values);
            }
        }
        br2.close();


    }

    // do unit testing of this class
    public static void main(String[] args) throws IOException {
        WordNet wordNet = new WordNet("//Users//Manoj//workspace//DynamicPrograms//src//coursera//week1//synsets.txt",
                "//Users//Manoj//workspace//DynamicPrograms//src//coursera//week1//hypernyms.txt");
    }

    // returns all WordNet nouns
    public Iterable<String> nouns() {
        return null;
    }

    // is the word a WordNet noun?
    public boolean isNoun(String word) {
        return true;
    }

    // distance between nounA and nounB (defined below)
    public int distance(String nounA, String nounB) {
        return 0;
    }

    // a synset (second field of synsets.txt) that is the common ancestor of nounA and nounB
    // in a shortest ancestral path (defined below)
    public String sap(String nounA, String nounB) {
        return " ";
    }
}
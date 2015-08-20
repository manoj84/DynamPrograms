package code.crackingCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AirlineTickets {

    public static void main(String args[]) {
        String[][] tickets = { { "MUC", "LHR" }, { "CDG", "MUC" },
                { "SFO", "SJC" }, { "LHR", "SFO" } };

        Map<String, String> graph = new HashMap<String, String>();
        Set<String> relation = new HashSet<String>();

        String start = null;

        for (int i = 0; i < tickets.length; i++) {
            graph.put(tickets[i][0], tickets[i][1]);
            relation.add(tickets[i][1]);
        }

        Iterator<Entry<String, String>> itr = graph.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry temp = (Map.Entry) itr.next();
            if (!relation.contains(temp.getKey())) {
                start = temp.getKey().toString();
            }
        }

        List<String> sortedTicketsList = new ArrayList<String>();
        sortedTicketsList.add(start);
        // Now it is just about printing
        while (start != null) {

            String destinationString = graph.get(start);
            if (destinationString == null) {
                break;
            }
            sortedTicketsList.add(destinationString);
            start = destinationString;
        }

        System.out.println(sortedTicketsList);

    }
}

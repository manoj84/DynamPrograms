package depthFirstSearch;

import depthFirstSearch.Graph;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manoj
 * Date: 5/12/13
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class GraphTest{

    public static void main (String args[]){
        try{
            Graph graph = new Graph("//home//manoj//IdeaProjects//DynamPrograms//src/main//java//depthFirstSearch//file.txt");
            List<Node> neighbours = graph.getNeighBours(new Node(1));
            System.out.println(neighbours.size());

        }catch(IOException e){
            System.out.println("File not Found");
        }
    }
}

import java.util.*;

//Directed Weighted Graph Representation using Adjacency List.
public class DirectedWeightedGraph {
    static class Pair {
        int u;
        int v;
        int weight;
        Pair(int _u, int _v,int _weight) {
            u = _u;
            v = _v;
            weight = _weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes: ");
        int numberOfNodes = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int numberOfEdges = sc.nextInt();

        List<List<Pair>> adjacencyList = new ArrayList<>();

        for(int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new ArrayList<Pair>());
        }

        System.out.println("Enter the edges and their corresponding weight: ");
        for(int i = 0; i < numberOfEdges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            adjacencyList.get(u).add(new Pair(u, v, weight));
        }

        for(int node = 0; node < numberOfNodes; node++) {
            System.out.print("Neighbours of "+node+" are: ");
            for(Pair item: adjacencyList.get(node)) {
                System.out.print("("+item.v+ " , " + item.weight + ") ");
            }
            System.out.println();
        }
    }
}



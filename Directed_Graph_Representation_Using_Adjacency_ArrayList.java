import java.util.*;


//Directed Graph Representation using Adjacency List.
public class GraphRepresentationUsingList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes: ");
        int numberOfNodes = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int numberOfEdges = sc.nextInt();

        List<List<Integer>> adjacencyList = new ArrayList<>();

        for(int i = 0; i < numberOfNodes; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }

        System.out.println("Enter the edges: ");
        for(int i = 0; i < numberOfEdges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjacencyList.get(u).add(v);
        }

        for(int node = 0; node < numberOfNodes; node++) {
            System.out.print("Neighbours of "+node+" are: ");
            for(int item: adjacencyList.get(node)) {
                System.out.print(item+ " ");
            }
            System.out.println();
        }
    }
}



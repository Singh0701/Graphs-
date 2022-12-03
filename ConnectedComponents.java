import java.util.*;

public class ConnectedComponents {
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
            adjacencyList.get(v).add(u);
        }

        System.out.println("Graph Components");
        int componentCount = 1;

        int[] visited = new int[numberOfNodes];
        for(int node = 0; node < numberOfNodes; node++) {
            if(visited[node] == 0) {
                System.out.println("Component number: "+componentCount++);
                visited[node] = 1;
                traverse(node, adjacencyList, visited);
            }
            System.out.println();
        }
    }

    private static void traverse(int node, List<List<Integer>> adjacencyList, int[] visited) {
        System.out.print(node + " ");
        for(int neighbour: adjacencyList.get(node)) {
            if(visited[neighbour] == 0) {
                visited[neighbour] = 1;
                traverse(neighbour, adjacencyList, visited);
            }
        }
    }
}

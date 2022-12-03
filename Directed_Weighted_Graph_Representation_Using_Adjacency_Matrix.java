import java.util.*;

//Directed Weighted Graph Representation using Adjacency Matrix.
public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes: ");
        int numberOfNodes = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        int numberOfEdges = sc.nextInt();

        int[][] adjacencyMatrix = new int[numberOfNodes][numberOfNodes];

        System.out.println("Enter the edges: ");
        for(int i = 0; i < numberOfEdges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int weight = sc.nextInt();
            adjacencyMatrix[u][v] = weight;
        }

        for(int[] row: adjacencyMatrix) {
            for(int item: row) {
                System.out.print(item+ " ");
            }
            System.out.println();
        }
    }
}


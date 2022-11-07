public interface Graph {

    int getNumVertices();


    boolean isDirected();


    boolean isEdge(int source, int dest);


    void addEdge(int s, int d);

    void removeEdge(int s, int d);
}

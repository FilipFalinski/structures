public class AbstarctGraph implements Graph {
    private int numVertices;
    private boolean directed;

    public AbstarctGraph(int nV, boolean direct) {
        numVertices = nV;
        directed = direct;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public boolean isDirected() {
        return directed;
    }

    @Override
    public boolean isEdge(int source, int dest) {
        return false;
    }

    @Override
    public void addEdge(int s, int d) {

    }

    @Override
    public void removeEdge(int s, int d) {

    }
}

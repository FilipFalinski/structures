import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListGraph extends AbstarctGraph {

    private ArrayList<LinkedList<Integer>> lists;

    public ListGraph(int nV, boolean direct) {
        super(nV, direct);
        lists = new ArrayList<>(nV);

        for (int i = 0; i < nV; i++) {
            lists.set(i, new LinkedList<>());
        }

        public void addEdge (int s, int d){
            if (s < 0 || s >= getNumVertices())
                throw new IllegalArgumentException();
            lists.get(s).add(d);
        }
    }
}

import org.junit.AfterClass;

import static org.junit.jupiter.api.Assertions.*;

class MatrixGraphTest {


    private MatrixGraph graph;

    @AfterClass
    void setUpAtStart(){

        graph = new MatrixGraph(8, true);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,5);

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isEdge() {
        assertTrue(graph.isEdge(0,1));
        assertTrue(graph.isEdge(0,4));
    }

    @org.junit.jupiter.api.Test
    void addEdge() {
    }

    @org.junit.jupiter.api.Test
    void removeEdge() {
    }
}
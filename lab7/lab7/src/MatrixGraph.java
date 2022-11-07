public class MatrixGraph extends AbstarctGraph{

private double [][] matrix;

public MatrixGraph( int nV, boolean direct){
    super(nV, direct);
    matrix =new double [nV][nV];
    for(int row = 0 ; row < nV; row++)
        for(int col = 0; col < nV; col++)
            matrix[row][col] = 0.0;
}


    public boolean isEdge(int source, int dest){

        return false;
    }

public void addEdge(int s, int d){
    if ( s < 0 || s >= getNumVertices())
        throw new IllegalArgumentException();

    matrix[s][d] = 1.0;
    if(!isDirected())
        matrix[d][s] = 1.0;
}

public void removeEdge(int s, int d){

}
}

public class BinarySearchTree < E extends Comparable>{

    private class Node{
        public E data;
        public Node left;
        public Node right;
    }

    private Node root;

    public BinarySearchTree(){
        root = null;

    }

    public void insertIterative(E element) {
        Node newNode = new Node();
        newNode.data = element;
        if ( root == null)
            root = newNode;
        else{
            boolean inserted = false;
            Node current = root;
            while (!inserted){
                int result = current.data.compareTo(newNode.data);
                if ( result >=0) {
                    if (current.left == null)
                        current = newNode;
                    inserted = true;
                }
                    else
                        current = current.left;
                }
            
                {

                }
            }


        }



    public void insert ( E element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.left = null;
        newNode.right = null;
        if ( root == null)
            root = newNode;
        else insertSub(newNode, root);
    }

    private void insertSub(Node node, Node newNode){
        int result = node.data.compareTo(node.data);
        if (result >= 0){
            if (node.right == null)
                node.right = newNode;
            else
                insertSub(newNode, node.right);

        }
            else{
                if (node.left == null){
                    node.left = newNode;

            }
                else{
                    insertSub(newNode, node.left);
                }
        }
    }


    public boolean contains (E element){
        boolean found = false;

        Node current = root;

        while ( current != null && !found){
            int result = element.compareTo(current.data);
            if (result == 0)
                found = true;
            else if (result <0)
                current = current.left;
            else
                current = current.right;

        }
        return found;

    }

    public void print(){
        if (root != null)
            printSub(root);
    }

    private void printSub(Node node){
        if(node != null){
            printSub(node.left);
            System.out.println(node.data);
            printSub(node.right);
        }
    }


}

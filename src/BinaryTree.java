


public class BinaryTree {
    private Node root;


    public void  NewData(char data){
        root = NewData(root, new Node(data));
    }

    public Node NewData(Node root, Node addNew){
        if (root==null){
            root = addNew;
            return root;
        }
        if (addNew.data<root.data){
            root.left =NewData(root.left,addNew);
        }
        else {
            root.right =  NewData(root.right,addNew);
        }
        return root;
    }


    private void in(Node node){
        if (node !=null){
            in(node.left);
            System.out.print(node.data);
            in(node.right);
        }
    }

    private void pre (Node node){
        if (node!=null){
            System.out.print(node.data);
            pre(node.left);
            pre(node.right);
        }
    }

    private void post(Node node){
        if (node!=null){
            post(node.left);
            post(node.right);
            System.out.print(node.data);
        }
    }

    public void printPre(){
        System.out.println("pre order");
        pre(root);
        System.out.println("");
    }

    public void printPost(){
        System.out.println("post Order");
        post(root);
        System.out.println("");
    }

    public void printInOrder(){
        System.out.println("in order");
        in(root);
        System.out.println("");
    }


    private void inInt(Node node){
        if (node !=null){
            inInt(node.left);
            System.out.print(((int) node.data) +" ");
            inInt(node.right);
        }
    }

    private void preInt (Node node){
        if (node!=null){
            System.out.print(((int) node.data)+" ");
            preInt(node.left);
            preInt(node.right);
        }
    }

    private void postInt(Node node){
        if (node!=null){
            postInt(node.left);
            postInt(node.right);
            System.out.print(((int) node.data)+" ");
        }
    }
    public void printPreInt(){
        System.out.println("pre order");
        preInt(root);
        System.out.println("");
    }

    public void printPostInt(){
        System.out.println("post Order");
        postInt(root);
        System.out.println("");
    }

    public void printInOrderInt(){
        System.out.println("in order");
        inInt(root);
        System.out.println("");
    }

}

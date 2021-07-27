package selfwork10;

public class Three  {
    private Node root;

    public Three(int value) {
        this.root = new Node(value);
    }

    public void add(int value) {
        addRecursive(root, value);
    }

    private void addRecursive(Node node, int value) {
        if (node.left == null) {
            node.left = new Node(value);
            return;
        }
        if (node.right == null) {
            node.right = new Node(value);
            return;
        }
        if (value <= node.value) {
            addRecursive(node.left, value);
        } else {
            addRecursive(node.right, value);
        }
    }

    public void print() {
        printRecursive(root);
    }

    private void printRecursive(Node node) {
        System.out.println(node.value);
        if (node.left != null) {
            printRecursive(node.left);
        }
        if (node.right != null) {
            printRecursive(node.right);
        }
    }
}

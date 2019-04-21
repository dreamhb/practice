public class BST {

    //left node
    class Node {
        Node parent;
        Node left;
        Node right;
        int key;
    }

    public void search() {
    
    }

    public void insert(Node root, Node k) {

        Node x = root;

        //parent of the inserted position
        Node parent = null;

        //find the insert position
        while (x != null) {
            parent = x;
            if (k.key > x.key) {
                x = x.right;
            } else {
                x = x.left;
            }
        }

        if (parent == null) {
            //inserted tree is null
            //Tree.root = k;
            root.root = k;
        } else if(k.key < parent.key) {
            parent.left = k;
        } else {
            parent.right = k;
        }
    }

    /**
     * to delete node has three basic cases:
     * 
     * 1. has no child
     *    we just set n's parent's pointer to n to NULL
     * 2. has one child
     *    just replace n with its child
     * 3. has two child
     *    we need to find n's successor m in its right subtree,
     *    and n's left subtree be m's left tree, n's right tree be m's
     *    right tree
     * */
    public void delete(Node n) {
        //find n's position
        Node del = search(n);
        if (del.left == null && del.right == null) {
            del.parent.
        }
    }
}

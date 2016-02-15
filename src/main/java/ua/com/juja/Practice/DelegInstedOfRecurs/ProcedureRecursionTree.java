package ua.com.juja.Practice.DelegInstedOfRecurs;

/**
 * Created by serzh on 2/15/16.
 */
public class ProcedureRecursionTree implements Node {

    private NodeElement root;

    public ProcedureRecursionTree(int rootValue) {
        root = new NodeElement(rootValue);
    }

    @Override
    public void addValue(int newValue) {
        addValue(root, newValue);
    }

    private void addValue(NodeElement node, int newValue) {
        if (newValue < node.value) {
            node.left = addTo(node.left, newValue);
        } else if (node.value < newValue) {
            node.right = addTo(node.right, newValue);
        }
    }

    private NodeElement addTo(NodeElement node, int newValue) {
        if (node != null) {
            addValue(node, newValue);
            return node;
        } else {
            return new NodeElement(newValue);
        }
    }

    @Override
    public int getMaxLeafDepth() {
        return getMaxLeafDepthFrom(0, root);
    }

    private int getMaxLeafDepthFrom(int depth, NodeElement node) {
        if (node == null) {
            return depth;
        }

        return 1 + Math.max(getMaxLeafDepthFrom(depth, node.left),
                getMaxLeafDepthFrom(depth, node.right));
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toStringSubnode(NodeElement node) {
        if (node != null) {
            return toString(node);
        }
        return null;
    }

    private String toString(NodeElement node) {
        return String.format("(%s, %s, %s)",
                node.value,
                toStringSubnode(node.left),
                toStringSubnode(node.right));
    }

}

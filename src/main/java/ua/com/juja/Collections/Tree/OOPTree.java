package ua.com.juja.Collections.Tree;

/**
 * Created by serzh on 2/15/16.
 */
public class OOPTree implements Node {

    private int value;
    private Node left;
    private Node right;

    public OOPTree(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    @Override
    public int getMaxLeafDepth() {
        int depth = 0;

        if (left != null) {
            depth = left.getMaxLeafDepth();
        }

        if (right != null) {
            depth = Math.max(depth, right.getMaxLeafDepth());
        }

        return 1 + depth;
    }

    @Override
    public void addValue(int newValue) {
        if (newValue < value) {
            if (left == null) {
                left = new OOPTree(newValue);
            } else {
                left.addValue(newValue);
            }
        } else if (newValue > value) {
            if (right == null) {
                right = new OOPTree(newValue);
            } else {
                right.addValue(newValue);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("(%s, %s, %s)", value, left, right);
    }
}

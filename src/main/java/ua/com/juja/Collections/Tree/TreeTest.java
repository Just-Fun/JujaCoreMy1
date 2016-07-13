package ua.com.juja.Collections.Tree;

/**
 * Created by serzh on 2/15/16.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public  class TreeTest {

    Node createNode(int rootValue) {
        return new ProcedureRecursionTree(rootValue);
    }

    @Test
    public void testAddLeftToRoot() {
        Node node = createNode(5);
        node.addValue(4);

        assertEquals("(5, (4, null, null), null)", node.toString());
    }

    @Test
    public void testAddRightToRoot() {
        Node node = createNode(5);
        node.addValue(6);
        node.addValue(4);

        assertEquals("(5, (4, null, null), (6, null, null))", node.toString());
    }

    @Test
    public void testStartSecondLevel() {
        Node node = createNode(5);
        node.addValue(6);
        node.addValue(12);
        node.addValue(3);

        assertEquals("(5, (3, null, null), (6, null, (12, null, null)))", node.toString());
    }

    @Test
    public void testGetDepthFrom3LevelOnlyRightTree() {
        Node node = createNode(5);
        node.addValue(6);
        node.addValue(12);

        assertEquals(3, node.getMaxLeafDepth());
        assertEquals("(5, null, (6, null, (12, null, null)))",
                node.toString());
    }

    @Test
    public void testGetDepthFrom3LevelLeftRightTree() {
        Node node = createNode(5);
        node.addValue(1);
        node.addValue(2);

        assertEquals(3, node.getMaxLeafDepth());
        assertEquals("(5, (1, null, (2, null, null)), null)",
                node.toString());
    }

    @Test
    public void testGetDepthFrom4LevelleftRightTree() {
        Node node = createNode(5);
        node.addValue(6);
        node.addValue(12);
        node.addValue(16);
        node.addValue(3);
        node.addValue(1);
        node.addValue(0);

        assertEquals(4, node.getMaxLeafDepth());
        assertEquals("(5, (3, (1, (0, null, null), null), null), " +
                        "(6, null, (12, null, (16, null, null))))",
                node.toString());
    }

    @Test
    public void testGetDepthFrom5LevelTree() {
        Node node = createNode(5);
        node.addValue(4);
        node.addValue(6);
        node.addValue(3);
        node.addValue(7);
        node.addValue(2);
        node.addValue(8);
        node.addValue(1);
        node.addValue(9);

        assertEquals(5, node.getMaxLeafDepth());
        assertEquals("(5, (4, (3, (2, (1, null, null), null), null), null), " +
                        "(6, null, (7, null, (8, null, (9, null, null)))))",
                node.toString());
    }

}

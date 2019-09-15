package com.simitchiyski.interviewprep.interviewPreparationKit.trees;

import org.junit.Before;
import org.junit.Test;

import static com.simitchiyski.interviewprep.interviewPreparationKit.trees.BinarySearchTree.TraverseType.*;
import static org.junit.Assert.*;

public class BinarySearchTreeTests {
    private BinarySearchTree bst;

    @Before
    public void before() {
        this.bst = generateBT();
    }

    @Test
    public void testBinaryTreeInit() {
        assertNotNull(this.bst);
    }

    @Test
    public void testBinaryTreeContains() {
        assertTrue(this.bst.contains(6));
        assertTrue(this.bst.contains(5));
        assertFalse(this.bst.contains(99));
    }

    @Test
    public void testBinaryTreeRemove() {
        this.bst.remove(5);
        assertFalse(this.bst.contains(5));
    }

    @Test
    public void testBinaryTreeSize() {
        assertEquals(Integer.valueOf(7), Integer.valueOf(this.bst.size()));
        this.bst.remove(5);
        assertEquals(Integer.valueOf(6), Integer.valueOf(this.bst.size()));
    }

    @Test
    public void testBinaryTreeDFS() {
        assertEquals("3 4 5 6 7 8 9", this.bst.toString(DEPTH_FIRST_SEARCH_IN_ORDER));
        assertEquals("6 4 3 5 8 7 9", this.bst.toString(DEPTH_FIRST_SEARCH_PRE_ORDER));
        assertEquals("3 5 4 7 9 8 6", this.bst.toString(DEPTH_FIRST_SEARCH_POST_ORDER));
        assertEquals("3 4 5 6 7 8 9", this.bst.toString());
    }

    @Test
    public void testBinaryTreeBFS() {
        assertEquals("6 4 8 3 5 7 9", this.bst.toString(BREADTH_FIRST_SEARCH));
    }

    private BinarySearchTree generateBT() {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add(6);
        bst.add(4);
        bst.add(8);
        bst.add(3);
        bst.add(5);
        bst.add(7);
        bst.add(9);

        return bst;
    }
}

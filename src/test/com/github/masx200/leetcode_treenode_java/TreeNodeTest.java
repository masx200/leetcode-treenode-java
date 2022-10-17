package com.github.masx200.leetcode_treenode_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TreeNodeTest {


    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("[0,1,2]", new TreeNode(0, new TreeNode(1), new TreeNode(2)).toString());

        assertEquals("[0]", new TreeNode().toString());
        final TreeNode X = TreeNode.constructTree(new Integer[]{4, 1, 3, 9, null, null, 2});
        assertEquals("[4,1,3,9,null,null,2]", X.toString());
        assertEquals(X.val, 4);
        assertEquals(X.left.val, 1);
        assertEquals(X.right.val, 3);
        assertEquals(X.left.left.val, 9);
        assertEquals(X.right.right.val, 2);
//        System.out.println(X);
    }

    @Test
    void constructTree() {
        assertEquals("[1,2,3,4,5,6]", TreeNode.constructTree((new Integer[]{1, 2, 3, 4, 5, 6})).toString());
        assertNull(TreeNode.constructTree((new Integer[]{})));
        assertEquals("[1,2,3,4]", TreeNode.constructTree((new Integer[]{1, 2, 3, 4})).toString());
        assertEquals("[1,2,3,4,5]", TreeNode.constructTree((new Integer[]{1, 2, 3, 4, 5})).toString());
    }
}
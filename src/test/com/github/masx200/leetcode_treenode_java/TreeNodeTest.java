package com.github.masx200.leetcode_treenode_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeNodeTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals("[0,1,2]", new TreeNode(0, new TreeNode(1), new TreeNode(2)).toString());

        assertEquals("[0]", new TreeNode().toString());
    }

    @Test
    void constructTree() {
        assertEquals("[1,2,3,4,5,6]", TreeNode.constructTree((new Integer[]{1, 2, 3, 4, 5, 6})).toString());
        assertEquals(null, TreeNode.constructTree((new Integer[]{})));
        assertEquals("[1,2,3,4]", TreeNode.constructTree((new Integer[]{1, 2, 3, 4})).toString());
        assertEquals("[1,2,3,4,5]", TreeNode.constructTree((new Integer[]{1, 2, 3, 4, 5})).toString());
    }
}
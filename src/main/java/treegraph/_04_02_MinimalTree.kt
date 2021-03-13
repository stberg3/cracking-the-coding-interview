package treegraph;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a sorted (increasing order) array with unique integer elements, write
 * an algorithm to create a binary search tree with minimal height.
 */
    
internal class _04_02_MinimalTree {
    public fun buildMinimalTree(vals: IntArray): BinaryTreeNode {
        for(v in vals) {
            println(v)
        }

        return BinaryTreeNode(-1)
    }

}

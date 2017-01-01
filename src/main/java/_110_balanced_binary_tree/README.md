# Problem

Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

# Analysis

这题可以想象成后序遍历，遍历到每个节点时，记下其深度。

对于left或right为null，其相应left或right子数深度为0，那么该节点的深度为:

Max(D<sub>l</sub>, D<sub>r</sub>)
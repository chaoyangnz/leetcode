# Problem

A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.

Return a deep copy of the list.

# Analysis

分两遍拷贝，第一遍忽略随机指针。但在这遍中，维护新老节点的映射，以便第二遍时回查。

第二遍遍历新链表，补全随机指针。
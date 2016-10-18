# Problem

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.

# Analysis

注意，这里没有给出链表的head节点，只给出需要删除的节点，也就是说这个节点一定是链表中。

而且没要求是节点地址不变。

所以我们可以从此节点出发，依次用后面节点的值覆盖掉当前节点的值，倒数第二个节点的指针为null。

1 -> 2 -> 3 -> 4 -> 5 

1 -> 2 -> **4** -> 4 -> 5 （当前3，改为next的值4）
      
1 -> 2 -> 4 -> **5**
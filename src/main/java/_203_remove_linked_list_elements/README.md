# Problem

Remove all elements from a linked list of integers that have value val.

Example
Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
Return: 1 --> 2 --> 3 --> 4 --> 5

# Analysis

注意，当前节点为head的情况。当删除节点时，prev节点不变；否则，prev变成当前节点。
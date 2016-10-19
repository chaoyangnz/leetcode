# Problem

Implement the following operations of a stack using queues.

- push(x) -- Push element x onto stack.
- pop() -- Removes the element on top of the stack.
- top() -- Get the top element.
- empty() -- Return whether the stack is empty.

Notes:
- You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
- Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
- You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

# Analysis

我们只需要记录下top指向的元素。

- 当push时，直接offer到queue后面，更新top为新加的元素
- 当pop时，连续出队列，不为top时再次入队列，直到为top指向的元素，更新新的top位置。在上述迭代过程中，需要维护下一个候选的top位置

使用栈实现队列，请参见#232
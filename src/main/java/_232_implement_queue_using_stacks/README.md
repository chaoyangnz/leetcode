# Problem

Implement the following operations of a queue using stacks.
```
push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
```
Notes:
- You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
- Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
- You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

# Analysis

用stack实现queue。因为stack只允许单端操作，为了我们方便挪移数据，我们可以用两个stack互相腾挪。始终存在一个stack为空
- 第一个stack的top总是queue的最后
- 第二个stack的top总是queue的最前

于是，
- 当push一个数到queue时，我们push到第一个stack，因为此时第二个stack可能有数，我们需要先把第二个stack的数全部移到第一个stack
- 当pop或peek一个数时，我们从第二个stackpop，因此此时第一个stack可能有数，我们需要先把第一个stack的数全部移到第二个stack

用queue实现stack。因为queue可以两端操作，因此我们只需要一个queue就可以实现stack。
参考：http://richyang.me/2016/01/18/implement-stack-with-queue
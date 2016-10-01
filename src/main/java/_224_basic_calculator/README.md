# Problem

Implement a basic calculator to evaluate a simple expression string.

The expression string may contain open ( and closing parentheses ), the plus + or minus sign -, non-negative integers and empty spaces .

You may assume that the given expression is always valid.

Some examples:
"1 + 1" = 2
" 2-1 + 2 " = 3
"(1+(4+5+2)-3)+(6+8)" = 23
Note: Do not use the eval built-in library function.

# Analysis

- 对于数字的解析，需要延后到遇到运算符或括号
- 遇到运算符，需要把前面更高或相同优先级的操作符都计算掉，直到遇到(或栈空
- 遇到), 需要把前面的操作符都计算掉，直到遇到(
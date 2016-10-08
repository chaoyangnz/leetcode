# Problem

Given a string containing only digits, restore it by returning all possible valid IP address combinations.

For example:
Given "25525511135",

return ["255.255.11.135", "255.255.111.35"]. (Order does not matter)

# Analysis

我的思路是枚举所有组合，按每节的长度，3-3-2-3, 3-3-3-2... 按这样，换成整数就是1111 ~ 3333, 看符合不符合分段限制。
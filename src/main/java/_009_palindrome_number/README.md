# Problem

Determine whether an integer is a palindrome. Do this without extra space.

# Solution

例如：1908091, 利用逐步求反转

x -> 1908091  r -> 0
x -> 190809   r -> 0x10 + 1=1
x -> 19080    r -> 1x10 + 9=19
x -> 1908     r -> 19x10 + 0=190
x -> 190      r -> 190x10 + 8 = 1908   <====


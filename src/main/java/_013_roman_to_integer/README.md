# Problem

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

# Solution

这题必须了解罗马数字的规则，具体规则可以参考wikipedia
Symbol	I	V	X	L	C	D	M
Value	1	5	10	50	100	500	1,000

在构成数时，按理说前面的数字单位应该比后面大，这样只简单相加就好了。但罗马数字如果前面数字比后面数字单位小，则要减去，典型的如IV, IIX

MMXIV = 2014

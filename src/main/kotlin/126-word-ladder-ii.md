
# Problem

Given two words (_beginWord_ and _endWord_), and a dictionary's word list,
find all shortest transformation sequence(s) from _beginWord_ to _endWord_,
such that:

  1. Only one letter can be changed at a time
  2. Each transformed word must exist in the word list. Note that _beginWord_ is _not_ a transformed word.

For example,

Given:

_beginWord_ = `"hit"`

_endWord_ = `"cog"`

_wordList_ = `["hot","dot","dog","lot","log","cog"]`

Return

    ```
      [
        ["hit","hot","dot","dog","cog"],
        ["hit","hot","lot","log","cog"]
      ]
    ```

**Note:**  

  * Return an empty list if there is no such transformation sequence.
  * All words have the same length.
  * All words contain only lowercase alphabetic characters.
  * You may assume no duplicates in the word list.
  * You may assume _beginWord_ and _endWord_ are non-empty and are not the same.

**UPDATE (2017/1/20):**  
The _wordList_ parameter had been changed to a list of strings (instead of a
set of strings). Please reload the code definition to get the latest changes.



[Word Ladder II](https://leetcode.com/problems/word-ladder-ii)

# Solution




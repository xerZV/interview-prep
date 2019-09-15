**Hash Tables: Ransom Note**

Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print `Yes` if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print `No`.
For example, the note is "Attack at dawn". The magazine contains only "attack at dawn". The magazine has all the right words, but there's a case mismatch. The answer is `No`.

**Function Description**

Complete the checkMagazine function in the editor below. 
It must print `Yes` if the note can be formed using the magazine, or `No`.

checkMagazine has the following parameters:

 - magazine: an array of strings, each a word in the magazine
 - note: an array of strings, each a word in the ransom note
 
**Input Format**

The first line contains two space-separated integers, `m` and `n`, the numbers of words in the `magazine` and the `note`.
The second line contains `m` space-separated strings, each `magazine[i]`.
The third line contains `n` space-separated strings, each `note[i]`.

**Output Format**

Print `Yes` if he can use the magazine to create an untraceable replica of his ransom note. Otherwise, print `No`.

**Sample Input 0**
<pre>
6 4
give me one grand today night
give one grand today
</pre>
**Sample Output 0**
<pre>
Yes
</pre>

**Sample Input 1**
<pre>
6 5
two times three is not four
two times two is four
</pre>

**Sample Output 1**
<pre>
No
</pre>


**Explanation 1**

'two' only occurs once in the magazine.

**Sample Input 2**
<pre>
7 4
ive got a lovely bunch of coconuts
ive got some coconuts
</pre>

**Sample Output 2**
<pre>No</pre>

**Explanation 2**

Harold's magazine is missing the word `some`.
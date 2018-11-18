# Z字形变换

### 思路
以s = "0123456789ABCD", numRows = 4 为例
| |I|II|III|IV|V|VI|VII|
|-----|-|-|-|-|-|-|-|
|Row 0|0| | |6| | |C|
|Row 1|1| |5|7| |B|D|
|Row 2|2|4| |8|A| | |
|Row 3|3| | |9| | | |
行号从 0 开始，观察表格可知：
 * 首行Row 0 行和尾行 Row (numRows - 1) 行，相临字符的位置差是 (numRows * 2 - 2)
 * 中间行，对第 i 行两两划分，即在首次垂直向下开始到再一次垂直向下排列前，两个数的位置差是 (numsRows * 2 - 2) - i
 * 中间行，两次垂直向下排列的数位置差也为 (numsRows * 2 - 2)

### 算法描述
 1. 如果输入为 "" 或 numRows = 1，原样输出
 2. 一般情况
    1. 如果 row = 0 或 row = numsRows - 1，依次输出 s.charAt(row + (numRows * 2 - 2) * n), n = 0, 1, 2... 直到越界
    2. 中间行，依次输出 s.charAt(row + (numRows * 2 - 2) * n) 和 s.charAt(row + (numsRows * 2 - 2) * n + (numRows * 2 - 2) - row), n = 0, 1, 2... 直到越界

### 注意
 1. 下标可能越界，如表格中第 Row 2 行第 VII 列
 2. 空串和只按一行Z字变形的情况

 code-a-thon-fall-2018


The Society for Traditional Family Values is holding a fundraiser. Attendees of various ages are arriving at the fundraiser one at a time. Naturally, all attendees are very respectful of their elders, so whenever a new guest arrives, everyone already present who is younger than them or the same age will come to greet them. Assuming the fundraiser starts with no people, determine how many people will greet each newcomer.

Input Format

The first line contains , the total number of people who will arrive at the party. The next  lines contain the ages of the attendees in the order they arrive, one attendee per line.

Constraints
1 <= n <= 2^15.
.

For each attendee, age is between 1 and 2^20.
Output Format

n lines. The ith line contains the number of people who will greet the th attendee.

Sample Input 0

11
3
1
4
1
5
9
2
6
5
3
5
Sample Output 0

0
0
2
1
4
5
2
6
6
4
8
Sample Input 1

20
3
6
6
13
14
4
10
9
7
4
6
4
15
1
2
11
8
15
11
6
Sample Output 1

0
1
2
3
4
1
4
4
4
2
5
3
12
0
1
12
10
17
14
9

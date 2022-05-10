# Final-Score-Calculation-Program-(Java)
This program calculates the mean / final score, median and calculates predicted scores of assessments. The program is written using Java.


The inputs and outputs for each problem is as follows:

--Problem 1-- 

Input
• Student name (String)
• Banner number (String)
• Marks on each assessment (int) in order of Tests, PoD, Assignments, Practicum, Labs

Output
• Pretty printed report as exemplified below
• The final score should be printed with two decimals points (double)


Example:

Input:
Anon Ymous
B00900900
80
90
70
40
50

Output: Hi Anon Ymous (B00900900), based on the input given: Tests= 80% PoDs= 90%, Assignments= 70%, Practicums=40%, Labs=50%, your final score is 65.85%.
_______________________________________________________________________________________________________________________________________________________________________

--Problem 2--

Input
• Student name (String)
• Banner number (String)
• Marks on each assignment (int) in order of Tests, PoD, Assignments, Practicum, Labs

Output
• Pretty printed report as exemplified below
• The final score should be printed with two decimals points (double)
• Median (int)


Example:

Input:
Anon Ymous
B00900900
80
90
70
40
50

Output: Hi Anon Ymous (B00900900), based on the input given: Tests= 80% PoDs= 90%, Assignments= 70%, Practicums=40%, Labs=50%, your final score is 65.85% with a median of 70%.
_______________________________________________________________________________________________________________________________________________________________________

--Problem 3--

Input
• Student name (String)
• Banner number (String)
• Number of learning objectives completed (int)
• Marks on each assessment (int) in order of Tests, PoD, Assignments, Practicum, Labs

Output
• Pretty printed report as exemplified below
• The final score should be printed with two decimals points (double)
• Median (int)


Example:

Input:
Anon Ymous
B00900900
5
80
90
70
40
50

Output: Hi Anon Ymous (B00900900), based on the input given for 5/5 scores: Tests= 80% PoDs= 90%, Assignments= 70%, Practicums=40%, Labs=50%, your final score is 65.85% with a median of 70%.

Input:
Anon Ymous
00900900
1
80

Output: Hi Anon Ymous (00900900), based on the input given for 1/5 scores: Tests= 80% PoDs= 100%, Assignments= 100%, Practicums=100%, Labs=100%, your final score is 94.90% with a median of 100%.

Input:
Anon Ymous
00900900
2
80
90

Output: Hi Anon Ymous (00900900), based on the input given for 2/5 scores: Tests= 80% PoDs= 90%, Assignments= 100%, Practicums=100%, Labs=100%, your final score is 93.90% with a median of 100%.


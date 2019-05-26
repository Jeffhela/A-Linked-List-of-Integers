Part 1
# A-Linked-List-of-Integers
Java

File IntList.java contains definitions for a linked list of integers. The class contains an inner class IntNode that holds information for a single node in the list (a node has a value and a reference to the next node) and the following IntList methods:

    public IntList()—constructor; creates an empty list of integers
    public void addToFront(int val)—takes an integer and puts it on the front of the list
    public void addToEnd(int val)—takes an integer and puts it on the end of the list
    public void removeFirst()—removes the first value from the list
    public void print()—prints the elements in the list from first to last

File IntListTest.java contains a driver that allows you to experiment with these methods. Save both of these files to your directory, compile and run IntListTest, and play around with it to see how it works. Then add the following methods to the IntList class. For each, add an option to the driver to test it.

    public int length()—returns the number of elements in the list
    public String toString()—returns a String containing the print value of the list.
    public void removeLast()—removes the last element of the list. If the list is empty, does nothing.
    public void replace(int oldVal, int newVal)—replaces all occurrences of oldVal in the list with newVal.

Part 2 Matching Parentheses
Note that you can still use the old nodes; just replace the values stored in those nodes.

One application of stacks is to keep track of things that must match up such as parentheses in an expression or braces in a program. In the case of parentheses when a left parenthesis is encountered it is pushed on the stack and when a right parenthesis is encountered its matching left parenthesis is popped from the stack. If the stack has no left parenthesis, that means the parentheses don’t match—there is an extra right parenthesis. If the expression ends with at least one left parenthesis still on the stack then again the parentheses don’t match—there is an extra left parenthesis.

File ParenMatch.java contains the skeleton of a program to match parentheses in an expression. It uses the Stack class provided by Java (in java.util). Complete the program by adding a loop to process the line entered to see if it contains matching parentheses. Just ignore characters that are neither left nor right parentheses. Your loop should stop as soon as it detects an error. After the loop print a message indicating what happened — the parentheses match, there are too many left parentheses, or there are too many right parentheses. Also print the part of the string up to where the error was detected.


# TwoSum
Xizhe Sun


1.Given a UNSORTED array of integers, return the indices of the two
numbers whose sum is equal to a given target. Return -1 if nothing a
solution cannot be found or if the same element is used twice.

2.First create a private static method getTwoSum which takes two parameters( numbers array of type integer and the target of type integer)

3.The getTwoSum() method will return the array of indices that will sum
up to the target or an empty array if a solution cannot be found or if the
same element is used twice (in this case -1).

4.To start, first loop the first number (for loop is used).

5.And then loop the second number (for loop is used).
Check if the sum of the two numbers is equal to the target then return the
array of indices(if statement is used to accomplish this).

6.The main method invokes the getTwoSum() method
• First the integer array of numbers is declared and initialized
• Then the target is also declared and initialized.
• A for loop is used to loop through all the elements of the array and print
them out in the console.

7.The getTwoSum() method is invoked and the integer array of numbers and the
target are passed as parameters.

*If. . . else statement is used to determine which elements sum up to the target or
if there is no solution or if the same element is used twice in which case -1 will
be returned to the console.

8.The two indices that sum up to the target are then printed out to the
console.

# An exercise based on chapter 1, _Cracking the Oyster_, of _Programming Pearls_ by Jon Bentley

## A system used for political redistricting reads in files that correspond to political districts. The contents of the files are integers representing precincts. The range of precinct numbers if from 1 to 27000. No precinct number can appear twice in the same district.

## The program reads in the numbers, sorts them, and then prints them out in numeric order.

## However, due to memory constraints, only 1000 integers can be read in from the file at a time.

## Precise problem statement:

### Input: A file containing at most 27000 integers in the range 1..27000. It is a fatal error condition if any integer appears twice in the input. No other data is associated with the integer.

### Output: A sorted list in increasing order of the input integers.

### Constraints: Internal storage is available for at most 1000 integers. Ample disk storage is available.

#### Note: The original article from the August 1986 edition of the Communications of the ACM is included in the repo as a pdf.

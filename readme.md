
week 1 --> session 1

1)Why algorithms used before Computers
-->to get work done fast and efficient
-->to solve frquently occuring math problems  

2)Difference btwn a real life vs computer ALGORITHM
-->scale
-->Efficiency
-->precision

3)What is Alogrithm
-->step-by-step well defined procedure to solve computational problems to transform given input to desired output

		  transform	
--> input ----------> output
		  algorithm	
	
	a)what are relevant deatils of problem
	-->Constraint
	-->Data types
	-->time and space

4)What is good Alogrithm
-->Efficiency=> time and memory
-->easy to understand and modifiy(simple)
-->correctness

5)Magic Square
6)Count All possible path

	=>9c5 = 9c4
	
	idea of combinatory (to be discussed while discussing bactraking or DP)
	 
	 m+ncn = n+ncm;
	
	C(n, r) = n!/r!(n–r)!

week 1 --> session 2

1)Monty Hall problem
	conditional probablity
	
2)Bridge Crossing

3)7 unit Gold Bar 	
	->binary represntaion of  number
	->1,2,4 for 7
	->1,2,4,8 for 15
	
[Math concepts to learn]	
==>Summation and series
==>logarithm and exponential
==>permuatation and combination (Combinatorics)
==>Basic probablity
==>Bit Manipulation
==>Numbers Theory
==>Functions(Recurrence RElation)
==>Indution
==>basic graph and tree
 ==>Basic Coordinates , DIstance formula


[Programming]
	if else
	Functions
	loops
	Memory and allocation
		Heap 
			dynamic
		Stack
			function call
			local variables
			order
		Program Instructions
		
[Courses]
->courses by stanford
	==>Programming abstraction
	==>Programming methodolgy
	==>Programming paradigm

[Problems]
==>Brain Teaser(Monty Hall,rectangle cake,)
==>Algorithm puzzle

-->Strict binary tree has two child or no child
	InternalNode =  LeafNode-1;
	LeafNode = InternalNode+1;
	
	
	
	
18-10-2023 Notes:

quick sort -> partition --> pivot


left less than pivot || pivot || greater than pivot

	base case

	pivot element
	
	time complexity
	
unbalanced partition

balanced partiton

	
pivot starategy

sapce complexity of quick sort : 

time complexity : O(n logn)

sterling formula 

recurrence realtions



Tasks
Quick sort
binary search (iterative)
merge sort (Iterative)




week 4 --> session 2

subset Array
Intersection Array

solve 0,1,2 and 0,1
element repeated n times in 2n size array find the element 
spiral matrix (iteratively , recursion)



week 5 --> session 1
algorithms to live (book)

1)wave form array
2)find majority element (similar to 2n repated element);
==>VOTING ALGORITHM
-> try solve it using bit wise operations
-> try problem where majority element does not exist

3)Tower of Hanoi
	-->recursion
	-->substitution
	


//2 power 0 formula	
==>exponential summation formula 
2+4+8+32 = 2(n-1)-1;


hashing

data structure operations
insert
delete
search
sort
merge
traverse


Linear Data Structure
Array
LinkedList
Stack (FIFO)
Queue(LIFO)



OS main feature
deadlock
process management
process synchronization
memory mangement


==>Round Robin ALGORITHM
	->circular list


Explored Queue and Stack DS

Go through enjoy algorithms blogs of data structures and algorithms



week 5 --> session 2

1)Equilibrium index
	prefix array
		->any range sum quries can be solved using prefix array
  a)Many equilibrium indexes
  
  
Note: output array is not considerd as space complexity as it is part of the problem

-->solve all prefix and suffix array pattern problems

==>segment tree
	yet to be discussed

==>Hashing
	Keys are always integer internally even if it is string externally
	
==>String Folding	

->Two types of DS
  Primitive and non primitive DS

--> check which sorting algo is  stable?
-->	if it is not stable how to make them stable?

=>books to read
	alogrithms by robert sedvick(java)
	Alogrithm design manual	(steven skiena)
	ALGORITHM by CLRS
	
 -->problem of birthday , problem of dice
 
 
 
week 6 --> session 1

=>books to read
	1)CLRS -> algorithms unlocked
	2)alogrithms by robert sedvick(java)
	3)Alogrithm design manual	(steven skiena)
	4)ALGORITHM puzzlers
	
==>Hash Table
	direct addresss table I.D.S
	
1)Sorting a string 
	frequency of charecters
	fixed array of ascii chars and increase count then sort
2)string is a anagram	or not
	using fixed ascii array
task :try to solve it  single loop

3)Counting Sort

4)stable counting sort

==>Hash Function
	Hash -->(how to chooose hash function)
	collison
	how we will handle collison
	
	-->Modular hashing
		randomise hash function to minimise collision
		
	
5)how to check given num is a prime , how to find all prime num in range		
         
 
==> encoding - decoding (will be discussed later)
	
-->Computer scientists
	Donald knuth
	claude shannon

==>design hash table
		  chaining
	      		

week 6 --> session 2


1)Design Hash Table
		
	Resolve collision
		By chaining
			Linked list or balanced bst
			load factor
		By Open addressing
			key value stored in same slot
			linear probing
				reahashing using Linear probing			
				primary clustering --> performance degrades
				mod - circular 
			Quadratic probing
				secondary clustering problem
				double hasing can be used to resolve secondary clustering
			
			
FOCUS AND COLLABORATION

	
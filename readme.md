
week 1 --> session 1 --> (27-Sep-2023)

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

week 1 --> session 2 --> (29-Sep-2023)

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

-----------------------------------------------------------------------------------------------------	

week 2 --> session 1 --> (04-Oct-2023)
==> complexity Analysis
		HOW , WHERE , WHY 
		 
		To understand behaviour of algo for diff input sizes
		Code optimization
		
		-->how to calculate running time of ALGORITHM
				every Programming operation will take constant time
				Large scale of input (exception => low scale)
				Independent of machine related (In terms of input size)
					hardware can be scaled  only by constant (there is saturation limit)
				Choice of programming language(compiler)
				==> All the above are mostly are constant time operations
				
				Input size
				==>varies lot
				we always analyse running time of  alogrithms wrt input size
				
		-->Running time
				total time taken by algo for particular input size
				anpow2+an+a
		-->Time complexity
				abstract(npow2) 
				
		-->Input size
		
1)Linear search
	==>Distribution of Input	
		Best , Avg, Worst
					sum of time taken by all input possibilites
		Avg =	-------------------------------------------
					total no of possibiltes
2)Find Max Element in Array		  
	O(n) time 
	need to come up with observations based on the input
	
[books to read]
-->Algorithm design manual (steven skiena)


-->we should be idea hunters
	Every human has equal opprtunity to find insights
		time
		mind
	
		FOCUS AND CONSISTENCY
		
		  
-->Pick three subjects 
	DSA - major
	System design
	OOPS design
		

best = sigma
Average = theta
worst = Big O

BIG O ==> O(npow2); (to be discussed) 	


-->wherever  randomise factor is involved in algo we perform average case to understand it better

-->when best and worst has some gap then average needs to be calculated

-->Rate of growth of curve give is clear picture time complexity
   put higher oderd term in big O ie time complexity 

-->an + b = O(npow2)  , mathametically this equation is correct for upperbound,
	but for programming this doest help in comparing algo
	an + b = O(logn) is wrong X , this cannpt be possible
	
==>what are the assumptions in algorithms
	input Distribution
	
==>when we use best , avg , worst case
	if best and worst is O(n) then avg also will be the same
	
	for small input size lower order term and coefficeints cant be ignored
		
	
------------------------------------------------------------------------------------------------------	
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

---------------------------------------------------------------------------------------

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
 
------------------------------------------------------------------------------------------ 
 
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
-----------------------------------------------------------------------------------------------------------
week 7 --> session 1 --> (08-Nov-2023)

1)Search element in a matrix in row wise sorted
	search rows and element using binary search 
	o(logm+logn)
	
2)Search element in a matrix column wise sorted
	column wise sorted Array
	two pointers 
	
3)max consecutive ones in the binary sorted matrix Array
	 O(mlogn)
	 O(m+n) two pointers

4)first and last occurence of key in array with repeating elements 	 (task)
	code the problem

5)sorted and  rotated array
	search minimum element using binary search


6)how to rotate an array by k	(HW)

7)find fake coin among 8 coins

8)find fake coin among 12 coins 

******************************************************

week 7 --> session 2 --> (10-Nov-2023)


1)Exponential search

2)first occurence of positive 	

3)arrays are equal or not

4)largest consecutive sequence

5)	


-------------------------------------------------------------------------------------

week 8 --> session 1 --> (15-Nov-2023)


1)Largest subarray with 0 sum
	efficient solution using hashTable
	https://practice.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1Free
		
2)Max subarray which has equal 0 and 1 (HW)
	efficient solution using 0 as -1 and then sum the subarrays
	https://leetcode.com/problems/contiguous-array/
	
3)Largest increasing subarray length
	https://leetcode.com/problems/longest-increasing-subsequence/
	https://leetcode.com/problems/longest-continuous-increasing-subsequence/

4)Flip 0 in windows and find largest consecutive ones
	https://leetcode.com/problems/max-consecutive-ones-iii/

	
5)


6)Largest subString with all uniqe chars
	https://leetcode.com/problems/longest-substring-without-repeating-characters/
	
7)Max subarray with all uniqe values
	https://practice.geeksforgeeks.org/problems/sum-of-length3345/1

8)distinct elements in every k window in Array
	https://leetcode.com/problems/subarrays-with-k-different-integers/
	https://practice.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1

9)MAX of k windows in Array
	use datastructure : DEQUEUE (to be discussed)
	https://leetcode.com/problems/sliding-window-maximum/
	
10)Trapping rain water
	using prefix and suffix max Array (try to solve with just prefix max)
	two pointer approach
	https://leetcode.com/problems/trapping-rain-water/	


*******************************************************************************

week 8 --> session 2 --> (17-Nov-2023)

==>Linear Data Structure
	Array
		Efficient
			continuos memory allocation
			swapping
			access by index
			locality
			
		Not efficient
			size (static allocation)
==>Linked list
	Advantages
		not fixed size 
		
	sorting of linked list (Merge sort is best)
	
	[problems to be solved]	
	sort linked list
	remove duplicated	

[explore]	
-->explore data structures on Array		

-->Numpy library
	parallel computing
	
==>Dynamic Array (List)
	n -> insertion
			O(n)
	avg 	O(1)
	
			k
	k -> ----------  Growth factor / Load Factor
			k-1
	
	Implementation of Dynamic Array
		constrcutor
		public methods
			get
			delete
			insert
		private methods
			resize
			shrink
			
		static
			growth factor
			current size
			threshold \ limit
			
==>Knowledge Graph
	how to keep things in memory for longer
	
1)Rotate Matrix by 90 degress
	
	n*n transpose can be done in place by swapping
	
	m*n transpose can only be done with extra space
	
	https://leetcode.com/problems/rotate-image
	

2)KaratSuba Integer Multiplication	(HW)
	
3)Calculate the xPowerN
	divide it into sub problems and add the sum 

[Math concepts to learn]
==>learn about numbers theroy
	binary
	decimal
	hexaDecimal
	base64
----------------------------------------------------------------------------------------------------

week 9 --> session 1 --> (22-Nov-2023)


==>Fear of failure
	make coding as hobby
	
	
1)max consecutive ones with k filps of 0
	sliding window
	
	
==>Linked list
	singly , doubly , circualrlist
	
	doubly Linked list applications
		forward and backward (music player queue)
		
	
	
1)design browser history
	Stack
	doubly Linked list

2)design LRU %% LFU cache (to be discusses)
		doubly Linked list + hash Table
	
	
3)round Robin
		is a scheduling strategy
		priority scheduling
	
	starvation problem in process scheduling
	
	
[blog to read]
-->process management in OS
-->load balancing
	
	circular array (to be discussed)

==>Load balancing
	round Robin
	weighted round robin (tbd)
	
==>linked list problem solving
	all linear traversal methods can be used
	
4)find middle node / delete middle node
	linear search
	length ==> n
	-->delete n/2 node 
	
	fast and slow pointer
	https://leetcode.com/problems/middle-of-the-linked-list/
	
5)reverse a linked list
	recursively
	https://leetcode.com/problems/reverse-linked-list

6)reverse the range in linked list m ,n 
https://leetcode.com/problems/reverse-linked-list-ii

7)reverse k group in linked list
https://leetcode.com/problems/reverse-nodes-in-k-group

8)reverse linked list in pair (pairwise swap)
https://leetcode.com/problems/swap-nodes-in-pairs/


9)N th node	from end
	two pointer approach using slow and fast pointer
	handle edge cases
	https://leetcode.com/problems/remove-nth-node-from-end-of-list/

10)bridge node
	https://leetcode.com/problems/intersection-of-two-linked-lists

11)loop in a linked List
	==>floyed ALGORITHM / tortoise and hare algorithm
	
	using hash table
	https://leetcode.com/problems/linked-list-cycle-ii/

[extra problems]
https://leetcode.com/problems/remove-linked-list-elements		
		


********************************************************************************************


week 9 --> session 2 --> (24-Nov-2023)


1)find and delete loop in linked list
	l>m 
		fast pointer and slow pointer will meet at some point
	
	l<m
		fast pointer loops more times
	https://leetcode.com/problems/linked-list-cycle
	https://leetcode.com/problems/linked-list-cycle-ii
	https://leetcode.com/problems/delete-node-in-a-linked-list
	
	https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list
	https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list
2)swap nodes in pair
	swap the Data
	==>data swapping
		O(mn)
		data will be swapped between the nodes
		it can be heavy
	==>pointer swapping
		itertive swapping
		recursive swapping
	https://leetcode.com/problems/swap-nodes-in-pairs/
	
==>Stack
	topological sorting -->-->dfs (tbd)
	
	dependency graph
	
	storing history of items
	
	==>Array Implementation
		stack operations
			push
				overflow
			pop
				underflow
			top
			resize
				increaes array size
		
	
	==>Linked list Implementation
		
		stackoverflow error
		
		stack underflow error
	https://leetcode.com/problems/design-a-stack-with-increment-operation	
	https://leetcode.com/problems/design-a-stack-with-increment-operation
==>Queue
	CIRCULAR ARRAY/list
	https://leetcode.com/problems/design-circular-queue
	

-------------------------------------------------------------------------------------------	

week 10 --> session 1 --> (29-Nov-2023)

1)reverse stack
	
	place all items in other stack
	https://practice.geeksforgeeks.org/problems/reverse-a-stack/1
	
2)reverse Queue
	
	https://practice.geeksforgeeks.org/problems/queue-reversal/1
	
==>think in terms of data structure operations

3)sort a stack using stack
	
	recursive solution
		o(npow2)	
	
	another stack is required
		4i+2
		npow2
	
		
==>Recurrence relations to remember
	
4)implement Queue using stack
	copy main stack to temp stack then pop elements
	then insert coming new elements into main stack
	
	https://leetcode.com/problems/implement-queue-using-stacks
	https://practice.geeksforgeeks.org/problems/queue-using-stack
	
5)implement stack using Queue
	
	[task]
	push->O(n)
	pop->O(1)
	https://leetcode.com/problems/implement-stack-using-queues
	
6)how to implement DEQUEUE using circular Queue

7)Design min Stack
	push
	pop
	top
	
	->get min operation
	
	store min elements into Stack
	
	
	store in pair
	linked list Implementation
	
	another implementation using stack can be found in  blog
	
[min-stack](https://leetcode.com/problems/min-stack/)
	
	

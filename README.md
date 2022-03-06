# NFA to DFA convertor

**NFA constructor** takes a string describing a NFA and constructs then returns a **DFA** that is equivilant.

# Usage 
> **Input format** :: "0,0;1,2;3,3#0,0;0,1;2,3;3,3#1,2#3"
Where the format is of the type Z#O#ε#A
Where **z** is the list of 0 transitions , **o** the list of 1 transitions , **ε** the list of epsilon transitions.
Lastly A is the list of Accept states.

The alphabet Σ is always the binary alphabet {0, 1}.


# NFA to DFA convertor

**NFA constructor** takes a string describing a NFA and constructs then returns a **DFA** that is equivilant.

# Usage 
> **Input format** :: "0,0;1,2;3,3#0,0;0,1;2,3;3,3#1,2#3"
Where the format is of the type Z#O#ε#A
Where **z** is the list of 0 transitions , **o** the list of 1 transitions , **ε** the list of epsilon transitions.
Lastly A is the list of Accept states.

The alphabet Σ is always the binary alphabet {0, 1}.

## How it was created 

States format => [ " State name " ] , [ 0 transitions ] and [ 1 transitions ! ]
4d array ? => index 0 ==> from there I access state , 0 transitions and 1 transitiosn.
How would that look like ??  
Lets say I wanna access state 1 I would access its index states[1]
	I then want to access its 0 transition then it would be states[1][1].
State name would lie in the states[1][0].

Hence its a 2D array !

Epsilon Closure !
=> Format ? [State] , [its new state:Epsilon States]

How would I access it ?
I want to access state 0 then I would say ==> State[0] This returns its epsilon states !
How would I construct it hence ? => a string array with a comma separating different states.

Where do I start ?
Capture the epsilon states first !

Input => has an epsilon part where each pair is separated by a ;
1@ Know the largest state to create an array of states !
NOTE :: We loop through the epsilonstates array as we add the epsilon transition as we do in real life !
NOTE :: Done , with format Array where only the elements with epsilon transitions have values and the rest have null << Should use this fact in the next phase >>
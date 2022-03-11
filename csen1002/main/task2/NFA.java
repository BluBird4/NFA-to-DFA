package csen1002.main.task2;

/**
 * Write your info here
 * 
 * @name Elhossin Rihan 
 * @id 46-8761
 * @labNumber 08
 */
public class NFA{
	/**
	 * NFA constructor
	 * 
	 * @param description is the string describing a NFA
	 */

	String[][] States;
	String[] description;
	String[] epsilonStates;
	String[] epsilonBuffer;
	int largest = -99999;

	public NFA(String description) {
		
		this.description = description.split("#");
		//Create the NFA transition table !
		
// => This section loops through to know the largest state

// ==> Loops through the 0 part
		for(int i = 0; i< (this.description[0].length());i++){
			if(this.description[0].charAt(i) != ',' || this.description[0].charAt(i) != ';'){
				if(Character.getNumericValue(this.description[0].charAt(i)) > this.largest){
					this.largest = Character.getNumericValue(this.description[0].charAt(i));
				}
			}
		}

// ==> Loops through the 1 part
		for(int i = 0; i< (this.description[1].length());i++){
			if(this.description[1].charAt(i) != ',' || this.description[1].charAt(i) != ';'){
				if(Character.getNumericValue(this.description[1].charAt(i)) > this.largest){
					this.largest = Character.getNumericValue(this.description[1].charAt(i));
				}
			}
		}

// ==> At this point we know what the largest state is
	this.epsilonStates = new String[largest]; this.epsilonBuffer = this.description[2].split(";");
//		==> From there Add the epsilon states !

	for(int i = 0; i <= this.epsilonBuffer.length ; i++){
//		this.epsilonStates[Character.getNumericValue(this.epsilonBuffer[i].charAt(0))] = ;
		if(this.epsilonStates[Character.getNumericValue(this.epsilonBuffer[i].charAt(0))] == null ){
			this.epsilonStates[Character.getNumericValue(this.epsilonBuffer[i].charAt(0))] = "" + this.epsilonBuffer[i].charAt(0);
			this.epsilonStates[Character.getNumericValue(this.epsilonBuffer[i].charAt(2))] = this.epsilonStates[Character.getNumericValue(this.epsilonBuffer[i].charAt(0))] + "," + this.epsilonBuffer[i].charAt(2);
		}  
	}

// ==> Supposedly I am done with creating the epsilon states table 

	}

	/**
	 * Returns true if the string is accepted by the NFA and false otherwise.
	 * 
	 * @param input is the string to check by the NFA.
	 * @return if the string is accepted or not.
	 */
	public boolean run(String input) {
		// TODO Write Your Code Here
		return false;
	}
}

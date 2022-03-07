//package csen1002.main.task2;

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

	public String[] arr;

	public NFA(String description) {

		//Divides the string into the following format Zerostates#Onestates#Epsilonstates#Acceptstates 
		this.arr = description.split("#");
		//For the next line here I make sure I dont run into the issue where there is no eplsion states
		if(this.arr.length != 4){
			//then we know it doesn't contain epsilon states
			
			//lets add the accept states !
			for(int i = 0; i<arr[2].length(); i++)
			{

			}
		}
		//else it does have eplsilon states
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

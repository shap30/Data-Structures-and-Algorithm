package Stack;

import java.util.Scanner;

public class INFIX_MIDTERM_EXAM {

	// STATIC VARIABLES
	
	static int topData = -1;
	static boolean ifSpace = false;
	static int numOfOperators = 0;
	
	public static void main(String[] args) throws InterruptedException {
	
		Scanner userInput = new Scanner(System.in);
	
		boolean exit = false;
		boolean enterInfix = true;
	
		int infixLen = 0;
		int userChoice = 0;
	
		String infix = "";
		char[] infixArray = null;
		numOfOperators = 0;
	

		while (enterInfix)
		{
			
	// VALIDATION BOOLEAN/INT 
			
		boolean numInput = false;
		boolean letterInput = false;
		boolean operator = false;
		boolean space = false;
		boolean validation = true;
		
		int closeParenthesis = 0;
		int i = 0;
		ifSpace = false;
			
	// INPUTING INFIX NOTATION:
		
	System.out.print("INPUT THE INFIX NOTATION: ");
	infix = userInput.nextLine();
	
	// LENGTH OF USER INPUT IN THE INFIX
	
	infixLen = infix.length();
	infixArray = new char[infixLen];
	for(int j = 0; j < infixArray.length; j++)
		
	{	
		//converts string infix to char infixArray
			
		infixArray[j] = infix.charAt(j);
		
		if (infixArray[j] == '/' || infixArray[j] == '+' || infixArray[j] ==
		'-' || infixArray[j] == '*' || infixArray[j] == '^')
			{
			++numOfOperators;
			}
			if (infixArray[j] == ' ')
			{
				ifSpace = true;
			}
		
			// COUNT AND CLOSE IN PARENTHESIS
			
			if(infixArray[j] == '(')
			{
				closeParenthesis++;
			}
			if (infixArray[j] == ')')
			{
			if (closeParenthesis == 0)
			{
				System.out.println("INPUT ERROR! INPUT AGAIN:\n");
				break;
			}
			}
		}
		
			if (ifSpace)
			{
				for (int j = 0; j < infixArray.length; j++)
				{
					if ((infixArray[j] >= 'a' && infixArray[j] <= 'z') ||
							(infixArray[j] >= 'A' && infixArray[j] <= 'Z'))
					{
						if (j < infixArray.length-1)
						{
							if (infixArray[j+1] != ' ' &&
									infixArray[j+1] != ')')
							{
								System.out.println("INVALID, NO SPACE!\n");
								validation = false;
								break;
							}
						}
					}
				}
			}
			
			
		// VALIDATION IF TRUE OR FALSE:
			
			if (validation)
			{
				for (i = 0; i < infixLen; i++)
				{
					// USER WHEN NUMBER IS INPUTING
					
					if (infixArray[i] >= '0' && infixArray[i] <= '9')
					{
						if (i < infixLen-1)
						{
							if (ifSpace)
							{
								if (i < infixLen-2)
								
								{
									
		// NOT OPERATORS AND AUTO-CLOSE PARENTHESIS
									
									if (infixArray[i+2]
											!= '/' && infixArray[i+2] != '+' && infixArray[i+2] != '-' && infixArray[i+2] != '*' && infixArray[i+2] != '^' &&
											infixArray[i+2] != ')' && infixArray[i+1] != ')' && infixArray[i+1] == ' ')
									{
										System.out.println("OPERATOR NOT DETECTED.\n");
										break;
									}
								}
							}
					
	// IF NOT OPERATORS AND START CLOSE PARENTHESIS AND NUMBERS:
							
						else if (infixArray[i+1] > '9' &&
								infixArray[i+1] != '/' && infixArray[i+1] != '+' && infixArray[i+1] != '-' && infixArray[i+1] != '*' && infixArray[i+1]
										!= '^' && infixArray[i+1] != ')')
						{
							System.out.println("OPERATOR NOT DETECTED.\n");
							break;
						}
					}
					numInput = true;
				}
				else
				{
					numInput = false;
				}
				
	// INPUT TO LETTER
					
				if ((infixArray[i] >= 'a' && infixArray[i] <= 'z') ||
						(infixArray[i] >= 'A' && infixArray[i] <= 'Z'))
				{
					if (i < infixLen-1)
					{
						if (ifSpace)
						{
							if (i < infixLen-2)
							{
								
	// IF NOT OPERATIONS AND START CLOSE PARENTHESIS
								
								if (infixArray[i+2]
										!= '/' && infixArray[i+2] != '+' && infixArray[i+2] != '-' && infixArray[i+2] != '*' && infixArray[i+2] != '^' &&
										infixArray[i+2] != ')' && infixArray[i+1] != ')' && infixArray[i+1] == ' ')
								{
									System.out.println("OPERATOR NOT DETECTED.\n");
									break;
								}
							}
						}
						
	// IF NOT AGAIN OPERATORS AND CLOSE PARENTHESIS AGAIN:
						
						else if (infixArray[i+1] != '/' &&
								infixArray[i+1] != '+' && infixArray[i+1] != '-' && infixArray[i+1] != '*' && infixArray[i+1] != '^' &&
								infixArray[i+1] != ')')
						{
							System.out.println("OPERATOR NOT DETECTED.\n");
							break;
						}
					}
					letterInput = true;
				}
				else
				{
					letterInput = false;
				}
				
	// OPERATOR DETECTED
				
				if(infixArray[i] == '/' || infixArray[i] == '+' ||
						infixArray[i] == '-' || infixArray[i] == '*' || infixArray[i] == '^')
				{
					if (ifSpace)
					{
						if (i < infixLen-2)
						{
							
	// INPUT OPERATOR AGAIN AFTER OPERATOR 
							
							if (infixArray[i+2] == '/' ||
									infixArray[i+2] == '+' || infixArray[i+2] == '-' || infixArray[i+2] == '*' || infixArray[i+2] == '^')
							{
								System.out.println("ERROR!\n");
								break;
							}
							
							// IF OPERATOR INPUT FIRST IN INSIDE OF PAREHTHESIS
							
							else if
							(closeParenthesis > 0 && infixArray[i-2] == '(')
							{
								System.out.println("ERROR!\n");
								break;
							}
							
	// IF OPERATOR INPUT LAST IN INSIDE OF PAREHTHESIS
							
							else if
							(closeParenthesis > 0 && infixArray[i+2] == ')')
							{
								System.out.println("ERROR!\n");
								break;
							}
						}
					}
					
	// IF OPERATOR INPUT AGAIN AFTER OPERATOR HAVE INPUTED
					
					if(operator)
					{
						System.out.println("ERROR!\n");
						break;
						
	}
	// IF OPERATOR INPUT FIRST:
					
					else if(infixArray[0] == '/' || infixArray[0]
							== '+' || infixArray[0] == '-' || infixArray[0] == '*' || infixArray[0] == '^')
					{
						System.out.println("ERROR!\n");
						break;
					}
					
	// IF OPERATOR INPUT LAST:
					
					else if(infixArray[infixLen - 1] == '/' ||
							infixArray[infixLen - 1] == '+' || infixArray[infixLen - 1] == '-'
							|| infixArray[infixLen - 1] == '*' ||
							infixArray[infixLen - 1] == '^')
					{
						System.out.println("ERROR!\n");
						break;
					}
					
	// IF OPERATOR IF INPUTING FIRST ON PARENTHESIS
					
					else if (closeParenthesis > 0 &&
							infixArray[i-1] == '(')
					{
						System.out.println("ERROR!\n");
						break;
					}
					
	// IF OPERATOR IS INPUTING LAST ON THE PARENTHESIS
					
					else if (closeParenthesis > 0 &&
							infixArray[i+1] == ')')
					{
						System.out.println("ERROR!\n");
						break;
					}
					operator = true;
				}
				else
				{
					operator = false;
				}
				
	// CLOSE PARENTHESIS IS DETECTED
				
				if (infixArray[i] == ')')
				{
					--closeParenthesis;
					if(closeParenthesis < 0)
					{
						System.out.println("ERROR!\n");
					}
				}
				
	// SPACE (IF)
				
				if (infixArray[i] == ' ')
				{
					if (space)
					{
						System.out.println("ERROR!\n");
						break;
					}
					space = true;
				}
				else
				{
					space = false;
				}
				
	// IF NOT INPUTING, LETTERS, NUMBER, OPERATORS
				
				if(!letterInput && !numInput && !operator &&
						!space && infixArray[i] != '(' && infixArray[i] != ')')
				{
					System.out.println("ERROR! INVALID INPUT\n");
					break;
				}
			}
			if (closeParenthesis > 0)
			{
				System.out.println("ERROR!\n");
			}
			else if (i == infixLen && infixLen != 0 &&
					closeParenthesis == 0)
			{
				enterInfix = false;
			}
			
			else if(infixLen == 0)
			{
				System.out.println("ERROR!\n");
			}
		}
		}
		
		char[] stack = new char [infixLen];

		do {
			
			System.out.println("\n");
			boolean enterMenu = true;
			while (enterMenu)
				
			{
				try
				{
					System.out.println("MENU");
					System.out.println("1. PREFIX");
					System.out.println("2. POSTFIX");
					System.out.println("3. EXIT");
					System.out.print("Enter choice [1-3]: ");
					userChoice = userInput.nextInt();
				
				
				if(userChoice > 0 && userChoice < 4)
				{
					enterMenu = false;
				}else {
					System.out.println("\nINVALID INPUT, PLEASE INPUT AGAIN WHICH 1-3 ONLY!\n");
				}
			}catch(Exception e)
			{
				System.out.println("\nINVALID INPUT!\n");
				userInput.next();
			}
		}
	switch(userChoice)
	{
		case 1:
		infixPrefix(infixArray, stack);
		break;
		
		case 2:
			infixPostfix(infixArray, stack);
			break;
			
		case 3:
			exit = true;
			
			System.out.println("\nProgrammed by: MIGUEL V. PILAPIL.");
			break;
			
	}
		}while(!exit);
		userInput.close();
		}
	
	// CONVERT TO INFIX TO PREFIX
	
		static void infixPrefix (char[] scanChar, char[] stack)
		{
			topData = -1;
			char[] preFixString = new char [scanChar.length + numOfOperators];
			char[] revInfixString = new char [scanChar.length];
			char[] revPrefix = new char [scanChar.length + numOfOperators];
			int preFixStringIdx = 0;
			System.out.print("\nGiven Infix String: ");
			for (int b = 0 ; b < scanChar.length; b++)
			{
				System.out.print(scanChar[b]);
			}
			
	// CONVERTER AND REVERSES TO INFIX STRING 
			
			for (int b = scanChar.length-1, c = 0; b > -1; b--)
		{
				revInfixString[c] = scanChar[b];
				c++;
		}
			System.out.print("\nReversed Infix String: ");
			for (int b = 0 ; b < scanChar.length; b++)
			{
				System.out.print(revInfixString[b]);
			}
			System.out.print("\nScanned Character: ");
			for (int b = 0 ; b < scanChar.length; b++)
			{
				System.out.print(revInfixString[b]);
			}
			System.out.println("");
			for (int a = 0; a < revInfixString.length; a++)
			{
				if (revInfixString[a] == '(' || revInfixString[a] == ')')
				{
					
	// PUSHED OR STACKS
					
					++topData;
					stack[topData] = revInfixString[a];
					printStacks(stack);
					printPrefix(preFixString);
					System.out.println("");
					if (revInfixString[a] == '(')
					{

	// POPS OF REMAINING OP in PAREN
						
						for(int e = topData; e > -1; e--)
						{
							if (stack[e] == '(')
							{
								stack[e] = 0;
								--topData;
							}

	// IF DETECTED ')' THERE STOPPING AUTOMATIC
							
							else if (stack[e] == ')')
							{
								stack[e] = 0;
								--topData;
								break;
								}
							else
							{
								if (ifSpace)
								{
									preFixString[preFixStringIdx] = ' ';
									preFixString[++preFixStringIdx] = stack[topData];
									++preFixStringIdx;
									--topData;
								}
								else
								{
									preFixString[preFixStringIdx] = stack[topData];
									++preFixStringIdx;
									--topData;
								}
							}
						}
					}
				}
				
				else if (revInfixString[a] == '+' || revInfixString[a] == '-'
						|| revInfixString[a] == '*' || revInfixString[a] == '/'
						|| revInfixString[a] == '^')
				{
					
	// STACK IS EMPTY
					
					if(topData == -1)
					{

	// PUSHED OP in EMPTY STACK
						
						++topData;
						stack[topData] = revInfixString[a];
					}
					else if (topData > -1)
					{
						if(Precedence(stack[topData]) >
						Precedence(revInfixString[a])) 
							
	// IF THE STACK IS HIGHER OR SCANNED CHAR THEN AUTOMATIC POP

	// POPS TO OP
						{
							for(int e = topData; e > -1; e--)
							{
								
	// STACK OP IF SMALLER THAN AUTOMATIC STOPPING POPPING 
								
								if (Precedence(stack[topData]) <
										Precedence(revInfixString[a]))
								{
									break;
								}
								if (ifSpace)
								{
									preFixString[preFixStringIdx] = ' ';
									preFixString[++preFixStringIdx] = stack[topData];
									++preFixStringIdx;
									--topData;
								}
								else
								{
									preFixString[preFixStringIdx] = stack[topData];
									++preFixStringIdx;
									--topData;
								}
							}
							
	// PUSHED TO LOWER OP ON THE STACK, AFTER THE HIGHER IS DONE POP
							
							++topData;
							stack[topData] = revInfixString[a];
						}
						else if (Precedence(stack[topData]) <
								Precedence(revInfixString[a]) || (Precedence(stack[topData]) == Precedence(revInfixString[a])))
							
							
	// IF OR STACK LOWER OR EQUAL THAN SCANNED ON THE CHAR THEN AUTOMATIC PUSH
	// AND PUSH TO HIGHER PRECEDURE-OP
							
						{		
							++topData;
							stack[topData] = revInfixString[a];
						}
					}
					
					printStacks(stack);
					printPrefix(preFixString);
					System.out.println("");
				}
				
				else 
				{
					
					// PUTTING OPERAND IN PREFIXSTRING
					//puts the operand in preFixString
					
					preFixString[preFixStringIdx] = revInfixString[a];
					++preFixStringIdx;
					printStacks(stack);
					printPrefix(preFixString);
					System.out.println("");
				}
			}
			
			// POPPED IF THERE REMAINING OP ON THE STACK
			
			for(int e = topData; e > -1; e--)
			{
				if (ifSpace)
				{
					preFixString[preFixStringIdx] = ' ';
					preFixString[++preFixStringIdx] = stack[topData];
					++preFixStringIdx;
					--topData;
				}
				else
				{
					preFixString[preFixStringIdx] = stack[topData];
					++preFixStringIdx;
					--topData;
				}
			}
			printStacks(stack);
			printPrefix(preFixString);
			System.out.println("");
			
			// REVERSINGG TO PREFIXSTRING TO PUTTING ON THE REVERSEPREFIX
			
			for (int b = preFixString.length-1, c = 0; b > -1; b--)
			{
				revPrefix[c] = preFixString[b];
				c++;
			}
			
			// PRINT THE FINAL OUTPUT OF PREFIX STRING
			
			System.out.print("\nReverse Prefix: ");
			
			// EXCHANGE REVPREFIX INTO STRING
			String revPrefixStr = new String(revPrefix);
			
			// REMOVE AND MAKE NEW REVERSE PREFIX NEATER
			
			revPrefixStr = revPrefixStr.trim();
			System.out.print(revPrefixStr);
			System.out.println("\n");
		}
		
		// INFIX TO POSFIX
		
		static void infixPostfix (char[] scanChar, char[] stack)
		{
			topData = -1;
			char[] postFixString = new char [scanChar.length + numOfOperators];
			int postFixStringIdx = 0;
			System.out.print("\nScanned Character: ");
			for (int b = 0 ; b < scanChar.length ; b++)
			{
				System.out.print(scanChar[b]);
			}
			for (int a = 0; a < scanChar.length; a++)
			{
				if (scanChar[a] == '(' || scanChar[a] == ')')
				{
					
					// PUSHED THE ") AND (" TO STACKS
					
					++topData;
					stack[topData] = scanChar[a];
					printStacks(stack);
					printPostfix(postFixString);
					System.out.println("");
					if (scanChar[a] == ')')
					{

						// THE POP OF REMAIN ON OP IN STACK
						
						for(int e = topData; e > -1; e--)
						{
							if (stack[e] == ')')
							{
								stack[e] = 0;
								--topData;
							}
							
							// IF '(' DETECTED THERE AUTOMATIC STOP POPPING
							
							else if (stack[e] == '(')
							{
								stack[e] = 0;
								--topData;
								break;
							}
							else
							{
								if (ifSpace)
								{
									postFixString[postFixStringIdx] = ' ';
									postFixString[++postFixStringIdx] = stack[topData];
									++postFixStringIdx;
									--topData;
	}
								else
	{
									postFixString[postFixStringIdx] = stack[topData];
									++postFixStringIdx;
									--topData;
		}
							}
						}
					}
				}
				else if (scanChar[a] == '+'|| scanChar[a] == '-'
						|| scanChar[a] == '*' || scanChar[a] == '/'
						|| scanChar[a] == '^')
				{
					
					// STACK IF EMPTY
					
					if(topData == -1)
					{
						// OP PUSHED INTO EMPTY STACK:
						
						++topData;
						stack[topData] = scanChar[a];
					}
					else if (topData > -1)
					{
						if((Precedence(stack[topData]) >
						Precedence(scanChar[a])) || (Precedence(stack[topData]) == Precedence(scanChar[a])))
														
	// IF THE STACK IS HIGHER THAN SCANNED CHAR THEN START POP
	// AND POPPING TO OP
							
						{
							for(int e = topData; e > -1; e--)
							{
								
								// IF STACK OP SMALLER THEN START STOP POP
								
								if (Precedence(stack[topData]) <
										Precedence(scanChar[a]))
								{
									break;
								}
								if (ifSpace)
								{
									postFixString[postFixStringIdx] = ' ';
									postFixString[++postFixStringIdx] = stack[topData];
									++postFixStringIdx;
									--topData;
								}
								else
								{
									postFixString[postFixStringIdx] = stack[topData];
									++postFixStringIdx;
									--topData;
								}
							}

							// PUSH TO LOWER PRECEDENCE OP INTO STACKS
							// THEN STACKS HIGHER IS POPPED
							
							++topData;
							stack[topData] = scanChar[a];
						}
						else if (Precedence(stack[topData]) <
								Precedence(scanChar[a])) 
							
							// THERE STACK IF LOWER THAN SCANNED THE CHAR START PUSH
							// AND PUSH TO HIGHER OP
						{			
							++topData;
							stack[topData] = scanChar[a]; 
						}
					}
					printStacks(stack);
					printPostfix(postFixString);
					System.out.println("");
				}
				
				else 
				{
					
					// IF SCAN CHAR IS NOT AN OP
					// AND START PUTT TO OPERAND IN POSTFIXSTRING
					
					postFixString[postFixStringIdx] = scanChar[a];
					++postFixStringIdx;
					printStacks(stack);
					printPostfix(postFixString);
					System.out.println("");
				}
			}
			
			// IF THERE POP REMAINING OP IN STACKS
			
			for(int e = topData; e > -1; e--)
			{
				if (ifSpace)
				{
					postFixString[postFixStringIdx] = ' ';
					postFixString[++postFixStringIdx] = stack[topData];
					++postFixStringIdx;
					--topData;
				}
				else
				{
					postFixString[postFixStringIdx] = stack[topData];
					++postFixStringIdx;
					--topData;
				}
			}
			printStacks(stack);
			printPostfix(postFixString);
			System.out.println("");
			
			// PRINT OUT FINAL POSTFIX 
			
			System.out.print("\nFinal Postfix String: ");
			
			// CHANGES TO REVPREFIX INTO STRING 
			
			String postFixStr = new String(postFixString);
			
			// REMOVED TO MAKE POSTFIX 
			
			postFixStr = postFixStr.trim();
			System.out.print(postFixStr);
			System.out.println("\n");
		}
		
		// THE PRECEDENCE OF THE OPERATORS
		
		static int Precedence(char operator)
		{
			switch (operator)
			{
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '^':
				return 3;
			}
			return -1;
		}
		static void printStacks(char[] stack)
		{
			
			// PRINT STACKS
			
			System.out.print("\nStacks: ");
			for (int b = 0; b <= topData; b++)
			{
				System.out.print(stack[b]);
			}
		}
		static void printPostfix(char[] pfix)
		{
			
			// PRINT TO POSTFIX 
			
			System.out.print("\nPostfix String: ");
			for (int b = 0; b < pfix.length; b++)
			{
				System.out.print(pfix[b]);
			}
		}
		static void printPrefix(char[] pfix)
		{
			
			// PRINT THE POSTFIX
			
			System.out.print("\nPrefix String: ");
			for (int b = 0; b < pfix.length; b++)
			{
				System.out.print(pfix[b]);
			}
		}
		static void loading() throws InterruptedException
		{
			System.out.println("\tLOADING...");
			System.out.print("[");
			Thread.sleep(500);
		System.out.print("////////");
		Thread.sleep(500);
		System.out.print("////////");
		Thread.sleep(500);
		System.out.print("////////");
		Thread.sleep(500);
		System.out.print("]");
		}		
}

package Stack;

import java.util.Scanner;

public class ValidationInput_INFIX_NOTATION {
	
	static int numOfOpInputs = 0;
	static boolean ifSpaceInput = false;
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner Input = new Scanner(System.in);
		
		boolean exit = false;
		boolean EnterInfix = true;
	
		int InfixLen = 0;
		int UserInput = 0;
	
		String infix = "";
		char[] infixArray = null;
		numOfOpInputs = 0;
	

		while (EnterInfix)
		{
			
			
		boolean NumInput = false;
		boolean LetterInput = false;
		boolean OpInput = false;
		boolean SpaceInput = false;
		boolean ValidationInput = true;
		
		int CloseParenthesis = 0;
		int i = 0;
		ifSpaceInput = false;
			
	
	System.out.print("INPUT THE INFIX NOTATION: ");
	infix = Input.nextLine();
	
	InfixLen = infix.length();
	infixArray = new char[InfixLen];
	for(int j = 0; j < infixArray.length; j++)
		
	{	
			
		infixArray[j] = infix.charAt(j);
		
		if (infixArray[j] == '/' || infixArray[j] == '+' || infixArray[j] ==
		'-' || infixArray[j] == '*' || infixArray[j] == '^')
			{
			++numOfOpInputs;
			}
			if (infixArray[j] == ' ')
			{
				ifSpaceInput = true;
			}
		
			
			if(infixArray[j] == '(')
			{
				CloseParenthesis++;
			}
			if (infixArray[j] == ')')
			{
			if (CloseParenthesis == 0)
			{
				System.out.println("INPUT ERROR! INPUT AGAIN:\n");
				break;
			}
			}
		}
		
			if (ifSpaceInput)
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
								System.out.println("INVALID, NO SpaceInput!\n");
								ValidationInput = false;
								break;
							}
						}
					}
				}
			}
			
			
			if (ValidationInput)
			{
				for (i = 0; i < InfixLen; i++)
				{
				
					
					if (infixArray[i] >= '0' && infixArray[i] <= '9')
					{
						if (i < InfixLen-1)
						{
							if (ifSpaceInput)
							{
								if (i < InfixLen-2)
								
								{
									
									
									if (infixArray[i+2]
											!= '/' && infixArray[i+2] != '+' && infixArray[i+2] != '-' && infixArray[i+2] != '*' && infixArray[i+2] != '^' &&
											infixArray[i+2] != ')' && infixArray[i+1] != ')' && infixArray[i+1] == ' ')
									{
										System.out.println("OpInput NOT DETECTED.\n");
										break;
									}
								}
							}
					
							
						else if (infixArray[i+1] > '9' &&
								infixArray[i+1] != '/' && infixArray[i+1] != '+' && infixArray[i+1] != '-' && infixArray[i+1] != '*' && infixArray[i+1]
										!= '^' && infixArray[i+1] != ')')
						{
							System.out.println("OpInput NOT DETECTED.\n");
							break;
						}
					}
					NumInput = true;
				}
				else
				{
					NumInput = false;
				}
				
					
				if ((infixArray[i] >= 'a' && infixArray[i] <= 'z') ||
						(infixArray[i] >= 'A' && infixArray[i] <= 'Z'))
				{
					if (i < InfixLen-1)
					{
						if (ifSpaceInput)
						{
							if (i < InfixLen-2)
							{
								
								
								if (infixArray[i+2]
										!= '/' && infixArray[i+2] != '+' && infixArray[i+2] != '-' && infixArray[i+2] != '*' && infixArray[i+2] != '^' &&
										infixArray[i+2] != ')' && infixArray[i+1] != ')' && infixArray[i+1] == ' ')
								{
									System.out.println("OpInput NOT DETECTED.\n");
									break;
								}
							}
						}
						
						
						else if (infixArray[i+1] != '/' &&
								infixArray[i+1] != '+' && infixArray[i+1] != '-' && infixArray[i+1] != '*' && infixArray[i+1] != '^' &&
								infixArray[i+1] != ')')
						{
							System.out.println("ERROR! INVALID PLEASE TRY AGAIN.\n");
							break;
						}
					}
					LetterInput = true;
				}
				else
				{
					LetterInput = false;
				}
				
				
				if(infixArray[i] == '/' || infixArray[i] == '+' ||
						infixArray[i] == '-' || infixArray[i] == '*' || infixArray[i] == '^')
				{
					if (ifSpaceInput)
					{
						if (i < InfixLen-2)
						{
							
							
							if (infixArray[i+2] == '/' ||
									infixArray[i+2] == '+' || infixArray[i+2] == '-' || infixArray[i+2] == '*' || infixArray[i+2] == '^')
							{
								System.out.println("ERROR!\n");
								break;
							}
							
							
							else if
							(CloseParenthesis > 0 && infixArray[i-2] == '(')
							{
								System.out.println("ERROR!\n");
								break;
							}
							
							
							else if
							(CloseParenthesis > 0 && infixArray[i+2] == ')')
							{
								System.out.println("ERROR!\n");
								break;
							}
						}
					}
					
					
					if(OpInput)
					{
						System.out.println("ERROR!\n");
						break;
						
					}
					
					
					else if(infixArray[0] == '/' || infixArray[0]
							== '+' || infixArray[0] == '-' || infixArray[0] == '*' || infixArray[0] == '^')
					{
						System.out.println("ERROR!\n");
						break;
					}
					
					
					else if(infixArray[InfixLen - 1] == '/' ||
							infixArray[InfixLen - 1] == '+' || infixArray[InfixLen - 1] == '-'
							|| infixArray[InfixLen - 1] == '*' ||
							infixArray[InfixLen - 1] == '^')
					{
						System.out.println("ERROR!\n");
						break;
					}
					
					
					else if (CloseParenthesis > 0 &&
							infixArray[i-1] == '(')
					{
						System.out.println("ERROR!\n");
						break;
					}
					
					
					else if (CloseParenthesis > 0 &&
							infixArray[i+1] == ')')
					{
						System.out.println("ERROR!\n");
						break;
					}
					OpInput = true;
				}
				else
				{
					OpInput = false;
				}
				
				
				if (infixArray[i] == ')')
				{
					--CloseParenthesis;
					if(CloseParenthesis < 0)
					{
						System.out.println("ERROR!\n");
					}
				}
				
				
				if (infixArray[i] == ' ')
				{
					if (SpaceInput)
					{
						System.out.println("ERROR!\n");
						break;
					}
					SpaceInput = true;
				}
				else
				{
					SpaceInput = false;
				}
				
				
				if(!LetterInput && !NumInput && !OpInput &&
						!SpaceInput && infixArray[i] != '(' && infixArray[i] != ')')
				{
					System.out.println("ERROR! INVALID INPUT\n");
					break;
				}
			}
			if (CloseParenthesis > 0)
			{
				System.out.println("ERROR!\n");
			}
			else if (i == InfixLen && InfixLen != 0 &&
					CloseParenthesis == 0)
			{
				EnterInfix = false;
			}
			
			else if(InfixLen == 0)
			{
				System.out.println("ERROR!\n");
			}
		}
		}
		
		System.out.println("\nMENU:");
		System.out.println("1. PREFIX");
		System.out.println("2. POSTFIX");
		System.out.println("3. EXIT");
		System.out.print("Enter choice [1-3]: ");
		UserInput = Input.nextInt();
		
	}
}

package TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {
   private char [][] gameboard;
   private Boolean gameactive = true;
   
   public GameBoard () {
	   gameboard = new char [3][3];
	   for (int r =0 ; r<gameboard.length; r++)
	   {
		   Arrays.fill(gameboard[r], ' ');
	   }
	   
   }
   
   
   
   public boolean makeMove(char player, int r, int c)
   {
	   if(r >= 0 && r <= 2 && c>=0 && c<=2 )
	   {
		   if(gameboard[r][c] != ' ') //nt empty
			   return false;
		   else
			   gameboard[r][c] = player;
		       return true;
			   
	   }
	   
	   
	   
	   else 
		   return false;
   }
   
   
   public boolean isActive()
   {
	   return gameactive;
   }
   
   public boolean isEmpty(int rr, int cc) {
	   
	   if(gameboard[rr-1][cc-1] == ' ')
		   return true;
	   else
		   System.out.println("That position is taken! ");
	       return false;
	   
   }
   
   
   public boolean isValid(int ri ,int ci)
   {
	   if(ri >3  || ri < 1 ||ci >3 || ci < 1 ||!(isEmpty(ri, ci)))
		   return false;
	   else
	   return true;
		   
		   
	   
   }
   
   public void askPlayer(char playr) {
	   
	   Scanner sc = new Scanner(System.in);
	   int r ,c;
	   do {
		   System.out.println("Player "+playr +" Input for row(1-3): ");
		   r = sc.nextInt();
		   System.out.println("Player "+playr +" Input for column(1-3): ");
		   c = sc.nextInt();
		   
		   
	   }while(!isValid(r,c));
	   
	   makeMove(playr,r-1,c-1);
	   
	   
   }
   
   public boolean checkForWiiner()
   {
	   for(int r = 0 ; r <gameboard.length ; r++)
	   {
		   if(gameboard[r][0] == gameboard [r][1] && gameboard[r][1] == gameboard[r][2] && gameboard[r][0] != ' ')
		   {
			   System.out.println("The winner is "+gameboard[r][0]);
			   gameactive = false;
			   return true;
		   }
		  
	   }
	   for(int c = 0 ; c< gameboard[0].length ; c++)
	   {
		   if(gameboard[0][c] == gameboard [1][c] && gameboard[1][c] == gameboard[2][c] && gameboard[0][c] != ' ')
		   {
			   System.out.println("The winner is "+gameboard[0][c]);
			   gameactive = false;
			   return true;
		   }
	   }
	   
	   if( gameboard[0][0] == gameboard[1][1] && gameboard[1][1] == gameboard[2][2] && gameboard[1][1]!= ' ')
	   {
		   System.out.println("The winner is "+gameboard[0][0]);
		   gameactive = false;
		   return true;  
	   }
	   if( gameboard[2][0] == gameboard[1][1] && gameboard[1][1] == gameboard[0][2] && gameboard[2][0]!= ' ')
	   {
		   System.out.println("The winner is "+gameboard[2][0]);
		   gameactive = false;
		   return true;  
	   }
	   
	   return false;
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	public void displayBoard() {
		for(int r =0 ; r<gameboard.length; r++)
		{
			for(int c =0 ; c<gameboard[r].length; c++)
			{
				System.out.print("\t"+gameboard[r][c]);
				if(c == 0 || c == 1)
				{
					System.out.print("|");
				}
			}
			if(r == 0 || r == 1  )
			System.out.print("\n----------------------------\n");
		}
		System.out.println("\n==========================================================\n");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

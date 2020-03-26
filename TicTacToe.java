package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	
	public static void main(String [] args) {

	GameBoard gm = new GameBoard();
	int counter = 1;
	
	
	gm.displayBoard();
	
	
	        while(gm.isActive() && counter < 10) {
	          if(counter % 2 == 0)
	          {
		         gm.askPlayer('O');
	          }
		
	           else {
		         gm.askPlayer('X');
	            }
		
	           counter ++;
	          
	          
	          gm.displayBoard();
	          if( gm.checkForWiiner())
	          {  
	        	  break;
	          }
	          
	           if(counter == 10)
	           {
	        	   System.out.println("DRAW!!");
	        	   break;
	           }
		
		
		    
	}
	
	
	
	
	
	
	
	gm.displayBoard();
	
	
	
	}
	
	
	
}
	
	



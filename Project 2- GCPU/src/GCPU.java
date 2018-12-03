import java.util.Scanner;

public class GCPU {

	public static void main(String[] args) 
	{
		
		Map map = new Map();
		Scanner scan = new Scanner(System.in);
		
		int floor = 0;
		int row = 3;
		int col = 0;
		 
		
		
		System.out.println("Welcome to the Great Cal Poly Pomona Underground!" + "\n" +
		"Type help to list available commands");
		System.out.println("");
		// Begin game loop
		
		String input = "";
		System.out.println(map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
		System.out.println(">");
		while (!input.equalsIgnoreCase("quit"))
				{

				input = scan.nextLine().toLowerCase();
				
				if (input.equals("e")) {
					if (map.rooms[floor][row][col].isValidExit("east")) {
					col++;
					System.out.println("You have entered " + map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
					System.out.println(">");
					}
					else {
						System.out.println("You can't go that way");
					}
				}
				
				else if (input.equals("w")) {
					if (map.rooms[floor][row][col].isValidExit("west")) {
					col--;
					System.out.println("You have entered " +map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
					System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("ne")) {
					if (map.rooms[floor][row][col].isValidExit("northeast"))
					{
						col++;
						row--;
						System.out.println("You have entered " +map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
						System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("nw")) {
					if (map.rooms[floor][row][col].isValidExit("northwest"))
					{
						col--;
						row--;
						System.out.println("You have entered " +map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
						System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("sw")) {
					if (map.rooms[floor][row][col].isValidExit("southwest"))
					{
						col--;
						row++;
						System.out.println("You have entered " +map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
						System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("se")) {
					if (map.rooms[floor][row][col].isValidExit("southeast"))
					{
						col++;
						row++;
						System.out.println("You have entered " + map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
						System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("n")) {
					if (map.rooms[floor][row][col].isValidExit("north")) {
					row--;
					System.out.println("You have entered " +map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
					System.out.println(">");
					}
					else {
							System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("s")) {
					if (map.rooms[floor][row][col].isValidExit("south")) {
					row++;
					System.out.println("You have entered " + map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
					System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("up")) {
					if (map.rooms[floor][row][col].isValidExit("up")) {
					floor++;
					System.out.println("You have entered " + map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
					System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				else if (input.equals("down")) {
					if (map.rooms[floor][row][col].isValidExit("down")) {
					floor--;
					System.out.println("You have entered " + map.rooms[floor][row][col].name + "\n"+ map.rooms[floor][row][col].description );	
					System.out.println(">");
					}
					else {
						System.out.println("You can't go that way.");
					}
				}
				
				
				else if(input.equals("examine"))
				{
					if (map.rooms[floor][row][col].contents != null)
					{
						System.out.println(map.rooms[floor][row][col].contents.examine());
					}
					else {
						System.out.println("There is nothing to examine.");
					}
				}
				
				else if(input.equals("look"))
				{
					if (map.rooms[floor][row][col].contents != null)
					{
						System.out.println(map.rooms[floor][row][col].look());
					}
					else {
						System.out.println("There is nothing to look.");
					}
				}
				
				else if(input.equals("touch"))
				{
					if (map.rooms[floor][row][col].contents != null)
					{
						System.out.println(map.rooms[floor][row][col].contents.touch());
					}
					else {
						System.out.println("There is nothing to touch.");
					}
				}
				
				else if(input.equals("help"))
				{
					System.out.println("If you want to go a specific direction like north or northeast, " + "\n" +
							"then type n or ne to get to another room." );
					System.out.println("");
					System.out.println("If you want to know the name. description, the exits, and " + "\n" +
							"any present artifacts, type in look.");
					System.out.println("");
					System.out.println("If you want to know details about an artifact, " + "\n" +
							"type in examine.");
					System.out.println("");
					System.out.println("There are some rooms with special artifacts."  + "\n" + 
							"To be able to activate the special artifact, type touch.");
				}
				

				else {
					if (input.equals("quit")) {
						break;
					}
					else {
						System.out.println("I don't understand the command");
					}
				}
		

				}
		System.out.println("Thank you for visiting the Underground");
	}
}



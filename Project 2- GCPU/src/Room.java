
// A room in the Underground
public class Room 
{

	// Instance variables
	String name;
	String exits;
	Artifact contents;
	String description;
	
	// Constructor
	public Room(String name, String description, String exits)
	{
		this.name = name;
		this.description = description;
		this.exits = exits;
	}
	
	/*boolean isValidExit(String requestedExit)
	{
		boolean result;
		if (exits.contains(requestedExit))
			result = true;
		else
			result = false;
		return result;
	}*/
	
	boolean isValidExit(String requestedExit)
	{
		String [] computer = this.exits.split(",");
		for (int i = 0; i < computer.length; i++) {
			if (requestedExit.equals(computer[i]))
				return true;
			
			
		}
		
		return false;
		/*if (requestedExit.equals("ne")) {
			requestedExit = "northeast";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("se")) {
			requestedExit = "southeast";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("sw")) {
			requestedExit = "southwest";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("nw")) {
			requestedExit = "northwest";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("north")) {
			requestedExit = "north";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("w")) {
			requestedExit = "west";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("e")) {
			requestedExit = "east";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("s")) {
			requestedExit = "south";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("up")) {
			requestedExit = "up";
			return exits.contains(requestedExit);
			}
		else if (requestedExit.equals("down")) {
			requestedExit = "down";
			return exits.contains(requestedExit);
			}
		return false;
		*/
		
		/*boolean result;
		if (exits.contains(requestedExit))
			result = true;
		else
			result = false;
		return result;
		*/
		
	}
	
	String look()
	{
		String say = "";
		say += this.name + "\n";
		say += this.description + "\n";
		say += this.getExits() + "\n";
		say += this.getArtifact();
		
		return say;
	}
	
	String getExits()
	{
		return "There is an exit to the " + this.exits;
	}
	
	String getArtifact()
	{
		return "The artifact in this room is " + this.contents.name;
	}
	
}

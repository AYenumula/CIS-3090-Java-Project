public class Artifact 
{
	// Instance variables
	String name, description;
	
	// Constructor
	
	Artifact()
	{
		
	}
	Artifact(String name)
	{
		this.name = name;  // this means the instance variable
	}
	

	public Artifact (String name, String description)
	{
		this.name = name;
		this.description = description;
	}

	String examine()
	{
		return description;
		//return name + "\n" + description;
	}
	
	String touch()
	{
		return "Touching this artifact has no effect.";
	}

	
}
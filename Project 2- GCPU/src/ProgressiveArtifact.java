
public class ProgressiveArtifact extends Artifact
{
	// Instance variables
	 String lowDescription; String highDescription;
	
	int state = 0;
	
	// Constructor
	
	public ProgressiveArtifact(String name, String description)
	 {
		 super(name,description);
	 }
	
	public ProgressiveArtifact(String name, String description, String lowDescription,  String highDescription)
	 {
		super(name, description);
		this.lowDescription = lowDescription;
		this.highDescription = highDescription;
	 }

	
	String examine()
	{
		 return this.description;
			  
	}
	
	String touch()
	{
		if (state == 0)
		{
			state += 1;
			return this.lowDescription;
		}
		else if (state == 1) 
		{
			state += 1;
			return this.highDescription;
		}
		else
			state = 0;
			return this.description; 
		
		}
	}
	





public class BooleanArtifact extends Artifact


{
	
	// Instance variables
		 boolean state; String onDescription;  String touchOnDescription;  String touchOffDescription;
		
		 // Constructor
		 
		  public BooleanArtifact(String name, String description)
		 {
			 super(name,description);
		 }
		 
		  public BooleanArtifact(String name, String description, String onDescription,  String touchOnDescription,  String touchOffDescription)
		 {
			super(name, description);
			this.onDescription = onDescription;
			this.touchOnDescription = touchOnDescription;
			this.touchOffDescription = touchOffDescription;
		 }
		    
		  
		  String touch()
		  {
			 if (state) {
				state = false;
				return this.touchOffDescription;
			  }
			 else {
				 state = true;
				 return this.touchOnDescription;
			 }
		  }
		  
		  String examine()
		  {
			return this.onDescription;
			  
			}
}



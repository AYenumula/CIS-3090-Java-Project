
public class Map
{

	Room[][][] rooms = new Room[2][4][4];
	
	Map()
	{
		// Create rooms

		String exits = "south,east,up";
		String description = "Sunlight is streaming in through the glass windows."+"\n"+ "There is a staircase that leads upstairs.";
		String name = "University Library";
		Room library = new Room(name, description, exits);
		
		name = "BioTrek Greenhouse";
		exits = "east,west,up";
		description =  "You see over 200 rainforest species of plants in this greenhouse and appreciate the complexity of nature." +"\n"+"There is a staircase that leads upstairs.";
		Room bioTrek = new Room(name, description, exits);
		
		
		name = "Farm Store";
		exits = "west,southwest,east,up";
		description =  "An amazing collection of produce from the campus is arranged in brightly lit display cases." +"\n"+ "There is a staircase that leads upstairs.";
		Room farmStore = new Room(name, description, exits);
		
		
		name = "Starbucks";
		exits = "west,south,up";
		description = "Starbucks is overcrowded with people."+"\n"+ "There is a staircase that leads upstairs.";
		Room starBucks = new Room(name, description, exits);
		
		
		name = "Classroom";
		exits = "north,east";
		description = "You see an old table covered with papers near the front of the room.";
		Room classRoom = new Room(name, description, exits);
		
		
		name = "Rose Garden";
		exits = "south,west,northeast";
		description =  "You are standing in the middle of a beautiful rose garden.";
		Room roseGarden = new Room(name, description, exits);
		
		
		name = "Pony Express";
		exits = "east,south";
		description = "The Pony Express has a lot of snacks.";
		Room ponyExpress = new Room(name, description, exits);
		
		
		name = "Dorms";
		exits = "west";
		description = "The Dorms are for first-year students.";
		Room residentialHalls = new Room(name, description, exits);
		
		
		name = "Kellogg Mansion";
		exits = "east";
		description = "This is the former home of William Kellogg.";
		Room kelloggMansion = new Room(name, description, exits);
		
		
		name = "Los Olivos";
		exits = "north,east,northeast";
		description = "The aroma of hamburgers and pizza wafts through the air.";
		Room losOlivos = new Room(name, description, exits);
		
		
		name = "Bronco Student Center(BSC)";
		exits = "southwest,east,north";
		description = "The BSC is where student come to eat or study";
		Room broncoStudentCenter = new Room(name, description, exits);
		
		
		name = "Campus MarketPlace";
		exits = "west,south";
		description = "The Campus MarketPlace has a variety of fast food restaurants to eat from.";
		Room campusMarketPlace = new Room(name, description, exits);
		
		
		name = "Box Canyon";
		exits = "north";
		description = "This looks like the Voorhis Ecological Reserve. A cavernous opening in the canyon wall lies just ahead of you.";
		Room boxCanyon = new Room(name, description, exits);
		
		name = "BRIC";
		exits = "west,east,northeast";
		description = " The BRIC is a great place to work out.";
		Room bric = new Room(name, description, exits);
		
		
		name = "Vista Market";
		exits = "east,west,northwest";
		description = "The Vista Market is like the Pony Express.";
		Room vistaMarket = new Room(name, description, exits);
		
		name = "Suites";
		exits = "west,north";
		description = "The Suites are an upgrade from the Dorms.";
		Room residentialSuites = new Room(name, description, exits);
		
		name = "Computer Lab";
		exits = "down,east";
		description = "The Computer Lab is open 24 hours."+"\n"+ "There is a staircase that leads downstairs.";
		Room computerLab = new Room(name, description, exits);
		
		name = "College of Business";
		exits = "down,east,west";
		description = "The College of Business has all the business classes." +"\n"+"There is a staircase that leads downstairs.";
		Room collegeOfBusiness = new Room(name,description, exits);
		
		name = "Carls Jr.";
		exits = "down,east,west";
		description = "Carls Jr. is one of the fast foods on campus." +"\n"+"There is a staircase that leads downstairs.";
		Room carlsJunior = new Room(name,description, exits);
		
		name = "Subway";
		exits = "down,west";
		description = "Subway: Eat Fresh."+"\n"+"There is a staircase that leads downstairs.";
		Room subWay = new Room(name,description, exits);
		
		
		// Place rooms on map
		rooms[0][0][0] = library;
		rooms[0][0][1] = bioTrek;
		rooms[0][0][2] = farmStore;
		rooms[0][0][3] = starBucks;
		
		rooms[1][0][0] = computerLab;
		rooms[1][0][1] = collegeOfBusiness;
		rooms[1][0][2] = carlsJunior;
		rooms[1][0][3] = subWay;
		
		rooms[0][1][0] = classRoom;
		rooms[0][1][1] = roseGarden;
		rooms[0][1][2] = ponyExpress;
		rooms[0][1][3] = residentialHalls;
		
		rooms[0][2][0] = kelloggMansion;
		rooms[0][2][1] = losOlivos;
		rooms[0][2][2] = broncoStudentCenter;
		rooms[0][2][3] = campusMarketPlace;
		
		rooms[0][3][0] = boxCanyon;
		rooms[0][3][1] = bric;
		rooms[0][3][2] = vistaMarket;
		rooms[0][3][3] = residentialSuites;
		
		// Create artifact
		ProgressiveArtifact lamp = new ProgressiveArtifact("a lamp", "A dusty reading lamp is off." );
		library.contents = lamp;
		lamp.lowDescription = "The lamp emits a dim glow.";
		lamp.highDescription = "The lamp has a pleasant light.";
		
		BooleanArtifact caiman = new BooleanArtifact("a caiman", "The caiman has come out of hiding.");
		caiman.name = "a caiman";
		caiman.onDescription = "The caiman watches you closely and you treat him with respect.";
		caiman.touchOnDescription = "The caiman is mad and looks like he is about to attack.";
		caiman.touchOffDescription = "The caiman is calm and went away.";
		
		Artifact iceCream = new Artifact("an ice cream");
		iceCream.name = "an ice cream";
		iceCream.description = "You see a container of Dr.Bob's ice cream. The best ice cream on the planet. You can't wait to try some.";
		
		Artifact coffee = new Artifact("a cup of coffee");
		coffee.name = "a cup of coffee";
		coffee.description = "Coffee is really hot. Be careful!";
		
		Artifact exam = new Artifact("an exam");
		exam.name = "an exam";
		exam.description = "CIS 3090 Final Exam... The rest appears unreadable due to a lack of printer toner.";
		
		Artifact gazebo = new Artifact("a gazebo");
		gazebo.name = "a gazebo";
		gazebo.description = "The small plaque on the structure reads: Enjoy the garden!";
		
		Artifact candy = new Artifact("a piece of candy");
		candy.name = "a piece of candy";
		candy.description = "The candy found is a snickers bar.";
		
		Artifact bulletinBoard = new Artifact("a bulletin board");
		bulletinBoard.name = "a bulletin board";
		bulletinBoard.description = "The bulletin board is filled with pictures.";
		
		Artifact picture = new Artifact("a picture");
		picture.name = "a picture";
		picture.description = "The picture bears on inscription that reads: W.K.Kellogg. He appears to be holding a box of Corn Flakes.";
		
		Artifact lunch = new Artifact("lunch");
		lunch.name = "lunch";
		lunch.description = "The lunch appears to be a hamburger, French fries, and some kind of soda.";
		
		Artifact poolTable = new Artifact("a pool table");
		poolTable.name ="a pool table";
		poolTable.description = "The pool table is empty.";
		
		Artifact orangeChicken = new Artifact("a piece of orange chicken");
		orangeChicken.name = "a piece of orange chicken";
		orangeChicken.description = "A piece of orange chicken is on the floor. Don't eat it.";
		
		BooleanArtifact paper = new BooleanArtifact("a piece of paper", "The paper appears blank." );
		paper.touchOnDescription = "The paper begins to glow…";
		paper.touchOffDescription = "The writing fades.";
		paper.onDescription = "The paper reads: Welcome to the Great Cal Poly Underground!";
		boxCanyon.contents = paper;
		
		Artifact dumbbell = new Artifact("a dumbbell");
		dumbbell.name = "a dumbbell";
		dumbbell.description = "A dumbbell is not in its place on the rack.";
		
		Artifact frozenFood = new Artifact("frozen food");
		frozenFood.name = "frozen food";
		frozenFood.description = "Frozen food is an option if you can't cook food.";
		
		//Artifact stove = new Artifact("a stove");
		//stove.name = "a stove";
		//stove.description = "The stove is turned on.";
		
		Artifact courseHandout = new Artifact("the course handout");
		courseHandout.name = "the course handout";
		courseHandout.description = "This handout has the semester conversion.";
		
		Artifact computer = new Artifact("a computer");
		computer.name = "a computer";
		computer.description = "The computer looks like its turned off.";
		
		Artifact sandwich = new Artifact("a sandwich");
		sandwich.name = "a sandwich";
		sandwich.description = "A chicken sandwich is left on the table.";
		
		Artifact footlongSandwich = new Artifact("a footlong sandwich");
		footlongSandwich.name = "a footlong sandwich";
		footlongSandwich.description = "A footlong sandwich with sweet-onion teriyaki and italian herbs and cheese beard.";
		
		// Place artifacts
		library.contents = lamp;
		bioTrek.contents = caiman;
		farmStore.contents = iceCream;
		starBucks.contents = coffee;
		
		collegeOfBusiness.contents = courseHandout;
		computerLab.contents = computer;
		carlsJunior.contents = sandwich;
		subWay.contents = footlongSandwich;
		
		classRoom.contents = exam;
		roseGarden.contents = gazebo;
		ponyExpress.contents = candy;
		residentialHalls.contents = bulletinBoard;
		
		kelloggMansion.contents = picture;
		losOlivos.contents = lunch;
		broncoStudentCenter.contents = poolTable;
		campusMarketPlace.contents = orangeChicken;
		
		boxCanyon.contents = paper;
		bric.contents = dumbbell;
		vistaMarket.contents = frozenFood;
		//residentialSuites.contents = stove;
		
		
	}
}

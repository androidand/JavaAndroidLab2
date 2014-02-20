		
		// This part works great inside MainActivity.
		
		// Finds the starter container in menu view, this is where we want to populate with dishes
		LinearLayout parent = (LinearLayout) findViewById(R.id.menu_view_starter_layout);
		
		//Inflates a child of the dish_representation XML into the above LinearLayout
		View barn = getLayoutInflater().inflate(R.layout.dish_representation, parent);
		
		//Sets the textView for the inflated dish
		TextView provtext = (TextView) barn.findViewById(id.dish_text_view);
		provtext.setText("888888888888!!!!");
		
		//Sets the image resource for the inflated dish
		ImageView provbild = (ImageView) barn.findViewById(id.dish_image_view);
		provbild.setImageResource(R.drawable.icecream);
		
		//But this is just a test and just for one object.
		
		/* What we need to do with this: 
		Understand how this can be used in the MenuView.java.
		For some reason it only works from the Activity files.
		
		Will need 3 of these for each dish type (starter, main course, desert)
		Need to iterate over each dish and create "children" of each dish.
		
		*/
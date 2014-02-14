package se.kth.csc.iprog.dinnerplanner.android;

import se.kth.csc.iprog.dinnerplanner.android.view.*;
import se.kth.csc.iprog.dinnerplanner.model.*;
import android.app.Activity;
import android.os.Bundle;
import android.widget.*;


public class MenuActivity extends Activity {

	
	
	 protected void onCreate(Bundle savedInstanceState) {
	        // Default call to load previous state
	    	super.onCreate(savedInstanceState);
	    	
	    	// Set the view for the menu activity screen
	    	// it must come before any call to findViewById method
	        setContentView(R.layout.menu_view);
	        
	    	// Creating the view class instance
	        
	       //MenuView mainView = new MenuView(findViewById(R.id.this_is_menu));
		//	TextView example2 = (TextView) view.findViewById(R.id.tot_val);
		//	example2.setText("42!");
	       
	    }
	
	
	
	
	
	
}

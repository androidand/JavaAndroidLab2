package se.kth.csc.iprog.dinnerplanner.android;

import java.util.HashSet;
import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.view.ExampleView;
import se.kth.csc.iprog.dinnerplanner.android.view.SplashView;
import se.kth.csc.iprog.dinnerplanner.android.view.MenuView;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Default call to load previous state
    	super.onCreate(savedInstanceState);
    	
    	// Set the view for the main activity screen
    	// it must come before any call to findViewById method
        setContentView(R.layout.activity_main);
        
    	// Creating the view class instance
    	//ExampleView mainView = new ExampleView(findViewById(R.id.this_is_example_view_id));
        //ExampleView mainView = new ExampleView(findViewById(R.id.this_is_splash));
        
        
        //SplashView mainView = new SplashView(findViewById(R.id.this_is_splash));
        
       // MenuView mainView = new MenuView(findViewById(R.id.this_is_menu));
        MenuView mainView = new MenuView(findViewById(R.id.menu_view));
        Set<Dish> menyn = new HashSet<Dish>();
		DinnerModel modellen = new DinnerModel();
		menyn = modellen.getFullMenu();
		mainView.printDishes(menyn);
       
    }

}

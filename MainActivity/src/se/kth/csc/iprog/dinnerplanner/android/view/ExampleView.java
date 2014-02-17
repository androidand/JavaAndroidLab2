package se.kth.csc.iprog.dinnerplanner.android.view;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.DinnerModel;
import android.view.View;
import android.widget.TextView;

public class ExampleView {

	View view;

	public ExampleView(View view) {

		// store in the class the reference to the Android View
		this.view = view;

		//Kan det vara dessa som krashar splash?
		
	//	TextView example = (TextView) view.findViewById(R.id.example_text);
										//example.setText("Hello wöörld!");
		
		
		//								example.setText(R.string.hello_world);
		// Setup the rest of the view layout
	}

}

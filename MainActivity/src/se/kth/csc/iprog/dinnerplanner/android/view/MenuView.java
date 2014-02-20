package se.kth.csc.iprog.dinnerplanner.android.view;

import java.util.Set;

import se.kth.csc.iprog.dinnerplanner.android.R;
import se.kth.csc.iprog.dinnerplanner.model.Dish;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuView {

	View view;

	public MenuView(View view) {

		// store in the class the reference to the Android View
		this.view = view;
		
	//	TableRow row = (TableRow) view.findViewById(R.id.submenu_title1_picture_row);
		//text.set
		 
		 
	//	testtext.setText(d.getName());
	//	((LinearLayout)view).addView(text);
		
		
		
	//	submenu_title1_picture_row.addView
		
		
		
		//TextView example = (TextView) view.findViewById(R.id.example_text);
		//example.setText("Hello wöörld!");

//		TextView example2 = (TextView) view.findViewById(R.id.tot_val);
//		example2.setText("42");
	//	ImageView example3 = (ImageView) view.findViewById(R.id.imageView1);
	//	example3.setImageResource(R.drawable.icecream);

		
		
	}
	public void addDish(Dish dish){
		ImageView img = new ImageView(view.findViewById(R.id.menu_view_starter_layout).getContext());
		img.setImageResource(dish.getImage());
		LinearLayout v = (LinearLayout) view.findViewById(R.id.menu_view_starter_layout);
		v.addView(img);
	}
		public void printDishes(Set<Dish> menyn) {
			String D;
			TextView numberOfDishes = (TextView) view.findViewById(R.id.tot_val);
			D=Integer.toString(menyn.size());
			numberOfDishes.setText("");
			numberOfDishes.append(D);
			}
}
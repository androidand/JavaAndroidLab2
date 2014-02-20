package se.kth.csc.iprog.dinnerplanner.android.view;

import java.util.Iterator;
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
	public void addStarters(Set<Dish> starters ){ 
		Dish dish;
		Iterator<Dish> i = starters.iterator();
		while(i.hasNext()){
			dish = i.next();
			
		ImageView img = new ImageView(view.findViewById(R.id.menu_view_starter_layout).getContext());
		LinearLayout v = (LinearLayout) view.findViewById(R.id.menu_view_starter_layout);
		TextView txt = new TextView(view.findViewById(R.id.menu_view_starter_layout).getContext());
		txt.setText(dish.getName());
		img.setImageResource(dish.getImage());
		v.addView(img);
		v.addView(txt);
		}
	}
	public void addMaincourses(Set<Dish> maincourses ){ 
		Dish dish;
		Iterator<Dish> i = maincourses.iterator();
		while(i.hasNext()){
			dish = i.next();
			
		ImageView img = new ImageView(view.findViewById(R.id.menu_view_mainCourse_layout).getContext());
		LinearLayout v = (LinearLayout) view.findViewById(R.id.menu_view_mainCourse_layout);
		TextView txt = new TextView(view.findViewById(R.id.menu_view_mainCourse_layout).getContext());
		txt.setText(dish.getName());
		img.setImageResource(dish.getImage());
		v.addView(img);
		v.addView(txt);
		}
	}
	public void addDeserts(Set<Dish> deserts ){ 
		Dish dish;
		Iterator<Dish> i = deserts.iterator();
		while(i.hasNext()){
			dish = i.next();
			
		ImageView img = new ImageView(view.findViewById(R.id.menu_view_desert_layout).getContext());
		LinearLayout v = (LinearLayout) view.findViewById(R.id.menu_view_desert_layout);
		TextView txt = new TextView(view.findViewById(R.id.menu_view_desert_layout).getContext());
		txt.setText(dish.getName());
		img.setImageResource(dish.getImage());
		v.addView(img);
		v.addView(txt);
		}
	}
		public void printDishes(Set<Dish> menyn) {
			String D;
			TextView numberOfDishes = (TextView) view.findViewById(R.id.tot_val);
			D=Integer.toString(menyn.size());
			numberOfDishes.setText("");
			numberOfDishes.append(D);
			}
}
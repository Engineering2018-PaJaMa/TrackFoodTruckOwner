package com.example.pajama.trackfoodtruck.ListAdapter;


import com.example.pajama.trackfoodtruckowner.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ReviewListAdapter extends ArrayAdapter
{
	private final Activity context;
	private final String[] dateArray;
	private final String[] authorNameArray;
	private final String[] reviewArray;

	public ReviewListAdapter(Activity context, String[] dateArray, String[] authorNameArray, String[] reviewArrayParam){

		super(context,R.layout.detailslistview_row , reviewArrayParam);

		this.context=context;
		this.dateArray = dateArray;
		this.authorNameArray = authorNameArray;
		this.reviewArray = reviewArrayParam;

	}

	public View getView(int position, View view, ViewGroup parent) {
		LayoutInflater inflater=context.getLayoutInflater();
		View rowView=inflater.inflate(R.layout.detailslistview_row, null,true);

		TextView dateTextField = rowView.findViewById(R.id.detailDateTextView);
		TextView authorNameTextField = rowView.findViewById(R.id.detailsAuthorReviewextView);
		TextView reviewTextField = rowView.findViewById(R.id.reviewTextView);

		dateTextField.setText(dateArray[position]);
		authorNameTextField.setText(authorNameArray[position]);
		reviewTextField.setText(reviewArray[position]);

		return rowView;

	};
}

package com.example.pajama.trackfoodtruck.Activities;

import com.example.pajama.trackfoodtruck.ListAdapter.ReviewListAdapter;
import com.example.pajama.trackfoodtruckowner.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class WelcomeActivity extends AppCompatActivity
{

	MenuItem itemToHide;
	String[] dateArray = {"13 Lipca","23 Lutego","15 Sierpnia","5 Stycznia"};

	String[] authorArray = {
			"Bradley Henderson",
			"Efe Peck",
			"Melanie Nolan",
			"Jamie-Lee Rennie"
	};

	String[] reviewArray = {
			"Wow",
			"Delicious in rolls",
			"Great",
			"Nice"
	};
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		Toolbar myToolbar = (Toolbar) findViewById(R.id.ActivityToolbar);
		setSupportActionBar(myToolbar);
		ReviewListAdapter reviewListAdapter = new ReviewListAdapter(this, dateArray, authorArray, reviewArray);
		listView = (ListView) findViewById(R.id.reviewsList);
		listView.setAdapter(reviewListAdapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		itemToHide = menu.findItem(R.id.welcomeScreen);

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
			// action with ID action_refresh was selected
			case R.id.updateData:
				Intent intentinformation = new Intent(this, UpdateInformationActivity.class);
				startActivity(intentinformation);
				break;
			// action with ID action_settings was selected
			case R.id.updateStatus:
				Intent intentStatus = new Intent(this, UpdateStatusActivity.class);
				startActivity(intentStatus);
				break;
			case R.id.welcomeScreen:
				itemToHide.setEnabled(false);
				Intent intentWelcome = new Intent(this, WelcomeActivity.class);
				startActivity(intentWelcome);
				break;
			default:
				break;
		}

		return true;
	}
}

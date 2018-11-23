package com.example.pajama.trackfoodtruck.Activities;

import com.example.pajama.trackfoodtruckowner.R;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class UpdateStatusActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_update_status);
		Toolbar myToolbar = (Toolbar) findViewById(R.id.ActivityToolbar);
		setSupportActionBar(myToolbar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
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
				Intent intentWelcome = new Intent(this, WelcomeActivity.class);
				startActivity(intentWelcome);
				break;
			default:
				break;
		}

		return true;
	}
}

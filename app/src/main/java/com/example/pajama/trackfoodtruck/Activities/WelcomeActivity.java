package com.example.pajama.trackfoodtruck.Activities;

import com.example.pajama.trackfoodtruckowner.R;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

public class WelcomeActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		Toolbar myToolbar = (Toolbar) findViewById(R.id.ActivityToolbar);
		setSupportActionBar(myToolbar);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
}

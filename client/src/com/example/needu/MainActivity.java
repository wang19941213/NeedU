package com.example.needu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity 
{
	private Button squareButton;
	private Button personalButton;
	private Button setButton;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		initViews();
		}
	
	private void initViews()
	{
		squareButton = (Button)findViewById(R.id.squareButton);
		personalButton = (Button)findViewById(R.id.personalButton);
		setButton = (Button)findViewById(R.id.setButton);
	}	
}
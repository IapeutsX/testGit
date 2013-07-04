package com.sdjxd.elecsys.activity;

import com.sdjxd.elecsys.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity 
{
	private ImageView img=null;
	private TextView usn=null,pwd=null;
	private EditText editUsn=null,editPwd=null;
	private Button login=null,setting=null;
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		findById();
		setContentView(R.layout.main);
		login.setText(R.string.login);
		setting.setText(R.string.setting);
	}
	private void findById()
	{
		img=(ImageView) findViewById(R.id.opening_img);
		usn=(TextView) findViewById(R.id.usn);
		pwd=(TextView) findViewById(R.id.pwd);
		editUsn=(EditText) findViewById(R.id.edit_usn);
		editPwd=(EditText) findViewById(R.id.edit_pwd);
		login=(Button) findViewById(R.id.login);
		setting=(Button) findViewById(R.id.setting);
	}
}

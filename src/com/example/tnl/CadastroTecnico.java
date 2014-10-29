package com.example.tnl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CadastroTecnico extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro_tecnico);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_tecnico, menu);
		return true;
	}

}

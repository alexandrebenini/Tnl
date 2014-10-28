package com.example.tnl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class VisitaCliente extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.visita_cliente);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.visita_cliente, menu);
		return true;
	}

}

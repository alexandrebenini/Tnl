package com.example.tnl;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CadastroProduto extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro_produtos);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_produto, menu);
		return true;
	}

}

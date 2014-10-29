package com.example.tnl;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class CadastroTecnico extends Activity {
	Button btSalvarTecnico;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cadastro_tecnico);
		
		// aqui 2 parte
		btSalvarTecnico = (Button) findViewById(R.id.btSalvarTecnico);
		btSalvarTecnico.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// aqui 3 parte
						Intent TrocaTela = new Intent(CadastroTecnico.this,Principal.class);
						CadastroTecnico.this.startActivity(TrocaTela);
						CadastroTecnico.this.finish();
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro_tecnico, menu);
		return true;
	}

}

package com.example.tnl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenuNovo extends Activity {
	Button btcadastrousuario,btcadastrolavoura;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_novo);
		
		btcadastrolavoura = (Button) findViewById(R.id.btcadastrolavoura);
		btcadastrolavoura.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// aqui 3 parte
				Intent TrocaTela = new Intent(MenuNovo.this,CadastroLavoura.class);
				MenuNovo.this.startActivity(TrocaTela);
			
			}
		});
		// aqui 2 parte
		        
				btcadastrousuario = (Button) findViewById(R.id.btcadastrousuario);
				btcadastrousuario.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// aqui 3 parte
						Intent TrocaTela1 = new Intent(MenuNovo.this,CadastroUsuario.class);
						MenuNovo.this.startActivity(TrocaTela1);
						
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.principal, menu);
		return true;
	}
	
}

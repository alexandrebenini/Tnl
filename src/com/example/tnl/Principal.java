package com.example.tnl;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


import com.example.tnl.R;

public class Principal extends Activity {
	
	//aqui primeira parte
	Button btlogin ,btcadastrotecnico;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_principal);
		// aqui 2 parte
		btlogin = (Button) findViewById(R.id.btlogin);
		btlogin.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// aqui 3 parte
				Intent TrocaTela = new Intent(Principal.this,MenuNovo.class);
				Principal.this.startActivity(TrocaTela);
				Principal.this.finish();
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
	

package com.example.tnl;

import java.io.File;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class VisitaCliente extends Activity {
	Button btFoto;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.visita_cliente);
		btFoto = (Button) findViewById(R.id.btFoto);
		btFoto.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				camera();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.visita_cliente, menu);
		return true;
	}

	public void camera(){
		
		Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		startActivity(intent);
	// File picsDir =
	// Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
	// File imageFile = new File(picsDir, "foto.jpg");

	// Intent i = new
	// Intent(MediaStore.EXTRA_OUTPUT,Uri.fromFile(imageFile));
	// startActivity(i);

	 }
}

package com.example.tnl.models;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CustomSQLiteOpenHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME = "tnl.db";
	private static final int DATABASE_VERSION = 1;

	private static final String DATABASE_CREATE = TecnicoDAO.CREATE_TABLE 
			+ ClienteDAO.CREATE_TABLE
			+ LavouraDAO.CREATE_TABLE
			+ NivelTecnologicoDAO.CREATE_TABLE
			+ ProdutoDAO.CREATE_TABLE
			+ RelatorioDAO.CREATE_TABLE
			+ TecnicoDAO.CREATE_TABLE;
	
	public CustomSQLiteOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TecnicoDAO.TABLE_NAME);
		onCreate(db);
	}
}

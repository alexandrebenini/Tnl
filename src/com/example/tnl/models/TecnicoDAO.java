package com.example.tnl.models;

import java.util.Date;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;



public class TecnicoDAO {
	protected static final String TABLE_NAME = "tecnico";
	protected static final String NOME = "nome";
	protected static final String ID = "ID";
	protected String[] columns = { ID, NOME };

	protected static final String CREATE_TABLE = "create table " + TABLE_NAME
			+ "(" + ID + " integer primary key autoincrement , "
			+ NOME + " text not null);";
	
	
	protected SQLiteDatabase database;
	
	protected CustomSQLiteOpenHelper sqliteOpenHelper;

	public TecnicoDAO(Context context) {
		sqliteOpenHelper = new CustomSQLiteOpenHelper(context);
	}

	public void open() throws SQLException {
		database = sqliteOpenHelper.getWritableDatabase();
	}

	public void close() {
		sqliteOpenHelper.close();
	}
	public void insere(String nome) {
		ContentValues values = new ContentValues();
		values.put(NOME, nome);
		database.insert(TABLE_NAME, null, values);
	}
}

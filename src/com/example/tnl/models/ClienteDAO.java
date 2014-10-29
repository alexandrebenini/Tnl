package com.example.tnl.models;

import java.sql.SQLClientInfoException;
import java.util.Date;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class ClienteDAO {
	protected static final String TABLE_NAME = "cliente";
	protected static final String NOME = "nome";
	protected static final String TELEFONE = "telefone";
	protected static final String ENDERECO = "endereco";
	protected static final String CPF = "cpf";
	protected static final String ID = "ID";
	protected String[] columns = { ID, NOME, TELEFONE, ENDERECO, CPF };

	protected static final String CREATE_TABLE = "create table " + ClienteDAO.TABLE_NAME
			+ "(" + ClienteDAO.ID + " integer primary key autoincrement , "
			+ ClienteDAO.NOME + " text not null,"
			+ ClienteDAO.TELEFONE + "text not null," 
			+ ClienteDAO.ENDERECO + "text not null,"
			+ ClienteDAO.CPF + "text not null,);";
	
	
	protected SQLiteDatabase database;
	private CustomSQLiteOpenHelper sqliteOpenHelper;

	public ClienteDAO(Context context) {
		sqliteOpenHelper = new CustomSQLiteOpenHelper(context);
	}
	public void open() throws SQLException {
		database = sqliteOpenHelper.getWritableDatabase();
	}
	public void close() {
		sqliteOpenHelper.close();
	}
}


package com.example.tnl.models;

public class LavouraDAO {
	protected static final String TABLE_NAME = "lavoura";
	protected static final String NOME = "nome";
	protected static final String TAMANHO = "tamanho";
	protected static final String CLIENTE_ID= "cliente_ID";
	protected static final String ID = "ID";
	private String[] columns = { ID, NOME };

	protected static final String CREATE_TABLE = "create table " + LavouraDAO.TABLE_NAME
			+ "(" + LavouraDAO.ID + " integer primary key autoincrement , "
			+ LavouraDAO.NOME + " text not null,"
			+ LavouraDAO.TAMANHO + "text not null," 
			+ LavouraDAO.CLIENTE_ID + "text not null,);";
}


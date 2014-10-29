package com.example.tnl.models;

public class ProdutoDAO {
	protected static final String TABLE_NAME = "produto";
	protected static final String NOME = "nome";
	protected static final String VALOR = "valor";
	protected static final String QUANTIDADE = "quantidade";
	protected static final String TIPO = "valor";
	protected static final String ID = "ID";
	private String[] columns = { ID };

	protected static final String CREATE_TABLE = "create table " + ProdutoDAO.TABLE_NAME
			+ "(" + ProdutoDAO.ID + " integer primary key autoincrement , "
			+ ProdutoDAO.VALOR + " text not null,"
			+ ProdutoDAO.QUANTIDADE + "text not null," 
			+ ProdutoDAO.TIPO + "text not null,"
			+ ProdutoDAO.NOME + "text not null,);";
}


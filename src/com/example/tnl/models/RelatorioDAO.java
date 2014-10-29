package com.example.tnl.models;

public class RelatorioDAO {
	protected static final String TABLE_NAME = "relatorio_visita";
	protected static final String DESCRICAO = "descriacao";
	protected static final String FOTO = "foto";
	protected static final String CLIENTE_ID= "cliente_ID";
	protected static final String ID = "ID";
	protected static final String NIVEL_TECNOLOGICO_ID = "nivel_tecnologico_id";
	private String[] columns = { ID, DESCRICAO };

	protected static final String CREATE_TABLE = "create table " + RelatorioDAO.TABLE_NAME
			+ "(" + RelatorioDAO.ID + " integer primary key autoincrement , "
			+ RelatorioDAO.DESCRICAO + " text not null,"
			+ RelatorioDAO.FOTO + "text not null," 
			+ RelatorioDAO.CLIENTE_ID + "text not null,"
			+ RelatorioDAO.NIVEL_TECNOLOGICO_ID + "text not null,);";
}

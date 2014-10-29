package com.example.tnl.models;

public class NivelTecnologicoDAO {
	protected static final String TABLE_NAME = "niveltecnologico";
	protected static final String VALOR_TOTAL = "valor_total";
	protected static final String NIVEL = "nivel";
	protected static final String ID = "ID";
	private String[] columns = { ID };

	protected static final String CREATE_TABLE = "create table " + NivelTecnologicoDAO.TABLE_NAME
			+ "(" + NivelTecnologicoDAO.ID + " integer primary key autoincrement , "
			+ NivelTecnologicoDAO.VALOR_TOTAL + " text not null,"
			+ NivelTecnologicoDAO.NIVEL + "text not null,);";
}
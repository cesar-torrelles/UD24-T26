package com.Ejercicio4.service;

import java.util.List;

import com.Ejercicio4.dto.Investigadores;

public interface InvestigadoresService {

	//Metodos del CRUD
		public List<Investigadores> listarInvestigadores(); //Listar All 
		
		public Investigadores guardarInvestigadores(Investigadores Investigadores);	//Guarda un Investigadores CREATE
		
		public Investigadores InvestigadoresXID(int id); //Leer datos de un Investigadores READ
		
		public Investigadores actualizarInvestigadores(Investigadores Investigadores); //Actualiza datos del Investigadores UPDATE
		
		public void eliminarInvestigadores(int id);// Elimina el Investigadores DELETE
	
}



package it.polito.tdp.iscritticorsi.db;

import java.util.List;

import it.polito.tdp.iscritticorsi.model.Corso;
import it.polito.tdp.iscritticorsi.model.Studente;

public class TestDAO {

	/**
	 * Main method for TESTING the DAO methods
	 * @param args
	 */
	public static void main(String[] args) {
		IscrittiDAO dao = new IscrittiDAO() ;
		
		List<Studente> tuttiStudenti = dao.getAllStudente() ;
		System.out.println(tuttiStudenti.size()+" studenti") ;
		System.out.println(tuttiStudenti) ;
		
		List<Corso> tuttiCorsi = dao.getAllCorso() ;
		System.out.println(tuttiCorsi.size()+" corsi") ;
		System.out.println(tuttiCorsi) ;

		Studente esempioStudente = tuttiStudenti.get(0) ;
		List<Corso> alcuniCorsi = dao.getCorsiByStudente(esempioStudente) ;
		System.out.println(alcuniCorsi.size()+" corsi di "+esempioStudente ) ;
		System.out.println(alcuniCorsi) ;
		
		Corso esempioCorso = tuttiCorsi.get(0) ;
		List<Studente> alcuniStudenti = dao.getStudentiByCorso(esempioCorso) ;
		System.out.println(alcuniStudenti.size()+" studenti di "+esempioCorso) ;
		System.out.println(alcuniStudenti) ;
		
		
	}
}

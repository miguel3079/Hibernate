package util;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Preguntas;
import model.Respuestas;

public class HibernateHelper {
	
	 private SessionFactory sesion;

	 public HibernateHelper(){
	 sesion = SessionFactoryUtil.getSessionFactory();
	 }
	 public void addQuestion(String titulo, String categoria, String imagen,int fidPreguntas){
	 Session session = sesion.openSession();
	 Transaction tx = session.beginTransaction();
	 Preguntas question = new Preguntas(titulo, categoria, imagen, fidPreguntas);
	 session.save(question);
	 tx.commit();
	 session.close();
	 }
	 public void addAnswer(String respuesta, Boolean solucion, Integer idPreguntas){
		 Session session = sesion.openSession();
		 Transaction tx = session.beginTransaction();
		 Respuestas answer = new Respuestas(respuesta, solucion, idPreguntas);
		 session.save(answer);
		 tx.commit();
		 session.close();
		 }	
}

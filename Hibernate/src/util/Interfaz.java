package util;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Interfaz {
	 HibernateHelper hibernateHelper = new HibernateHelper();
	private JFrame frame;
	String titulo ,categoria,  imagen;
	int fidPreguntas;
	String respuesta1, respuesta2, respuesta3, respuesta4;
	Boolean solucion1,solucion2,solucion3,solucion4;
	Integer idPreguntas;
	private JTextField textPregunta;
	private JTextField textCartegoria;
	private JTextField textImagen;
	private JTextField textfindPregunta;
	private JTextField textRespuesta1;
	private JTextField textRespuesta2;
	private JTextField textRespuesta3;
	private JTextField textRespuesta4;
	private JTextField textID;
	JRadioButton rbnRespu1;
	JRadioButton rbnRespu2;
	JRadioButton rbnRespu3;
	JRadioButton rbnRespu4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		HibernateHelper hibernateHelper = new HibernateHelper();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblPregunta = DefaultComponentFactory.getInstance().createLabel("Pregunta:");
		
		textPregunta = new JTextField();
		textPregunta.setColumns(10);
		
		JLabel lblCategoria = DefaultComponentFactory.getInstance().createLabel("Categoria:");
		
		textCartegoria = new JTextField();
		textCartegoria.setColumns(10);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Imagen:");
		
		textImagen = new JTextField();
		textImagen.setColumns(10);
		
		JLabel lblIdpregunta = DefaultComponentFactory.getInstance().createLabel("IdfindPregunta:");
		
		textfindPregunta = new JTextField();
		textfindPregunta.setColumns(10);
		
		JLabel lblRespuesta = DefaultComponentFactory.getInstance().createLabel("Respuesta1:");
		
		textRespuesta1 = new JTextField();
		textRespuesta1.setColumns(10);
		
		JLabel lblRespuesta_1 = DefaultComponentFactory.getInstance().createLabel("Respuesta2:");
		
		textRespuesta2 = new JTextField();
		textRespuesta2.setColumns(10);
		
		JLabel lblRespueta = DefaultComponentFactory.getInstance().createLabel("Respueta3:");
		
		textRespuesta3 = new JTextField();
		textRespuesta3.setColumns(10);
		
		JLabel lblRespuesta_2 = DefaultComponentFactory.getInstance().createLabel("Respuesta4:");
		
		textRespuesta4 = new JTextField();
		textRespuesta4.setColumns(10);
		
		textID = new JTextField();
		textID.setColumns(10);
		
		JLabel lblIdPregunta = DefaultComponentFactory.getInstance().createLabel("ID Pregunta:");
		
		JButton btnEnviarPregunta = new JButton("Enviar Pregunta");
		btnEnviarPregunta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				añadirPregunta();
			}
		});
		
		JLabel lblPreguntaN = DefaultComponentFactory.getInstance().createLabel("Pregunta n\u00BA:");
		
		JLabel labelNumeroPregunta = DefaultComponentFactory.getInstance().createLabel("num");
		
		 rbnRespu1 = new JRadioButton("verdadera");
		
		 rbnRespu2 = new JRadioButton("verdadera");
		
		 rbnRespu3 = new JRadioButton("verdadera");
		
		 rbnRespu4 = new JRadioButton("verdadera");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPregunta)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textPregunta, GroupLayout.PREFERRED_SIZE, 321, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblCategoria)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textCartegoria))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewJgoodiesLabel)
									.addGap(18)
									.addComponent(textImagen))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblIdpregunta)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textfindPregunta))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblRespuesta)
									.addGap(18)
									.addComponent(textRespuesta1))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblRespuesta_1)
										.addComponent(lblRespueta))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textRespuesta3, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
										.addComponent(textRespuesta2)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblRespuesta_2)
									.addGap(18)
									.addComponent(textRespuesta4)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(33)
									.addComponent(labelNumeroPregunta))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblPreguntaN))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(rbnRespu2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbnRespu1)
										.addComponent(rbnRespu3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
										.addComponent(rbnRespu4, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))))
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblIdPregunta)
							.addGap(18)
							.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(195))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(197)
					.addComponent(btnEnviarPregunta)
					.addContainerGap(178, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPregunta)
						.addComponent(textPregunta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPreguntaN))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCategoria)
								.addComponent(textCartegoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewJgoodiesLabel)
								.addComponent(textImagen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblIdpregunta)
								.addComponent(textfindPregunta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(17)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblIdPregunta)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(2)
							.addComponent(labelNumeroPregunta)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRespuesta)
						.addComponent(textRespuesta1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbnRespu1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRespuesta_1)
						.addComponent(textRespuesta2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbnRespu2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRespueta)
						.addComponent(textRespuesta3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbnRespu3))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRespuesta_2)
						.addComponent(textRespuesta4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(rbnRespu4))
					.addGap(18)
					.addComponent(btnEnviarPregunta)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public void añadirPregunta(){
		titulo = textPregunta.getText();
		categoria = textCartegoria.getText();
		imagen = textImagen.getText();
		fidPreguntas = Integer.parseInt(textfindPregunta.getText());
		
		 hibernateHelper.addQuestion(titulo,categoria,imagen,fidPreguntas);
		 
		 //// respuestas
		 
		 respuesta1 = textRespuesta1.getText();
		 respuesta2 = textRespuesta2.getText();
		 respuesta3 = textRespuesta3.getText();
		 respuesta4 = textRespuesta4.getText();
		 
		 solucion1 = rbnRespu1.isSelected();
		 solucion2 = rbnRespu2.isSelected();
		 solucion3 = rbnRespu3.isSelected();
		 solucion4 = rbnRespu4.isSelected();
		 
		 idPreguntas = Integer.parseInt(textID.getText());
		 
		 hibernateHelper.addAnswer(respuesta1, solucion1, idPreguntas);
		 hibernateHelper.addAnswer(respuesta2, solucion2, idPreguntas);
		 hibernateHelper.addAnswer(respuesta3, solucion3, idPreguntas);
		 hibernateHelper.addAnswer(respuesta4, solucion4, idPreguntas);
	}
}

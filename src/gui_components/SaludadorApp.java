package gui_components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaludadorApp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel content_pane;
	private JLabel description;
	private JTextField input_text;
	private JButton button_accept;
	private ActionListener button_action;

	public SaludadorApp() {
		this.setTitle("Saludador");

		this.setBounds(200, 300, 600, 300);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		this.fillFrame();

		this.setVisible(true);

	}

	private void fillFrame() {
		this.content_pane = new JPanel();
		this.content_pane.setLayout(null);
		this.content_pane.setBounds(0, 0, this.getWidth(), this.getHeight());
		this.setContentPane(this.content_pane);

		this.description = new JLabel("Escriba un nombre para saludar");
		// this.description.setBounds(100,50,250,20);
		this.description.setBounds(100, 30, 250, 20);
		this.content_pane.add(this.description);
		this.addInputText();
		this.fillActions();
		this.addConfirmationButton();
	}

	private void addInputText() {
		this.input_text = new JTextField();
		this.input_text.setBounds(100, 80, 200, 20);
		this.content_pane.add(input_text);
	}

	private void addConfirmationButton() {
		this.button_accept = new JButton("Confirmación");
		this.button_accept.setBounds(100, 160, 150, 20);
		this.button_accept.addActionListener(this.button_action);
		this.content_pane.add(this.button_accept);
	}

	private void fillActions() {
		JTextField a_input_text = this.input_text;
		this.button_action = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola " + a_input_text.getText() + "!");

			}
		};
	}
}

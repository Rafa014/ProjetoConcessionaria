package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ViewTelaCliente {

	private JFrame frame;
	private JTextField txtTextnome;
	private JTextField textCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaCliente window = new ViewTelaCliente();
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
	public ViewTelaCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(UIManager.getColor("Button.disabledShadow"));
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(SystemColor.menu);
		txtpnNome.setText("NOME:");
		
		txtTextnome = new JTextField();
		txtTextnome.setBackground(Color.WHITE);
		txtTextnome.setToolTipText("Digite seu nome");
		txtTextnome.setForeground(Color.BLACK);
		txtTextnome.setHorizontalAlignment(SwingConstants.CENTER);
		txtTextnome.setColumns(10);
		
		JTextPane txtpnConcessionaria = new JTextPane();
		txtpnConcessionaria.setEditable(false);
		txtpnConcessionaria.setForeground(Color.BLACK);
		txtpnConcessionaria.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnConcessionaria.setText("\tCONCESSIONARIA R & L");
		txtpnConcessionaria.setBackground(SystemColor.menu);
		
		JTextPane txtpnCadastroDeCliente = new JTextPane();
		txtpnCadastroDeCliente.setEditable(false);
		txtpnCadastroDeCliente.setForeground(Color.BLACK);
		txtpnCadastroDeCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtpnCadastroDeCliente.setText("CADASTRO DE CLIENTE");
		txtpnCadastroDeCliente.setBackground(SystemColor.control);
		
		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnCpf.setEditable(false);
		txtpnCpf.setText("CPF:");
		txtpnCpf.setBackground(SystemColor.menu);
		
		textCpf = new JTextField();
		textCpf.setToolTipText("xxx.xxx.xxx-xx");
		textCpf.setHorizontalAlignment(SwingConstants.CENTER);
		textCpf.setForeground(Color.BLACK);
		textCpf.setColumns(10);
		textCpf.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(14)
									.addComponent(txtpnCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtpnNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtTextnome, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnCadastroDeCliente, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(172)
							.addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(32)
							.addComponent(txtpnConcessionaria, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnConcessionaria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(txtpnCadastroDeCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtpnNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTextnome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(34)
							.addComponent(btnNewButton))
						.addComponent(txtpnCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(55))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public boolean getTxtTextnomeEditable() {
		return txtTextnome.isEditable();
	}
	public void setTxtTextnomeEditable(boolean editable) {
		txtTextnome.setEditable(editable);
	}
}

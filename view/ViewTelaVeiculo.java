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

public class ViewTelaVeiculo {

	private JFrame frame;
	private JTextField txtTextnome;
	private JTextField textCpf;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaVeiculo window = new ViewTelaVeiculo();
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
	public ViewTelaVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("SALVAR");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setForeground(UIManager.getColor("Button.disabledShadow"));
		
		JTextPane txtpnNome = new JTextPane();
		txtpnNome.setText("PLACA");
		txtpnNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnNome.setEditable(false);
		txtpnNome.setBackground(SystemColor.menu);
		
		txtTextnome = new JTextField();
		txtTextnome.setBackground(Color.WHITE);
		txtTextnome.setToolTipText("ex: ABC1D23");
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
		txtpnCadastroDeCliente.setText("CADASTRO DE VEICULO");
		txtpnCadastroDeCliente.setBackground(SystemColor.control);
		
		JTextPane txtpnCpf = new JTextPane();
		txtpnCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnCpf.setEditable(false);
		txtpnCpf.setText("MODELO");
		txtpnCpf.setBackground(SystemColor.menu);
		
		textCpf = new JTextField();
		textCpf.setToolTipText("MODELO");
		textCpf.setHorizontalAlignment(SwingConstants.CENTER);
		textCpf.setForeground(Color.BLACK);
		textCpf.setColumns(10);
		textCpf.setBackground(Color.WHITE);
		
		JTextPane txtpnAno = new JTextPane();
		txtpnAno.setText("ANO");
		txtpnAno.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnAno.setEditable(false);
		txtpnAno.setBackground(SystemColor.menu);
		
		JTextPane txtpnPreo = new JTextPane();
		txtpnPreo.setText("PRE\u00C7O");
		txtpnPreo.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnPreo.setEditable(false);
		txtpnPreo.setBackground(SystemColor.menu);
		
		textField = new JTextField();
		textField.setToolTipText("Ano");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("R$");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.WHITE);
		
		JTextPane txtpnMotor = new JTextPane();
		txtpnMotor.setText("MOTOR");
		txtpnMotor.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtpnMotor.setEditable(false);
		txtpnMotor.setBackground(SystemColor.menu);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnCadastroDeCliente, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtpnCpf, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textCpf))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtpnNome, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtTextnome, GroupLayout.PREFERRED_SIZE, 305, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtpnPreo, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtpnAno, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtpnMotor, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(txtpnConcessionaria, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(175)
							.addComponent(btnNewButton)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(txtpnConcessionaria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtpnCadastroDeCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtTextnome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textCpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnAno, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtpnPreo, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtpnMotor, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addComponent(btnNewButton)
					.addContainerGap())
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public boolean getTxtTextnomeEditable() {
		return txtTextnome.isEditable();
	}
	public void setTxtTextnomeEditable(boolean editable) {
		txtTextnome.setEditable(editable);
	}

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}


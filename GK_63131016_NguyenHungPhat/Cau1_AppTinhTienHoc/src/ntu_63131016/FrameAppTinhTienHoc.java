package ntu_63131016;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameAppTinhTienHoc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public FrameAppTinhTienHoc() {
		setTitle("Tính Tiền Học Phí");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Name = new JLabel("Tên Học Phần");
		Name.setFont(new Font("Arial", Font.BOLD, 16));
		Name.setBounds(10, 80, 109, 34);
		contentPane.add(Name);
		
		JButton add = new JButton("Thêm");
		add.setFont(new Font("Arial", Font.PLAIN, 16));
		add.setBounds(10, 10, 109, 46);
		contentPane.add(add);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Arial", Font.PLAIN, 16));
		txtName.setBounds(129, 81, 277, 34);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bắt Buộc");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxNewCheckBox.setBounds(548, 74, 132, 46);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblSTc = new JLabel("");
		lblSTc.setFont(new Font("Arial", Font.BOLD, 16));
		lblSTc.setBounds(416, 80, 109, 34);
		contentPane.add(lblSTc);
		
		textField = new JTextField();
		textField.setText("a");
		textField.setFont(new Font("Arial", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(474, 81, 63, 34);
		contentPane.add(textField);
		
		JButton Math = new JButton("Tính");
		Math.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Math.setFont(new Font("Arial", Font.PLAIN, 16));
		Math.setBounds(633, 10, 109, 46);
		contentPane.add(Math);
		
		JLabel lblTngTinHc = new JLabel("Tổng Tiền Học Phí");
		lblTngTinHc.setFont(new Font("Arial", Font.BOLD, 16));
		lblTngTinHc.setBounds(13, 469, 161, 46);
		contentPane.add(lblTngTinHc);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(169, 476, 142, 34);
		contentPane.add(textField_1);
		
		JLabel lblTngSTc = new JLabel("Tổng Số TC");
		lblTngSTc.setFont(new Font("Arial", Font.BOLD, 16));
		lblTngSTc.setBounds(321, 475, 109, 34);
		contentPane.add(lblTngSTc);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(416, 476, 63, 34);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1 = new JLabel("Ghi Chú: Tiền Học Phí = Số Tín Chỉ * TienHọc (Nếu là bắt buộc TienHoc = 450 , không bắt buộc TienHoc = 280)");
		lblNewLabel_1.setBounds(10, 413, 515, 46);
		contentPane.add(lblNewLabel_1);
	}
}

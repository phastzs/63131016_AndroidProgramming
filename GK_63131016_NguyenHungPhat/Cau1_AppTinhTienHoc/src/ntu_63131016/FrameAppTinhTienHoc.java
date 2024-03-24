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
	private JTextField textfieldTenHocPhan;
	private JTextField textfieldSoTC;
	private JTextField textfieldTongHocPhi;
	private JTextField textfieldTongSoTC;
	public FrameAppTinhTienHoc() {
		setTitle("Tính Tiền Học Phí");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelTenHocPhan = new JLabel("Tên Học Phần");
		labelTenHocPhan.setFont(new Font("Arial", Font.BOLD, 16));
		labelTenHocPhan.setBounds(10, 80, 109, 34);
		contentPane.add(labelTenHocPhan);
		
		JButton addHocPhan = new JButton("Thêm");
		addHocPhan.setFont(new Font("Arial", Font.PLAIN, 16));
		addHocPhan.setBounds(10, 10, 109, 46);
		contentPane.add(addHocPhan);
		
		textfieldTenHocPhan = new JTextField();
		textfieldTenHocPhan.setFont(new Font("Arial", Font.PLAIN, 16));
		textfieldTenHocPhan.setBounds(129, 81, 277, 34);
		contentPane.add(textfieldTenHocPhan);
		textfieldTenHocPhan.setColumns(10);
		
		JCheckBox checkBatBuoc = new JCheckBox("Bắt Buộc");
		checkBatBuoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkBatBuoc.setBounds(548, 74, 132, 46);
		contentPane.add(checkBatBuoc);
		
		JLabel labelSoTC = new JLabel("SoTC");
		labelSoTC.setFont(new Font("Arial", Font.BOLD, 16));
		labelSoTC.setBounds(416, 80, 57, 34);
		contentPane.add(labelSoTC);
		
		textfieldSoTC = new JTextField();
		textfieldSoTC.setFont(new Font("Arial", Font.PLAIN, 16));
		textfieldSoTC.setColumns(10);
		textfieldSoTC.setBounds(474, 81, 63, 34);
		contentPane.add(textfieldSoTC);
		
		JButton tinhTong = new JButton("Tính");
		tinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		tinhTong.setFont(new Font("Arial", Font.PLAIN, 16));
		tinhTong.setBounds(633, 10, 109, 46);
		contentPane.add(tinhTong);
		
		JLabel labelTongHocPhi = new JLabel("Tổng Tiền Học Phí");
		labelTongHocPhi.setFont(new Font("Arial", Font.BOLD, 16));
		labelTongHocPhi.setBounds(13, 469, 161, 46);
		contentPane.add(labelTongHocPhi);
		
		textfieldTongHocPhi = new JTextField();
		textfieldTongHocPhi.setFont(new Font("Arial", Font.PLAIN, 16));
		textfieldTongHocPhi.setColumns(10);
		textfieldTongHocPhi.setBounds(169, 476, 142, 34);
		contentPane.add(textfieldTongHocPhi);
		
		JLabel labelTongSoTC = new JLabel("Tổng Số TC");
		labelTongSoTC.setFont(new Font("Arial", Font.BOLD, 16));
		labelTongSoTC.setBounds(321, 475, 109, 34);
		contentPane.add(labelTongSoTC);
		
		textfieldTongSoTC = new JTextField();
		textfieldTongSoTC.setFont(new Font("Arial", Font.PLAIN, 16));
		textfieldTongSoTC.setColumns(10);
		textfieldTongSoTC.setBounds(416, 476, 63, 34);
		contentPane.add(textfieldTongSoTC);
		
		JLabel labelGhiChu = new JLabel("Ghi Chú: Tiền Học Phí = Số Tín Chỉ * TienHọc (Nếu là bắt buộc TienHoc = 450 , không bắt buộc TienHoc = 280)");
		labelGhiChu.setBounds(10, 413, 515, 46);
		contentPane.add(labelGhiChu);
	}
}

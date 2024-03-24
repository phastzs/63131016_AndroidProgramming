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
import java.awt.Dimension;
import java.awt.Component;



public class FrameAppTinhTienHoc extends JFrame {
    int newY = 120; // theo doi vi tri dong moi
    private int soThuTuHocPhan = 2; // biến đếm số thứ tự học phần đã được thêm
    private int soluonghptoida = 10;




	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textfieldSoTC;
	private JTextField textfieldTongHocPhi;
	private JTextField textfieldTongSoTC;
	public FrameAppTinhTienHoc() {
	    // biến theo dõi vị trí dòng mơi
		setTitle("Tính Tiền Học Phí");	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 743);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nHocPhan = new JLabel("Học Phần 1");
		nHocPhan.setFont(new Font("Arial", Font.BOLD, 16));
		nHocPhan.setBounds(10, 80, 109, 34);
		contentPane.add(nHocPhan);
		
		JButton addHocPhan = new JButton("Thêm");
		addHocPhan.setFont(new Font("Arial", Font.PLAIN, 16));
		addHocPhan.setBounds(10, 10, 109, 46);
		contentPane.add(addHocPhan);
		//lang nghe xu ly su kien khi nhan nut them
		 addHocPhan.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                if (soThuTuHocPhan <= soluonghptoida) {
	                    JLabel labelHocPhan = new JLabel("Học Phần " + soThuTuHocPhan);
	                    labelHocPhan.setFont(new Font("Arial", Font.BOLD, 16));
	                    labelHocPhan.setBounds(10, newY, 109, 34);
	                    contentPane.add(labelHocPhan);

	                    JLabel labelSoTC = new JLabel("SoTC");
	                    labelSoTC.setFont(new Font("Arial", Font.BOLD, 16));
	                    labelSoTC.setBounds(129, newY, 57, 34);
	                    contentPane.add(labelSoTC);

	                    JTextField textFieldSoTC = new JTextField();
	                    textFieldSoTC.setFont(new Font("Arial", Font.PLAIN, 16));
	                    textFieldSoTC.setColumns(10);
	                    textFieldSoTC.setBounds(179, newY, 63, 34);
	                    contentPane.add(textFieldSoTC);

	                    JCheckBox checkBatBuoc = new JCheckBox("Bắt Buộc");
	                    checkBatBuoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
	                    checkBatBuoc.setBounds(248, newY, 132, 46);
	                    contentPane.add(checkBatBuoc);

	                    newY += 50;
	                    soThuTuHocPhan++;

	                    contentPane.setPreferredSize(new Dimension(contentPane.getWidth(), newY + 200));
	                    contentPane.revalidate();
	                    contentPane.repaint();
	                } else {
	                    // max
	                    System.out.println("Đã đạt đến số lượng học phần tối đa.");
	                }
	            }
	        });

		
		JCheckBox checkBatBuoc = new JCheckBox("Bắt Buộc");
		checkBatBuoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkBatBuoc.setBounds(248, 74, 132, 46);
		contentPane.add(checkBatBuoc);
		
		JLabel labelSoTC = new JLabel("SoTC");
		labelSoTC.setFont(new Font("Arial", Font.BOLD, 16));
		labelSoTC.setBounds(129, 80, 57, 34);
		contentPane.add(labelSoTC);
		
		textfieldSoTC = new JTextField();
		textfieldSoTC.setFont(new Font("Arial", Font.PLAIN, 16));
		textfieldSoTC.setColumns(10);
		textfieldSoTC.setBounds(179, 81, 63, 34);
		contentPane.add(textfieldSoTC);
		
		JButton tinhTong = new JButton("Tính");
		tinhTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int tongSoTC = tinhTongSoTC();
	            int tongTienHocPhi = tinhTongTienHocPhi();

	            // cap nhat 2 gia tri duoc tra ve tu 2 method de gan cho 2 o
	            textfieldTongSoTC.setText(Integer.toString(tongSoTC));
	            textfieldTongHocPhi.setText(Integer.toString(tongTienHocPhi));
	        
			}
		});
		tinhTong.setFont(new Font("Arial", Font.PLAIN, 16));
		tinhTong.setBounds(633, 10, 109, 46);
		contentPane.add(tinhTong);
		
		JLabel labelTongHocPhi = new JLabel("Tổng Tiền Học Phí");
		labelTongHocPhi.setFont(new Font("Arial", Font.BOLD, 16));
		labelTongHocPhi.setBounds(10, 655, 161, 46);
		contentPane.add(labelTongHocPhi);
		
		textfieldTongHocPhi = new JTextField();
		textfieldTongHocPhi.setFont(new Font("Arial", Font.PLAIN, 16));
		textfieldTongHocPhi.setColumns(10);
		textfieldTongHocPhi.setBounds(168, 662, 142, 34);
		contentPane.add(textfieldTongHocPhi);
		
		JLabel labelTongSoTC = new JLabel("Tổng Số TC");
		labelTongSoTC.setFont(new Font("Arial", Font.BOLD, 16));
		labelTongSoTC.setBounds(320, 661, 109, 34);
		contentPane.add(labelTongSoTC);
		
		textfieldTongSoTC = new JTextField();
		textfieldTongSoTC.setFont(new Font("Arial", Font.PLAIN, 16));
		textfieldTongSoTC.setColumns(10);
		textfieldTongSoTC.setBounds(427, 662, 63, 34);
		contentPane.add(textfieldTongSoTC);
		
		JLabel labelGhiChu = new JLabel("Ghi Chú: Tiền Học Phí = Số Tín Chỉ * TienHọc (Nếu là bắt buộc TienHoc = 450 , không bắt buộc TienHoc = 280)");
		labelGhiChu.setBounds(10, 618, 604, 46);
		contentPane.add(labelGhiChu);
	}
	
	// method tinh tong so tc
	private int tinhTongSoTC() {
	    int tongSoTC = 0;

	    // Lặp qua các thành phần của contentPane để tìm các textField chứa số tín chỉ
	    for (Component component : contentPane.getComponents()) {
	        if (component instanceof JTextField) {
	            String text = ((JTextField) component).getText();
	            if (!text.isEmpty()) {
	                int soTC = Integer.parseInt(text);
	                tongSoTC += soTC;
	            }
	        }
	    }

	    return tongSoTC;
	}

	// Phương thức tính tổng số tiền học phí
	private int tinhTongTienHocPhi() {
	    int tongTienHocPhi = 0;

	    // Lặp qua các thành phần của contentPane để tìm các textField và checkBox
	    for (Component component : contentPane.getComponents()) {
	        if (component instanceof JTextField) {
	            String text = ((JTextField) component).getText();
	            if (!text.isEmpty()) {
	                int soTC = Integer.parseInt(text);
	                JCheckBox checkBox = (JCheckBox) component.getParent().getComponent(2); // CheckBox là thành phần thứ 3 trong JPanel
	                int tienHoc = checkBox.isSelected() ? 450 : 280;
	                tongTienHocPhi += soTC * tienHoc;
	            }
	        }
	    }
	    return tongTienHocPhi;
	}
}


package ntu_63131016;

import javax.swing.SwingUtilities;

public class MainAppTinhTienHoc {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameAppTinhTienHoc calculator = new FrameAppTinhTienHoc();
                calculator.setVisible(true);
            }
        });
    }
}

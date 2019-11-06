package otelo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class otelo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otelo window = new otelo();
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
	public otelo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 609, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ActionListener bl = new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				Icon icon = new ImageIcon("D:\\1.jpg");
				JButton thisButton = (JButton)e.getSource();
				thisButton.setIcon(icon);
			}
		};
		JButton button = new JButton("");
		button.addActionListener(bl);
		button.setBounds(23, 23, 49, 39);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(bl);
		button_1.setBounds(82, 23, 49, 39);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(143, 23, 49, 39);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(200, 23, 49, 39);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(259, 23, 49, 39);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(318, 23, 49, 39);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(377, 23, 49, 39);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(436, 23, 49, 39);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(23, 73, 49, 39);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(82, 73, 49, 39);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(143, 73, 49, 39);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(200, 73, 49, 39);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(259, 73, 49, 39);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(318, 73, 49, 39);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(377, 73, 49, 39);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(436, 73, 49, 39);
		frame.getContentPane().add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(23, 123, 49, 39);
		frame.getContentPane().add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(82, 123, 49, 39);
		frame.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(143, 123, 49, 39);
		frame.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBounds(200, 123, 49, 39);
		frame.getContentPane().add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(259, 123, 49, 39);
		frame.getContentPane().add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(318, 123, 49, 39);
		frame.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(377, 123, 49, 39);
		frame.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(436, 123, 49, 39);
		frame.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBounds(23, 273, 49, 39);
		frame.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(23, 223, 49, 39);
		frame.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(23, 173, 49, 39);
		frame.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBounds(82, 173, 49, 39);
		frame.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBounds(82, 223, 49, 39);
		frame.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBounds(82, 273, 49, 39);
		frame.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBounds(143, 273, 49, 39);
		frame.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBounds(143, 223, 49, 39);
		frame.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBounds(143, 173, 49, 39);
		frame.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBounds(200, 173, 49, 39);
		frame.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBounds(200, 223, 49, 39);
		frame.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBounds(200, 273, 49, 39);
		frame.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBounds(259, 273, 49, 39);
		frame.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBounds(259, 223, 49, 39);
		frame.getContentPane().add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBounds(259, 173, 49, 39);
		frame.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBounds(318, 173, 49, 39);
		frame.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBounds(318, 223, 49, 39);
		frame.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBounds(318, 273, 49, 39);
		frame.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setBounds(377, 273, 49, 39);
		frame.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBounds(377, 223, 49, 39);
		frame.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setBounds(377, 173, 49, 39);
		frame.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setBounds(436, 173, 49, 39);
		frame.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setBounds(436, 223, 49, 39);
		frame.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBounds(436, 273, 49, 39);
		frame.getContentPane().add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setBounds(23, 373, 49, 39);
		frame.getContentPane().add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBounds(23, 323, 49, 39);
		frame.getContentPane().add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setBounds(82, 323, 49, 39);
		frame.getContentPane().add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBounds(82, 373, 49, 39);
		frame.getContentPane().add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setBounds(143, 323, 49, 39);
		frame.getContentPane().add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBounds(143, 373, 49, 39);
		frame.getContentPane().add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBounds(200, 323, 49, 39);
		frame.getContentPane().add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBounds(200, 373, 49, 39);
		frame.getContentPane().add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBounds(259, 323, 49, 39);
		frame.getContentPane().add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBounds(259, 373, 49, 39);
		frame.getContentPane().add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setBounds(318, 323, 49, 39);
		frame.getContentPane().add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setBounds(318, 373, 49, 39);
		frame.getContentPane().add(button_59);
		
		JButton button_60 = new JButton("");
		button_60.setBounds(377, 323, 49, 39);
		frame.getContentPane().add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBounds(377, 373, 49, 39);
		frame.getContentPane().add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setBounds(436, 323, 49, 39);
		frame.getContentPane().add(button_62);
		
		JButton button_63 = new JButton("");
		button_63.setBounds(436, 373, 49, 39);
		frame.getContentPane().add(button_63);
	}
}

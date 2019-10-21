import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;

public class projectfuchsiamain {

	private JFrame frmProjectFuchsia;
	private JTextField txtMatchNumber;
	private JTextField textField;
	private JTextField txtPlaced;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					projectfuchsiamain window = new projectfuchsiamain();
					window.frmProjectFuchsia.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public projectfuchsiamain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProjectFuchsia = new JFrame();
		frmProjectFuchsia.setTitle("Project Fuchsia");
		frmProjectFuchsia.setBounds(100, 100, 1920, 1080);
		frmProjectFuchsia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmProjectFuchsia.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel TeleOpTab = new JPanel();
		tabbedPane.addTab("Tele-Op", null, TeleOpTab, null);
		
		JPanel AutonomousPanel = new JPanel();
		tabbedPane.addTab("Anonomous", null, AutonomousPanel, null);
		
		JLabel lblMatchNumber = new JLabel("Match #:");
		lblMatchNumber.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		txtMatchNumber = new JTextField();
		txtMatchNumber.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lblst = new JLabel("1st");
		lblst.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lbl2nd = new JLabel("2nd");
		lbl2nd.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lbl3rd = new JLabel("3rd");
		lbl3rd.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lbl6th = new JLabel("6th");
		lbl6th.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lbl5th = new JLabel("5th");
		lbl5th.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lbl4th = new JLabel("4th");
		lbl4th.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lblSkystone = new JLabel("Skystone");
		lblSkystone.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lblStone = new JLabel("Stone");
		lblStone.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lblNone = new JLabel("None");
		lblNone.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JCheckBox sky1st = new JCheckBox("");
		
		JCheckBox sky2nd = new JCheckBox("");
		
		JCheckBox sky3rd = new JCheckBox("");
		
		JCheckBox sky4th = new JCheckBox("");
		
		JCheckBox sky5th = new JCheckBox("");
		
		JCheckBox sky6th = new JCheckBox("");
		
		JCheckBox stone1st = new JCheckBox("");
		
		JCheckBox stone2nd = new JCheckBox("");
		
		JCheckBox stone3rd = new JCheckBox("");
		
		JCheckBox stone4th = new JCheckBox("");
		
		JCheckBox stone5th = new JCheckBox("");
		
		JCheckBox stone6th = new JCheckBox("");
		
		JCheckBox none1st = new JCheckBox("");
		
		JCheckBox none2nd = new JCheckBox("");
		
		JCheckBox none3rd = new JCheckBox("");
		
		JCheckBox none4th = new JCheckBox("");
		
		JCheckBox none5th = new JCheckBox("");
		
		JCheckBox none6th = new JCheckBox("");
		
		JLabel lblReturned = new JLabel("Returned");
		lblReturned.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		JLabel lblFirstReturnedSkystone = new JLabel("First Returned Skystone");
		lblFirstReturnedSkystone.setFont(new Font("Jokerman", Font.PLAIN, 25));
		
		JLabel lblFoundationRepositioned = new JLabel("Foundation Repositioned");
		lblFoundationRepositioned.setFont(new Font("Jokerman", Font.PLAIN, 25));
		
		JLabel lblPlaced = new JLabel("Placed");
		lblPlaced.setFont(new Font("Jokerman", Font.PLAIN, 35));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		txtPlaced = new JTextField();
		txtPlaced.setColumns(10);
		GroupLayout gl_AutonomousPanel = new GroupLayout(AutonomousPanel);
		gl_AutonomousPanel.setHorizontalGroup(
			gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AutonomousPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_AutonomousPanel.createSequentialGroup()
							.addComponent(lblMatchNumber, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtMatchNumber, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_AutonomousPanel.createSequentialGroup()
							.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPlaced)
								.addComponent(lblReturned)
								.addGroup(gl_AutonomousPanel.createSequentialGroup()
									.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblType)
										.addComponent(lblSkystone)
										.addComponent(lblStone)
										.addComponent(lblNone, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_AutonomousPanel.createSequentialGroup()
											.addGap(18)
											.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_AutonomousPanel.createSequentialGroup()
													.addComponent(sky1st)
													.addGap(57)
													.addComponent(sky2nd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(sky3rd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(sky4th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(sky5th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(sky6th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_AutonomousPanel.createSequentialGroup()
													.addComponent(stone1st, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(stone2nd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(stone3rd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(stone4th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(stone5th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(stone6th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_AutonomousPanel.createSequentialGroup()
													.addComponent(none1st, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(none2nd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(none3rd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(none4th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(none5th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
													.addGap(57)
													.addComponent(none6th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_AutonomousPanel.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblst)
											.addGap(18)
											.addComponent(lbl2nd)
											.addGap(18)
											.addComponent(lbl3rd)
											.addGap(18)
											.addComponent(lbl4th)
											.addGap(18)
											.addComponent(lbl5th, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(lbl6th, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addComponent(lblFoundationRepositioned))
								.addComponent(lblFirstReturnedSkystone))
							.addGap(4)
							.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtPlaced, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(872, Short.MAX_VALUE))
		);
		gl_AutonomousPanel.setVerticalGroup(
			gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_AutonomousPanel.createSequentialGroup()
					.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_AutonomousPanel.createSequentialGroup()
							.addGap(11)
							.addComponent(lblMatchNumber, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_AutonomousPanel.createSequentialGroup()
							.addGap(28)
							.addComponent(txtMatchNumber, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(25)
					.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_AutonomousPanel.createSequentialGroup()
							.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblReturned, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblFirstReturnedSkystone, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblPlaced, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPlaced, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblFoundationRepositioned, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_AutonomousPanel.createSequentialGroup()
							.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_AutonomousPanel.createSequentialGroup()
									.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblst, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbl2nd, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbl4th, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbl3rd, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbl5th, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lbl6th, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.TRAILING)
										.addComponent(sky1st)
										.addComponent(sky2nd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(sky3rd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(sky4th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(sky6th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSkystone, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
								.addComponent(sky5th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(stone1st, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(stone2nd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(stone3rd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(stone4th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(stone5th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
									.addComponent(stone6th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblStone, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_AutonomousPanel.createSequentialGroup()
									.addGap(18)
									.addComponent(lblNone, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_AutonomousPanel.createSequentialGroup()
									.addGap(36)
									.addGroup(gl_AutonomousPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(none1st, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(none2nd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(none3rd, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(none4th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(none5th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
										.addComponent(none6th, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap(734, Short.MAX_VALUE))
		);
		AutonomousPanel.setLayout(gl_AutonomousPanel);
	}
}

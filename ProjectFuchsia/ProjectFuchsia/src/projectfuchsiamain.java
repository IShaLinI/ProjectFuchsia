import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class projectfuchsiamain {

	private JFrame frmProjectFuchsia;

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
		frmProjectFuchsia.setBounds(100, 100, 1024, 786);
		frmProjectFuchsia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frmProjectFuchsia.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel AutonomousTab = new JPanel();
		tabbedPane.addTab("Autonomous", null, AutonomousTab, null);
		
		JPanel TeleOpTab = new JPanel();
		tabbedPane.addTab("Tele-Op", null, TeleOpTab, null);
	}

}

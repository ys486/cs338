	import java.awt.BorderLayout;
	import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.List;
	
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.SwingUtilities;
	
	public class FinalFantasy implements ActionListener {
	
		private JFrame frame1 = new JFrame();
		private List<Charater> roles = new ArrayList<Charater>();
		JPanel namePanel = new JPanel();
		JPanel dataPanel = new JPanel();
		JPanel upperPanel = new JPanel();
	
		public void setRoles(List<Charater> roles) {
			this.roles = roles;
		}
	
		public List<Charater> getRoles() {
			List<Charater> roles = new ArrayList<Charater>();
	
			if (roles.size() == 0) {
				roles.add(new Warrior());
				roles.add(new Thief());
				roles.add(new Monk());
				roles.add(new BlackMage(10));
			}
			return roles;
		}
	
		public List<String> getData() {
			List<String> data = new ArrayList<String>();
	
			if (roles.size() == 0) {
				for (int i = 0; i < 4; i++) {
					data.add("0/0/0");
				}
			}
			return data;
		}
	
		public void showMainFrame() {
			frame1.setTitle("Final Fantasy");
			frame1.setSize(750, 530);
			frame1.setLocation(200, 100);
	
			JPanel bigPanel = new JPanel();
			bigPanel.setLayout(new FlowLayout());
	
			bigPanel.setBackground(Color.BLUE);
	
			JLabel background = new JLabel(new javax.swing.ImageIcon(
					"123.jpg"));
			background.setLayout(new FlowLayout());
			upperPanel.add(background);
			upperPanel.setVisible(false);
	
			JPanel statusPanel = getStatusPanel();
			namePanel = getNamePanel();
			JPanel dataPanel = getDataPanel();
	
			statusPanel.add(namePanel);
			statusPanel.add(dataPanel);
	
			final JButton buttonSelectactor = new JButton("select actor");
			final JButton buttonTurn = new JButton("start turn");
	
			buttonSelectactor.addActionListener(this);
			buttonTurn.addActionListener(new TurnActionPerform(roles,namePanel, dataPanel));
			
			bigPanel.add(statusPanel);
			bigPanel.add(buttonSelectactor);
			bigPanel.add(buttonTurn);
	
			frame1.add(bigPanel, BorderLayout.SOUTH);
			frame1.add(upperPanel, BorderLayout.NORTH);
			frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame1.setVisible(true);
		}
	
		public void actionPerformed(ActionEvent e) {
	
			new SelectActorFrame(namePanel, roles, dataPanel, upperPanel);
	
		}
		
		private JPanel getDataPanel() {
	
			dataPanel.setLayout(new GridLayout(4, 1));
			
			List<String> dataList = this.getData();
			for (int i = 0; i < 4; i++) {
				String data = dataList.get(i);
				JLabel dataLabel = new JLabel(data);
				dataPanel.add(dataLabel);
			}
			return dataPanel;
	
		}
	
		private JPanel getNamePanel() {
	
			namePanel.setLayout(new GridLayout(4, 1));
			List<Charater> roles = this.getRoles();
			for (int i = 0; i < 4; i++) {
				Charater role = roles.get(i);
				String name = role.getName();
				JLabel nameLabel = new JLabel(name);
				namePanel.add(nameLabel);
			}
			return namePanel;
		}
	
		private JPanel getStatusPanel() {
			JPanel statusPanel = new JPanel();
			statusPanel.setLayout(new FlowLayout());
			return statusPanel;
		}
	
		public static void main(String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					FinalFantasy ff = new FinalFantasy();
					ff.showMainFrame();
				}
	
			});
	
		}
	
	}
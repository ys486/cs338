	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.GridLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.ArrayList;
	import java.util.List;
	
	import javax.swing.JButton;
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.JTextField;
	
	public class SelectActorFrame implements ActionListener {
		private List<JCheckBox> checkBoxes;
		private List<JTextField> textFields;
		private List<JLabel> labels;
		private JFrame frame2 = new JFrame();
		private JPanel namePanel = new JPanel();
		private List<Charater> roles;
		JPanel dataPanel = new JPanel();
		private JPanel upperPanel = new JPanel();
	
		public SelectActorFrame(JPanel namePanel, List<Charater> roles,
				JPanel dataPanel, JPanel upperPanel) {
			super();
			this.namePanel = namePanel;
			this.roles = roles;
			this.dataPanel = dataPanel;
			this.upperPanel = upperPanel;
			showPage();
	
		}
	
		public void actionPerformed(ActionEvent e) {
			List<String> names = collectName();
			populateNamePanel(names);
			populateStatus();
			//populateRoles(roles);
			upperPanel.setVisible(true);
			frame2.dispose();
		}
	
		private void populateNamePanel(List<String> names) {
			for (int i = 0; i < 4; i++) {
				JLabel nameLabel = (JLabel) namePanel.getComponent(i);
				String name = names.get(i);
				nameLabel.setText(name);
	
			}
	
		}
	
		private List<String> collectName() {
			List<String> names = new ArrayList<String>();
			for (int i = 0; i < 5; i++) {
				JTextField textField = textFields.get(i);
				JCheckBox checkBox = checkBoxes.get(i);
				JLabel label = labels.get(i);
				if (checkBox.isSelected()) {
					String finalName = textField.getText() + "(" + label.getText()
							+ ")";
					names.add(finalName);
					populateRole(label.getText(),finalName);
				}
			}
	
			return names;
	
		}
	
		private void populateStatus() {
	
			for (int i = 0; i < 4; i++) {
				Charater c = roles.get(i);
				int hp = c.getHp();
				int maxHp = c.getMaxHp();
				int strengh = c.getStrength();
				String data = hp + "/" + maxHp + "/" + strengh;
	
				JLabel statusLabel = (JLabel) dataPanel.getComponent(i);
				statusLabel.setText(data);
			}
		}
	
		private void populateRole(String text,String finalName) {
			if (text.equals("warrior")) {
				Warrior warrior = new Warrior();
				warrior.setName(finalName);
				roles.add(warrior);
				
			} else if (text.equals("Monk")) {
				Monk monk = new Monk();
				monk.setName(finalName);
				roles.add(monk);
				
			} else if (text.equals("BlackMage")) {
				BlackMage bm = new BlackMage(100);
				bm.setName(finalName);
				roles.add(bm);
				
			} else if (text.equals("Thief")) {
				Thief th = new Thief();
				th.setName(finalName);
				roles.add(th);
				
			} else {
				WhiteMage wm = new WhiteMage();
				wm.setName(finalName);
				roles.add(wm);		
			}
	
		}
	
		private void showPage() {
	
			frame2.setTitle("Select Actors");
			frame2.setSize(500, 300);
			frame2.setLocation(750, 400);
	
			JPanel actorPanel = new JPanel(new FlowLayout());
	
			checkBoxes = initializeCheckBoxes();
			textFields = initializeTextFields();
			labels = new ArrayList<JLabel>();
	
			labels.add(new JLabel("warrior"));
			labels.add(new JLabel("Monk"));
			labels.add(new JLabel("BlackMage"));
			labels.add(new JLabel("Thief"));
			labels.add(new JLabel("WhiteMage"));
	
			JPanel bigPanel = new JPanel();
			bigPanel.setLayout(new GridLayout(5, 1));
			for (int i = 0; i < 5; i++) {
				JPanel littlePanel = new JPanel();
				littlePanel.setLayout(new FlowLayout());
				littlePanel.add(checkBoxes.get(i));
				littlePanel.add(textFields.get(i));
				littlePanel.add(labels.get(i));
				bigPanel.add(littlePanel);
			}
	
			JButton button = new JButton(" OK");
	
			button.addActionListener(this);
	
			frame2.add(bigPanel, BorderLayout.NORTH);
			frame2.add(button, BorderLayout.SOUTH);
	
			frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
			frame2.setVisible(true);
	
		}
	
		private static List<JTextField> initializeTextFields() {
			List<JTextField> textFields = new ArrayList<JTextField>();
	
			for (int i = 0; i < 5; i++) {
				textFields.add(new JTextField(13));
	
			}
			return textFields;
	
		}
	
		private static List<JCheckBox> initializeCheckBoxes() {
			List<JCheckBox> checkBoxes = new ArrayList<JCheckBox>();
	
			for (int i = 0; i < 5; i++) {
	
				checkBoxes.add(new JCheckBox());
	
			}
	
			return checkBoxes;
		}
	
	}
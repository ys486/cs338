	import java.awt.BorderLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.util.List;
	
	import javax.swing.JButton;
	import javax.swing.JComboBox;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import javax.swing.JPanel;
	
	
	public class TurnActionPerform implements ActionListener {
		
		
		private JPanel namePanel;
		private List<Charater> roles;
		private JPanel dataPanel;
		
		public TurnActionPerform(List<Charater> roles,JPanel namePanel,JPanel dataPanel){
			this.namePanel = namePanel;
			this.roles = roles;
			this.dataPanel = dataPanel;
			
		}
	
		public void actionPerformed(ActionEvent e) 
		{
			TurnFrame turnFrame = new TurnFrame( roles,namePanel, dataPanel, 0, new Enemy());
		}
	   
		
	}

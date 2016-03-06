	
	import javax.swing.JCheckBox;
	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.JComboBox;
	import javax.swing.JButton;
	import javax.swing.JLabel;
	import javax.swing.JList;
	import java.awt.BorderLayout;
	import java.awt.FlowLayout;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.util.List;
	
	public class TurnFrame implements ActionListener{
	
	    private JPanel namePanel;
		private List<Charater> roles;
		private JPanel dataPanel;
		private JFrame frame3 = new JFrame();
		Enemy enemy= new Enemy();
		
		String[] FightOptions = {"Attack", "Defend", "Magic"
	            ,"items"};
		JComboBox fight = new JComboBox(FightOptions);;
		
		int i = 0;
		
		public TurnFrame(List<Charater> roles,JPanel namePanel,JPanel dataPanel, int i,Enemy enemy)
	    {
	       
	        this.namePanel = namePanel;
			this.roles = roles;
			this.dataPanel = dataPanel;
			this.i = i;
			this.enemy=enemy;
			
	        show();
	    }
	
		private void show() {
			  
			    Charater name = roles.get(i);
			    
				frame3.setTitle("Select Actors");
				frame3.setSize(450, 200);
				frame3.setLocation(800, 500);
		
				JPanel turnPanel = new JPanel(new FlowLayout());
				JPanel fightPanel = new JPanel();
				JLabel nameLabel = new JLabel(name.getName());
				
				turnPanel.add(nameLabel,BorderLayout.WEST);
				
				fight.addActionListener(this);
	
				turnPanel.add(fight,BorderLayout.EAST);
				
				
				frame3.add(fightPanel,BorderLayout.SOUTH);
				
				frame3.add(turnPanel,BorderLayout.NORTH);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
		}
		public void actionPerformed(ActionEvent e) {
			
			JComboBox cb = (JComboBox)e.getSource();
			String st = (String)cb.getSelectedItem();
			System.out.println("\nin action.." + st);
			
			Charater role = roles.get(i);
			performAction(role,st);
			System.out.println("Enemy's HP is " + enemy.getHp());
			populateStatus(role);
			i++;
			frame3.dispose();
			if (i < 4)
			{
				TurnFrame turnFrame = new TurnFrame(roles, namePanel, dataPanel, i,enemy);
			}

		}
	
		private void populateStatus(Charater role) {
			
				int hp = role.getHp();
				int maxHp = role.getMaxHp();
				int strengh = role.getStrength();
				String data = "HP"+hp + "/" + "MHP"+ maxHp + "/" + "MP"+ strengh;
	
				JLabel statusLabel = (JLabel) dataPanel.getComponent(i);
				statusLabel.setText(data);
			
		}
	
		private void performAction(Charater role, String st) {
			if( role instanceof Warrior){
				if( st.equals("Attack")){
					((Warrior)role).commonAttacked();
					enemy.enemyAttacked();
				}
				else if( st.equals("Defend")){
					((Warrior)role).defend();
				}
				else if( st.equals("Magic")){
					((Warrior)role).warriorAttack();
					enemy.MagicAttacked();
				}
				else {
					((Warrior)role).items();
				}
				
			}
			if( role instanceof Monk){
				if( st.equals("Attack")){
					((Monk)role).commonAttacked();
					enemy.enemyAttacked();
				}
				else if( st.equals("Defend")){
					((Monk)role).defend();
				}
				else if( st.equals("Magic")){
					((Monk)role).MonkAttack();
					enemy.MagicAttacked();
				}
				else {
					((Monk)role).items();
				}
				
			}
			if( role instanceof Thief){
				if( st.equals("Attack")){
					((Thief)role).commonAttacked();
					enemy.enemyAttacked();
				}
				else if( st.equals("Defend")){
					((Thief)role).defend();
				}
				else if( st.equals("Magic")){
					((Thief)role).thiefAttack();
					enemy.MagicAttacked();
				}
				else {
					((Thief)role).items();
				}
				
			}
			if( role instanceof BlackMage){
				if( st.equals("Attack")){
					((BlackMage)role).commonAttacked();
					enemy.enemyAttacked();
				}
				else if( st.equals("Defend")){
					((BlackMage)role).defend();
				}
				else if( st.equals("Magic")){
					((BlackMage)role).spellAttack();
					enemy.MagicAttacked();
				}
				else {
					((BlackMage)role).items();
				}
				
			}
			if( role instanceof WhiteMage){
				if( st.equals("Attack")){
					((WhiteMage)role).commonAttacked();
					enemy.enemyAttacked();
				}
				else if( st.equals("Defend")){
					((WhiteMage)role).defend();
				}
				else if( st.equals("Magic")){
					((WhiteMage)role).SpellAttack();
					enemy.MagicAttacked();
				}
				else {
					((WhiteMage)role).items();
				}
				
			}
			
		}
	
	
	}
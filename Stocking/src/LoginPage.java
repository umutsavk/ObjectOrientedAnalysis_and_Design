
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginPage {

	private JFrame frmLogIn;
	private JTextField txtUserName;
	private JPasswordField passwordField;
    private JButton btnLogIn;
	
	public static void main(String[] args) {
		
		//Log in User Name: user
		//Log in Password: user		
		//Administration Log in User Name: admin
		//Administration Log in Password: admin
		
		
		
		
		
		//SAMPLE EMPLOYEES
		
		Management.getManagement().getAdmin().employeeAdd("Ahmet Yýlmaz", 1653);
		Management.getManagement().getAdmin().employeeAdd("Eda Sarý", 2010);
		Management.getManagement().getAdmin().employeeAdd("Ayþe Güler", 2030);
		Management.getManagement().getAdmin().employeeAdd("Hüseyin Erdoðan", 1653);
		Management.getManagement().getAdmin().employeeAdd("Umut Þavk", 1700);
		Management.getManagement().getAdmin().employeeAdd("Deniz Albayrak", 1900);	
		
		//SAMPLE PRODUCTS
		
		Food pd=new Food("banana",50,5,15);
		Food pd2=new Food("cake",30,20,38);
		Food pd3=new Food("cookie",100,3,7);
		Food pd4=new Food("chocolate",60,12,15);
		Food pd5=new Food("hamburger",77,20,32);
		Management.getManagement().getAdmin().addNewProduct(pd, "Food");
		Management.getManagement().getAdmin().addNewProduct(pd2, "Food");
		Management.getManagement().getAdmin().addNewProduct(pd3, "Food");
		Management.getManagement().getAdmin().addNewProduct(pd4, "Food");
		Management.getManagement().getAdmin().addNewProduct(pd5, "Food");
		
		Drink bd4=new Drink("coke",120,5,7.5);
		Drink bd2=new Drink("coffee",100,10,15);
		Drink bd3=new Drink("ice tea",60,5,10);
		Drink bd5=new Drink("energy erink",90,10,20);
		Drink bd6=new Drink("lemonade",90,10,20);
		Management.getManagement().getAdmin().addNewProduct(bd4, "Drink");
		Management.getManagement().getAdmin().addNewProduct(bd2, "Drink");
		Management.getManagement().getAdmin().addNewProduct(bd3, "Drink");
		Management.getManagement().getAdmin().addNewProduct(bd5, "Drink");
		Management.getManagement().getAdmin().addNewProduct(bd6, "Drink");
		
		Other od4=new Other("detergent",3,20,20);
		Other od2=new Other("oil",30,50,50);
		Management.getManagement().getAdmin().addNewProduct(od4, "Other");
		Management.getManagement().getAdmin().addNewProduct(od2, "Other");
				
		//SAMPLE INCOME DATA
		
		Management.getManagement().getAdmin().getDailyIncome().put("11-05-2020", (double) 1302);
		Management.getManagement().getAdmin().getDailyIncome().put("12-05-2020", (double) 2300);
		Management.getManagement().getAdmin().getDailyIncome().put("13-05-2020", (double) 2512);
		Management.getManagement().getAdmin().getDailyIncome().put("14-05-2020", (double) 5322);
		Management.getManagement().getAdmin().getDailyIncome().put("15-05-2020", (double) 5300);
		Management.getManagement().getAdmin().getDailyIncome().put("16-05-2020", (double) 2500);
		Management.getManagement().getAdmin().getDailyIncome().put("17-05-2020", (double) 2100);
		Management.getManagement().getAdmin().getDailyIncome().put("18-05-2020", (double) 5021);
		Management.getManagement().getAdmin().getDailyIncome().put("19-05-2020", (double) 1562);
		Management.getManagement().getAdmin().getDailyIncome().put("20-05-2020", (double) 6632);
		Management.getManagement().getAdmin().getDailyIncome().put("21-05-2020", (double) 2325);
		Management.getManagement().getAdmin().getDailyIncome().put("22-05-2020", (double) 5327);
		Management.getManagement().getAdmin().getDailyIncome().put("23-05-2020", (double) 2347);
		Management.getManagement().getAdmin().getDailyIncome().put("24-05-2020", (double) 5856);
		Management.getManagement().getAdmin().getDailyIncome().put("25-05-2020", (double) 1278);
		Management.getManagement().getAdmin().getDailyIncome().put("26-05-2020", (double) 8853);	
		
		//SAMPLE EXPENSE DATA
			
		Management.getManagement().getAdmin().getDailyExpense().put("11-05-2020", (double) 1302);
		Management.getManagement().getAdmin().getDailyExpense().put("12-05-2020", (double) 252);
		Management.getManagement().getAdmin().getDailyExpense().put("13-05-2020", (double) 215);
		Management.getManagement().getAdmin().getDailyExpense().put("15-05-2020", (double) 520);
		Management.getManagement().getAdmin().getDailyExpense().put("16-05-2020", (double) 256);
		Management.getManagement().getAdmin().getDailyExpense().put("17-05-2020", (double) 2120);
		Management.getManagement().getAdmin().getDailyExpense().put("21-05-2020", (double) 2125);
		Management.getManagement().getAdmin().getDailyExpense().put("24-05-2020", (double) 526);
		Management.getManagement().getAdmin().getDailyExpense().put("25-05-2020", (double) 218);

		

		
		
		
		
		
		
		
		
		

		EventQueue.invokeLater(new Runnable() { //invokeAndWait
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLogIn.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//OPENING PAGE OF PROGRAM
	
	public LoginPage() 
	{
		frmLogIn = new JFrame();
		frmLogIn.getContentPane().setBackground(new Color(255, 255, 102));
		frmLogIn.setTitle("Log in");
		frmLogIn.setBounds(100, 100, 316, 196);
		frmLogIn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogIn.getContentPane().setLayout(null); //retrieves the content pane layer 
		
		JLabel lblUserName = new JLabel("Username: ");
		lblUserName.setBounds(55, 31, 78, 14);
		frmLogIn.getContentPane().add(lblUserName);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(143, 28, 86, 20);
		txtUserName.setColumns(10);
		frmLogIn.getContentPane().add(txtUserName);
		
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(55, 65, 78, 14);
		frmLogIn.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(143, 59, 86, 20);
		frmLogIn.getContentPane().add(passwordField);
		
		btnLogIn = new JButton("Log in");
		btnLogIn.addActionListener(new ActionListener()  //create an instance of the listener
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				if(txtUserName.getText().equals("user") &&
						passwordField.getText().equals("user"))
				{
					MenuPage mp = new MenuPage();
					mp.getFrame().setVisible(true);
					frmLogIn.setVisible(false);
				}
				else
				{
					txtUserName.setText("");
					passwordField.setText("");
					JOptionPane.showMessageDialog(frmLogIn, "Wrong password or user name. \n Default username: user \n Default password: user");

				}
			}
		});
		btnLogIn.setBounds(140, 105, 89, 23);
		frmLogIn.getContentPane().add(btnLogIn);
		
		
	}


}

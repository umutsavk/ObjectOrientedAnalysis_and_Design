import java.util.ArrayList;
import java.util.HashMap;
public class Management {

	private HashMap<Integer, Table> Tables;
	private Admin admin ;
	private static Management mng;

	private Management(int tableNumber) {
		this.Tables = new HashMap<Integer, Table>();
		for (int i = 1; i <= tableNumber; i++) {
			Table tb = new Table(i);
			Tables.put(i, tb);
		}		
		this.admin = new Admin();

	}

	public static Management getManagement() {
		if (mng == null) {
			 mng = new Management(10);
		}
		return mng;
	}
	
	public HashMap<Integer, Table> getTables() {
		return Tables;
	}

	public void setTables(HashMap<Integer, Table> tables) {
		Tables = tables;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public void addOrder(int tableNumber, Product product, int numberOfOrder) {
		if (product.getNumberOfProduct()<numberOfOrder) {
			
		}
		else {
			this.Tables.get(tableNumber).getOrderList().add(product.getProductName());
			this.Tables.get(tableNumber).increaseTotalBill(product.getUnitSalePrice());
			admin.stockDelete(product.getProductName(), product.getProductType(), numberOfOrder);
			admin.incomeUpdate(numberOfOrder*product.getUnitSalePrice());
		}
	}
	
	public void closeDownOrder(int tableNumber) {

		this.Tables.get(tableNumber).getOrderList().toString();
		this.Tables.get(tableNumber).getTotalBill();
		
		
		this.Tables.get(tableNumber).TableReset();
		
	}
	

	public ArrayList<Employee> employeeShift(int dailyEmployeeNumber) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		for (int i = 0; i < dailyEmployeeNumber; i++) {
			temp.add(admin.getEmployees().remove());
		}
		for (int i = 0; i < temp.size(); i++) {
			admin.getEmployees().add((Employee) temp.get(i));
		}
		return temp;
	}

	}

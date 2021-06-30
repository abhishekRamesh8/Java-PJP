import java.util.*;
public class Tm11 {
	public static String[] dearanceAllowance(char code) {
		String[] da = new String[2];
		switch (code) {
		case 'e':
			da[0] = "Engineer";
			da[1] = "20000";
			break;
		case 'c':
			da[0] = "Consultant";
			da[1] = "32000";
			break;
		case 'k':
			da[0] = "Clerk";
			da[1] = "12000";
			break;
		case 'r':
			da[0] = "Receptionist";
			da[1] = "15000";
			break;
		case 'm':
			da[0] = "Manager";
			da[1] = "40000";
			break;
		default:
			da[0] = "test";
			break;
		}
		return da;
		
	}

	public static void main(String[] args) {
		int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
		String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013","16/07/2005", "1/1/2000", "12/06/2006"};
		char[] designationCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
		String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
		int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
		int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
		int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

		
		Scanner sc = new Scanner(System.in);
		if (args.length != 0) {
			
			int empId = Integer.parseInt(args[0]);
			for(int i=0; i<7; i++) {
				if (empId == empNo[i]) {
					String name = empName[i];
					String dept = department[i];
					char code = designationCode[i];
					System.out.println("Emp No.\t Emp Name\t Department\t Designation\t Salary");
					int da = Integer.parseInt(dearanceAllowance(code)[1]);
					int salary = basic [i] + hra[i] + da - it[i];
					System.out.printf("%d\t %s\t \t %s\t\t %s\t\t %d", empId, name, dept, dearanceAllowance(code)[0], salary);
					break;
				
				}else {
					if (i == 7-1) System.out.printf("There is no employee with empid: %d", empId);
				}
			}
		
		
	}else {
		System.out.println("Enter an employee ID.");
	}
		sc.close();

}}

import java.util.*;

public class employeeInfo {

    public static void main(String[] args) {
        int[] empNo = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Kylie", "Zayn", "Lisa", "Salman", "kendal", "Alia", "Tanmay"};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        String[] designationCode = {"e", "c", "k", "r", "m", "e", "c"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == empId) {
                String designation = getDesignation(designationCode[i]);
                int da = getDA(designationCode[i]);
                int salary = basic[i] + hra[i] + da - it[i];

                System.out.println("Emp No.: " + empNo[i]);
                System.out.println("Emp Name: " + empName[i]);
                System.out.println("Department: " + department[i]);
                System.out.println("Designation: " + designation);
                System.out.println("Salary: " + salary);
                
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid: " + empId);
        }
    }

    public static String getDesignation(String code) {
        switch (code) {
            case "e":
                return "Engineer";
            case "c":
                return "Consultant";
            case "k":
                return "Clerk";
            case "r":
                return "Receptionist";
            case "m":
                return "Manager";
            default:
                return "Unknown";
        }
    }

    public static int getDA(String code) {
        switch (code) {
            case "e":
                return 20000;
            case "c":
                return 32000;
            case "k":
                return 12000;
            case "r":
                return 15000;
            case "m":
                return 40000;
            default:
                return 0;
        }
    }
}

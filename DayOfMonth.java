import java.util.Scanner;

public class DayOfMonth {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(String month, int year) {
        month = month.toLowerCase();  

        switch (month) {
            case "january":
            case "jan.":
            case "jan":
            case "1":
                return 31;
            case "february":
            case "feb.":
            case "feb":
            case "2":
                if (isLeapYear(year) == true) {
                	return 29;
                }
                else {
                	return 28;
                }
            case "march":
            case "mar.":
            case "mar":
            case "3":
                return 31;
            case "april":
            case "apr.":
            case "apr":
            case "4":
                return 30;
            case "may":
            case "5":
                return 31;
            case "june":
            case "jun":
            case "6":
                return 30;
            case "july":
            case "jul":
            case "7":
                return 31;
            case "august":
            case "aug.":
            case "aug":
            case "8":
                return 31;
            case "september":
            case "sept.":
            case "sep":
            case "9":
                return 30;
            case "october":
            case "oct.":
            case "oct":
            case "10":
                return 31;
            case "november":
            case "nov.":
            case "nov":
            case "11":
                return 30;
            case "december":
            case "dec.":
            case "dec":
            case "12":
                return 31;
            default:
                return -1; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap thang: ");
            String month = sc.nextLine();
            System.out.println("Nhap nam: ");
            int year = sc.nextInt();
            int day = getDaysInMonth(month, year);
            if (day == -1 || year < 1000) {
            	sc.nextLine();
            	continue;
            }
            else {
            	System.out.println(day);
            	break;
            }
        }
    }
}

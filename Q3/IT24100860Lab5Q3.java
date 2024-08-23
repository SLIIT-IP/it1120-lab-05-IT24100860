import java.util.Scanner;

public class IT24100860Lab5Q3 {
    public static void main(String[] args) {
        final int ROOM_CHARGE_PER_DAY = 48000;
        final int DISCOUNT_RATE_3_4_DAYS = 10;
        final int DISCOUNT_RATE_5_OR_MORE_DAYS = 20;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = scanner.nextInt();

        System.out.print("Enter End Date (1-31): ");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int daysReserved = endDate - startDate;
        int totalCharge = ROOM_CHARGE_PER_DAY * daysReserved;

        int discount = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = (totalCharge * DISCOUNT_RATE_3_4_DAYS) / 100;
        } else if (daysReserved >= 5) {
            discount = (totalCharge * DISCOUNT_RATE_5_OR_MORE_DAYS) / 100;
        }

        int totalAmount = totalCharge - discount;

        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY);
        System.out.println("No of Days Reserved: " + daysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}
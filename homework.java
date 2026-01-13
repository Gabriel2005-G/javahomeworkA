// public class MonthDaysSwitch {
//     public static void main(String[] args) {

//         if (args.length == 0) {
//             System.out.println("month number");
//             System.exit(1);
//         }

//         int month = Integer.parseInt(args[0]);

//         if (month < 1 || month > 12) {
//             System.out.println("Invalid number");
//             System.exit(1);
//         }

//         int days;

//         switch (month) {
//             case 1: case 3: case 5: case 7:
//             case 8: case 10: case 12:
//                 days = 31;
//                 break;
//             case 4: case 6: case 9: case 11:
//                 days = 30;
//                 break;
//             case 2:
//                 days = 28; 
//                 break;
//             default:
//                 days = 0; 
//         }

//         System.out.println("Days: " + days);
//     }
// }

// public class MonthDaysArray {
//     public static void main(String[] args) {

//         if (args.length == 0) {
//             System.out.println("month number");
//             System.exit(1);
//         }

//         int month = Integer.parseInt(args[0]);

//         if (month < 1 || month > 12) {
//             System.out.println("Invalidnumber");
//             System.exit(1);
//         }

//         int[] daysInMonth = {
//             31, 28, 31, 30, 31, 30,
//             31, 31, 30, 31, 30, 31
//         };

//         System.out.println("Days: " + daysInMonth[month - 1]);
//     }
// }
// import java.util.Scanner;

// public class TicketPrice {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter age: ");
//         int age = sc.nextInt();

//         System.out.print("Enter seat category (1, 2, 3): ");
//         int category = sc.nextInt();

//         int price;

//         switch (category) {
//             case 1: price = 12000; break;
//             case 2: price = 8000; break;
//             case 3: price = 7000; break;
//             default:
//                 System.out.println("Invalid seat category");
//                 return;
//         }

//         double finalPrice = price;

//         if (age >= 65) {
//             finalPrice = price * 0.8;
//         }

//         System.out.println("Age: " + age);
//         System.out.println("Original price: " + price);
//         System.out.println("Final price: " + finalPrice);
//     }
// }

public class TransportDiscount {
    public static void main(String[] args) {

        // Check argument count
        if (args.length != 2) {
            System.out.println("Usage: java TransportDiscount <age> <children_count>");
            System.exit(1);
        }

        int age = Integer.parseInt(args[0]);
        int children = Integer.parseInt(args[1]);

        double originalPrice = 1000;
        int discountPercent = 0;
        
        if (age < 18 || age > 65) {
            discountPercent = 20;
        } else {
            switch (children) {
                case 3 -> discountPercent = 15;
                case 4 -> discountPercent = 25;
                case 5 -> discountPercent = 35;
                default -> {
                    if (children > 5) {
                        discountPercent = 50;
                    }
                }
            }
        }

        double discountAmount = originalPrice * discountPercent / 100.0;
        double finalPrice = originalPrice - discountAmount;

        System.out.println("Original price: " + originalPrice);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Final price: " + finalPrice);
    }
}

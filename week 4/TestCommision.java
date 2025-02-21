import java.util.*;

class Commission {

    private double sale, commission;

    Commission(double sale) {
        this.sale = sale;
    }

    public double calculateCommission() {
        if (sale < 500) {
            commission = 0.02 * sale;
        } else if (sale >= 500 && sale < 5000) {
            commission = 0.05 * sale;
        } else if (sale >= 5000) {
            commission = 0.08 * sale;
        }
        return commission;
    }
}

public class TestCommision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sale amount : ");
        double sale = sc.nextDouble();
        if (sale < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission c = new Commission(sale);
            double commission = c.calculateCommission();
            System.out.println("Commission = " + commission);
        }
        sc.close();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // task 1

        int desiredSum = 2_459_000;
        int sum = 0;
        int amount = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < desiredSum) {
            sum += amount;
            sum = (int)(sum * (1 + percent));
            month++;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей.");

        // task 2

        int number = 0;
        while (number < 10){
            number+=1;
            System.out.print(number + " ");
        }
        System.out.println();
        int i = 11;
        for (;i > 1;){
            i-=1;
            System.out.print(i + " ");
        }
        System.out.println();

        // task 3

        int y = 12_000_000;
        int year = 2024;
        int dye = 8;
        int live = 17;
        while (year < 2034){
            y += y * live / 1000 - y * dye / 1000;
            year = year + 1;
            System.out.println("Год " + year + ", численность населения составляет " + y);
        }

        // task 4

        int bunkAccount = 15_000;
        int monthSum = 0;
        while(bunkAccount < 12_000_000){
            bunkAccount += (bunkAccount / 100) * 7;
            monthSum++;
            System.out.println("Месяц " + monthSum + " всего накоплений: " + bunkAccount);
        }

        // task 5

        bunkAccount = 15_000;
        monthSum = 0;
        while(bunkAccount < 12_000_000){
            bunkAccount += (bunkAccount / 100) * 7;
            monthSum++;
            if (monthSum % 6 == 0){
                System.out.println("Месяц " + monthSum + " всего накоплений: " + bunkAccount);
            }
        }

        // task 6

        bunkAccount = 15_000;
        monthSum = 0;
        int yearNine = 12 * 9;
        while(monthSum < yearNine){
            bunkAccount += (bunkAccount / 100) * 7;
            monthSum++;
            if (monthSum % 6 == 0) {
                System.out.println("Месяц " + monthSum + " всего накоплений: " + bunkAccount);
            }
        }

        // task 7

        int friday = 3;
        for (int day = friday; day <= 31 ; day+=7){
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }

        // task 8

        int pastYear = 1825;
        int futureYear = 2125;
        for (year = 0 ; year <= futureYear ; year+=79){
            if (year >= pastYear){
                System.out.println(year);
            }
        }
    }
}
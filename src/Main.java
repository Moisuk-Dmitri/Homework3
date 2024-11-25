public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int intType = 234;
        byte byteType = 60;
        short shortType = 1234;
        long longType = 121234L;
        float floatType = 6234f;
        double doubleType = 32234;

        System.out.printf("Значение переменной intType с типом int равно %s\n", intType);
        System.out.printf("Значение переменной byteType с типом byte равно %s\n", byteType);
        System.out.printf("Значение переменной shortType с типом short равно %s\n", shortType);
        System.out.printf("Значение переменной longType с типом long равно %s\n", longType);
        System.out.printf("Значение переменной floatType с типом float равно %s\n", floatType);
        System.out.printf("Значение переменной doubleType с типом double равно %s\n", doubleType);

        System.out.println("\nTask 2");

        float var1 = 27.12f;
        long var2 = 987_678_965_549L;
        float var3 = 2.786f;
        short var4 = 569;
        short var5 = -159;
        short var6 = 27897;
        byte var7 = 67;

        System.out.printf("var1 = %s\n", var1);
        System.out.printf("var2 = %s\n", var2);
        System.out.printf("var3 = %s\n", var3);
        System.out.printf("var4 = %s\n", var4);
        System.out.printf("var5 = %s\n", var5);
        System.out.printf("var6 = %s\n", var6);
        System.out.printf("var7 = %s\n", var7);

        System.out.println("\nTask 3");

        int firstClass = 23;
        int secondClass = 27;
        int thirdClass = 30;

        int sheetsPerStudent = 480 / (firstClass + secondClass + thirdClass);

        System.out.printf("На каждого ученика рассчитано %s листов бумаги\n", sheetsPerStudent);

        System.out.println("\nTask 4");

        int bottlesPerMinute = 16 / 2;

        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPerThreeDays = bottlesPerMinute * 60 * 24 * 3;
        int bottlesPerMonth = bottlesPerMinute * 60 * 24 * 30;

        System.out.printf("За 20 минут машина произвела %s штук бутылок\n", bottlesPerTwentyMinutes);
        System.out.printf("За день машина произвела %s штук бутылок\n", bottlesPerDay);
        System.out.printf("За 3 дня машина произвела %s штук бутылок\n", bottlesPerThreeDays);
        System.out.printf("За месяц машина произвела %s штук бутылок\n", bottlesPerMonth);

        System.out.println("\nTask 5");

        int whiteCansPerRoom = 2;
        int brownCansPerRoom = 4;

        int numberOfRooms = 120 / (whiteCansPerRoom + brownCansPerRoom);
        int numberOfWhiteCans = numberOfRooms * whiteCansPerRoom;
        int numberOfBrownCans = numberOfRooms * brownCansPerRoom;

        System.out.printf("В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски\n", numberOfRooms, numberOfWhiteCans, numberOfBrownCans);

        System.out.println("\nTask 6");

        double weightOfBananas = 5 * 80;
        double weightOfMilk = (double)200 / 100 * 105;
        double weightOfIceCream = 2 * 100;
        double weightOfEggs = 4 * 70;
        double totalWeightGrams = weightOfBananas + weightOfMilk + weightOfIceCream + weightOfEggs;
        double totalWeightKilos = totalWeightGrams / 1000;

        System.out.printf("Обзая масса завтрака %s грамм (%s килограмм)\n", totalWeightGrams, totalWeightKilos);

        System.out.println("\nTask 7");

        int targetWeightLoss = 7000;
        int firstDiet = 250;
        int secondDiet = 500;

        int daysFirstDiet = targetWeightLoss / firstDiet;
        int daysSecondDiet = targetWeightLoss / secondDiet;
        double averageDays = ((double)daysFirstDiet + daysSecondDiet) / 2;

        System.out.printf("Дней на похудение при первой диете - %s, при второй диете - %s, в среднем - %s\n", daysFirstDiet, daysSecondDiet, averageDays);

        System.out.println("\nTask 8");

        int mashaOldSalary = 67760;
        double mashaNewSalary = ((double)mashaOldSalary / 10) + mashaOldSalary;
        double mashaDiffSalaryPerYear = mashaNewSalary * 12 - mashaOldSalary * 12;

        int denisOldSalary = 83690;
        double denisNewSalary = ((double)denisOldSalary / 10) + denisOldSalary;
        double denisDiffSalaryPerYear = denisNewSalary * 12 - denisOldSalary * 12;

        int kristinaOldSalary = 76230;
        double kristinaNewSalary = ((double)kristinaOldSalary / 10) + kristinaOldSalary;
        double kristinaDiffSalaryPerYear = kristinaNewSalary * 12 - kristinaOldSalary * 12;

        System.out.printf("Маша теперь получает %s рублей. Годовой доход вырос на %s рублей\n", mashaNewSalary, mashaDiffSalaryPerYear);
        System.out.printf("Денис теперь получает %s рублей. Годовой доход вырос на %s рублей\n", denisNewSalary, denisDiffSalaryPerYear);
        System.out.printf("Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей\n", kristinaNewSalary, kristinaDiffSalaryPerYear);
    }
}

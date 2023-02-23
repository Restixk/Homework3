public class Main {
    public static void main(String[] args) {
        byte byteVariable = 1;
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        short shortVariable = 1000 ;
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        int intVariable = 10000 ;
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        long longVariable = 10000000;
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        float floatVariable = 1f;
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        double doubleVariable = 1.2;
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);
        float meaningDouble = 27.12f ; // пишет ошибку "integer number to large" long longMeaning  = 987678965549 ;
        double meaningFloat = 2.786;
        short meaningShort = 569 ;
        long meaningLong = -159 ;
        int meaningInt = 27897;
        byte meaningByte = 67 ;
        byte studentsLudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short sheetPaper = 480;
        int sheetPaperStudents = sheetPaper / (studentsLudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna);
        System.out.println("На каждого ученика " + sheetPaperStudents + " листов бумаги.");
        byte machinePerformance2Min = 16;
        int machinePerformance1Min = machinePerformance2Min / 2;
        int machinePerformance20Min = machinePerformance1Min * 20;
        System.out.println("За 20 минут машина произвела" + machinePerformance20Min + " штук бутылок");
        int machinePerformance1Day = 24 * 60 * machinePerformance1Min;
        System.out.println("За 1 сутки  машина произвела" + machinePerformance1Day + " штук бутылок");
        int machinePerformance3Day = machinePerformance1Day * 3 ;
        System.out.println("За 3 дня  машина произвела" + machinePerformance3Day + " штук бутылок");
        int machinePerformance30Day = machinePerformance1Day * 30;
        System.out.println("За 1 месяц  машина произвела" + machinePerformance30Day + " штук бутылок");
        byte potPaintGeneral = 120;
        byte potPaintWhite1Class = 2;
        byte potPaintGrey1Class = 4;
        int potPaint1Class = potPaintGrey1Class + potPaintWhite1Class;
        int sumClass = potPaintGeneral / potPaint1Class;
        int potPaintWhiteGeneral = potPaintWhite1Class * sumClass;
        int potPaintGreyGeneral = potPaintGrey1Class * sumClass;
        System.out.println("В школе, где " + sumClass + " классов, нужно "
                + potPaintWhiteGeneral + " банок белой краски и " + potPaintGreyGeneral + " банок коричневой краски");
        byte weightBanana = 80;
        byte countBanana = 5;
        byte weightMilk = 105;
        byte countMilk = 2;
        byte weightIceCream = 100;
        byte countIceCram = 2;
        byte weightEgg = 70;
        byte countEgg = 4;
        int weightTotalGrams = countEgg * weightEgg + countBanana * weightBanana + countMilk * weightMilk + countIceCram * weightIceCream ;
        float weightTotalKg = weightTotalGrams / 1000;
        System.out.println("Вес в граммах " + weightTotalGrams + " грамм. Вес в килограммах " + weightTotalKg + " килограмм");
        int loseWheightTotal = 7 * 1000;
        short loseWheight250 = 250;
        short loseWheight500 = 500;
        int dayLoseWheight250 = loseWheightTotal / loseWheight250;
        int dayLoseWheight500 = loseWheightTotal / loseWheight500;
        float dayLoseWheightMedium = (dayLoseWheight250 + dayLoseWheight500 ) / 2;
        System.out.println("Дней при потери по 250 грамм " + dayLoseWheight250 + ", дней при потери по 500 " +
                dayLoseWheight500 + ", дней среднее " + dayLoseWheightMedium );
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha * 1.1;
        double newSalaryDenis = salaryDenis * 1.1;
        double newSalaryKristina = salaryKristina * 1.1;
        double newSalaryYearsMasha = (newSalaryMasha - salaryMasha) * 12;
        double newSalaryYearsDenis = (newSalaryDenis - salaryDenis) * 12;
        double newSalaryYearsKristina = (newSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на "
        + newSalaryYearsMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis+ " рублей. Годовой доход вырос на "
                + newSalaryYearsDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на "
                + newSalaryYearsKristina + " рублей");









    }
}
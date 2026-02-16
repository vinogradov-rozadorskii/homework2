//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int intValue = 10;
        byte byteValue = 2;
        short shortValue = 300;
        long longValue = 100000L;
        float floatValue = 3.14f;
        double doubleValue = 2.71828;

        System.out.println("Значение переменной intValue с типом int равно " + intValue);
        System.out.println("Значение переменной byteValue с типом byte равно " + byteValue);
        System.out.println("Значение переменной shortValue с типом short равно " + shortValue);
        System.out.println("Значение переменной longValue с типом long равно " + longValue);
        System.out.println("Значение переменной floatValue с типом float равно " + floatValue);
        System.out.println("Значение переменной doubleValue с типом double равно " + doubleValue);
        System.out.println("________");

        System.out.println("Задача 2");
        float value1 = 27.12f;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        short value4 = 569;
        short value5 = -159;
        short value6 = 27897;
        byte value7 = 67;

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);
        System.out.println("________");

        System.out.println("Задача 3");
        byte pupilLP = 23;            // класс Людмилы Павловны
        byte pupilAN = 27;            // класс Анны Сергеевны
        byte pupilEA = 30;            // класс Екатерины Андреевны
        short paperTotal = 480;       // купили бумаги
        int paperPupil = paperTotal / (pupilLP + pupilAN + pupilEA);
        System.out.println("На каждого ученика рассчитано " + paperPupil + " листов бумаги");
        System.out.println("________");

        System.out.println("Задача 4");
        int performanceMachine = 16 / 2;                            //производительность машины в 1 минуту
        int performanceMachine20Minute = performanceMachine * 20;   //производительность машины за 20 минут
        int performanceMachineDay = 24 * 60 * performanceMachine;   //производительность машины в 1 день
        int performanceMachineDays3 = performanceMachineDay * 3;    //производительность машины в 3 дня
        int performanceMachineMonth = performanceMachineDay * 30;   //производительность машины в месяц если в месяце 30 дней

        System.out.println("За 20 минут машина произвела " + performanceMachine20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + performanceMachineDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performanceMachineDays3 + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + performanceMachineMonth + " штук бутылок");
        System.out.println("________");

        System.out.println("Задача 5");
        byte potClassTotal = 120;                                  //всего нужно банок для ремонта
        byte potWhiteClass = 2;                                    //на один класс нужно белой краски
        byte potBrownClass = 4;                                    //на один класс нужно коричнекой краски
        int classTotal = 120 / (potWhiteClass + potBrownClass);    //всего классов
        int potWhiteTotal = classTotal * potWhiteClass;
        int potBrownTotal = classTotal * potBrownClass;
        System.out.println("В школе, где " + classTotal + " классов, нужно " + potWhiteTotal + " банок белой краски и " + potBrownTotal + " банок коричневой краски");
        System.out.println("________");

        System.out.println("Задача 6");
        byte weightBanana = 80;
        byte shakeBanana = 5;
        byte weightMilk100 = 105;
        int shakeMilk = 200 / 100;
        byte weightIceCream = 100;
        byte shakeIceCream = 2;
        byte weightEgg = 70;
        byte shakeEgg = 4;
        int weightShakeGr = (weightBanana * shakeBanana) + (weightMilk100 * shakeMilk) + (weightIceCream * shakeIceCream) + (weightEgg * shakeEgg);
        float weightShakerKg = weightShakeGr / 1000f;
        System.out.println("Вес спортзавтрака: " + weightShakerKg + " килограмм");
        System.out.println("________");

        System.out.println("Задача 7");
        int weightLossGr = 7 * 1000;       //требуемая потеря веса в граммах
        short weightLossMethod1Gr = 250;   //1ая прогрмма потери веса за 1 день
        short weightLossMethod2Gr = 500;   //2ая прогрмма потери веса за 1 день
        int totalDaysMethod1 = weightLossGr / weightLossMethod1Gr;
        int totalDaysMethod2 = weightLossGr / weightLossMethod2Gr;
        int averageDays = (totalDaysMethod1 + totalDaysMethod2) / 2;

        System.out.println("При потере 250 грамм в день потребуется " + totalDaysMethod1 + " дней");
        System.out.println("При потере 500 грамм в день потребуется " + totalDaysMethod2 + " дней");
        System.out.println("В среднем потребуется " + averageDays + " дней");
        System.out.println("________");

        System.out.println("Задача 8");
        int salaryMaria = 67760;                     //з/п Марии
        int salaryDenis = 83690;                     //з/п Дениса
        int salaryKristina = 76230;                  //з/п Кристина
        float salaryIncreaseCoefficient = 1.1f;     //на сколько увеличивается з/п в год

        //считаем з/п до увеличения
        int totalSalaryMaria = 12 * salaryMaria;
        int totalSalaryDenis = 12 * salaryDenis;
        int totalSalaryKristina = 12 * salaryKristina;

        //считаем з/п после увелечния на 10%
        float totalSalaryIncreaseMaria = totalSalaryMaria * salaryIncreaseCoefficient;
        float totalSalaryIncreaseDenis = totalSalaryDenis * salaryIncreaseCoefficient;
        float totalSalaryIncreaseKristina = totalSalaryKristina * salaryIncreaseCoefficient;

        //считаем разницу
        float incomeIncreaseMaria = totalSalaryIncreaseMaria - totalSalaryMaria;
        float incomeIncreaseDenis = totalSalaryIncreaseDenis - totalSalaryDenis;
        float incomeIncreaseKristina = totalSalaryIncreaseKristina - totalSalaryKristina;

        System.out.println("Маша теперь получает " + totalSalaryIncreaseMaria + " рублей. Годовой доход вырос на " + incomeIncreaseMaria + " рублей");
        System.out.println("Денис теперь получает " + totalSalaryIncreaseDenis + " рублей. Годовой доход вырос на " + incomeIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + totalSalaryIncreaseKristina + " рублей. Годовой доход вырос на " + incomeIncreaseKristina + " рублей");
    }
}
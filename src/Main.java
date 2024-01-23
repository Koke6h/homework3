public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Exercise 1");
     byte bananas = 4;
     System.out.println("Бананы"+ bananas + "кг");
     int apples = 2500000;
     System.out.println("Apples"+ apples +"kg");
     short sugar = 30000;
     System.out.println("Sugar"+ sugar +"kg");
     long atom = 1000000000;
     System.out.println("Atom in human"+ atom +"unity");
     float water =  3.5F;
     System.out.println("Bottle"+ water +"liters");
     double bubble = 1.723F;
     System.out.println("Bubble in soda"+ bubble +"unity");

        System.out.println("Exercise 2");
        float a = 27.12F;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short i = -159;
        System.out.println(i);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
        System.out.println("Exercise 3");

        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short shortPaper = 480;
        int students = classA + classB + classC;
        int paperForStudents = shortPaper/students;
        System.out.println("На каждого ученика рассчитано"+" " + paperForStudents+" "+ "листов бумаги");

        System.out.println("Exercise 4");
        byte bottle = 16;
        byte time = 2;
        int timePerBottles = bottle/time;
        byte hour = 60;
        int day = 24 * hour;
        byte minute = 20;
        int day3 = day*3;
        int month = 30*day;
        int bottlesIn20minutes = timePerBottles * minute;
        int bottlesInDay = timePerBottles * day;
        int bottlesIn3days = timePerBottles * day * day3;
        int bottlesIn1month = timePerBottles * day * month;
        System.out.println("За"+minute+"минут машина произвела"+bottlesIn20minutes+"штук бутылок");
        System.out.println("За"+day+"минут машина произвела"+bottlesInDay+"штук бутылок");
        System.out.println("За"+day3+"минут машина произвела"+bottlesIn3days+"штук бутылок");
        System.out.println("За"+month+"минут машина произвела"+bottlesIn1month+"штук бутылок");

        System.out.println("Exercise 5");
        byte tinOfPaintForSchool = 120;
        byte whiteTinOfPaintForClass = 2;
        byte brownTinOfPaintForClass = 4;
        int colorClass= brownTinOfPaintForClass+whiteTinOfPaintForClass;
        int overClasses = tinOfPaintForSchool/colorClass;
        int overWhiteColor = (overClasses*whiteTinOfPaintForClass);
        int overBrownColor = (overClasses*brownTinOfPaintForClass);
        System.out.println("В школе, где"+overClasses+"классов, нужно"+overWhiteColor+"банок белой краски и"+ overBrownColor+"банок коричневой краски");

        System.out.println("Exercise 6");
        byte banana = 5;
        int milk = 200;
        byte iceCream = 2;
        byte eggs = 4;
        int caloriesBanana = 80 * banana;
        float caloriesMilk = milk*(105f/100);
        int caloriesIceCream = iceCream*100;
        int caloriesEggs = eggs * 70;
        float totalCalories = (caloriesBanana + caloriesMilk + caloriesIceCream + caloriesEggs)/1000;
        System.out.println(totalCalories);

        System.out.println("Exercise 7");
        byte kg = 7;
        int lossGram250 = 250;
        int lossGram500 = 500;
        int gram = kg * 1000;
        int dayLossGram250 = gram/lossGram250;
        int dayLossGram500 = gram/lossGram500;
        System.out.println("За"+dayLossGram250+"дней, спортсмен потеряет"+kg+"кг веса, если будет худеть на"+lossGram250+"грамм в день");
        System.out.println("За"+dayLossGram500+"дней, спортсмен потеряет"+kg+"кг веса, если будет худеть на"+lossGram500+"грамм в день");

        System.out.println("Exercise 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        byte year = 12;
        float rise = 0.1F;
        float riseMashaSalary=mashaSalary+(mashaSalary*rise);
        float riseDenisSalary=denisSalary+(denisSalary*rise);
        float riseKristinaSalary=kristinaSalary+(kristinaSalary*rise);
        float mashaSalaryPerYear=mashaSalary*year;
        float denisSalaryPerYear=denisSalary*year;
        float kristinaSalaryPerYear=kristinaSalary*year;
        float afterRiseMashaSalaryPerYear=riseMashaSalary*year;
        float afterRiseDenisSalaryPerYear=riseDenisSalary*year;
        float afterRiseKristinaSalaryPerYear=riseKristinaSalary*year;
        float differenceSalaryMasha=afterRiseMashaSalaryPerYear-mashaSalaryPerYear;
        float differenceSalaryDenis=afterRiseDenisSalaryPerYear-denisSalaryPerYear;
        float differenceSalaryKristina=afterRiseKristinaSalaryPerYear-kristinaSalaryPerYear;
        System.out.println("Маша теперь получает"+riseMashaSalary+"рублей. Годовой доход вырос на"+differenceSalaryMasha+"рублей");
        System.out.println("Денис теперь получает"+riseDenisSalary+"рублей. Годовой доход вырос на"+differenceSalaryDenis+"рублей");
        System.out.println("Кристина теперь получает"+riseKristinaSalary+"рублей. Годовой доходвырос на"+differenceSalaryKristina+"рублей");
    }
}
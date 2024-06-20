public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        byte a = 126;
        System.out.println ("Значение переменной a с типом byte равно " + a);
        short b = 32766;
        System.out.println ("Значение переменной b с типом short равно " + b);
        int c = 2147483646;
        System.out.println ("Значение переменной c с типом int равно " + c);
        long d = 859152555651919811L;
        System.out.println ("Значение переменной d с типом long равно " + d);
        float e = 3.75f;
        System.out.println ("Значение переменной e с типом float равно " + e);
        double f =1.889165165194;
        System.out.println ("Значение переменной f с типом double равно " + f);

        System.out.println("Задача 2");

        byte umber1 = 67;
        System.out.println ("Значение переменной umber1 с типом byte равно " + umber1);
        short umber2 = 569;
        System.out.println ("Значение переменной umber2 с типом short равно " + umber2);
        short umber3 = 27897;
        System.out.println ("Значение переменной umber3 с типом short равно " + umber3);
        long umber4 = 987678965549L;
        System.out.println ("Значение переменной umber4 с типом long равно " + umber4);
        float umber5 = 27.12f;
        System.out.println ("Значение переменной umber5 с типом float равно " + umber5);
        float umber6 = 2.786f;
        System.out.println ("Значение переменной umber6 с типом float равно " + umber6);
        short umber7 = -159;
        System.out.println ("Значение переменной umber7 с типом short равно " + umber7);

        System.out.println("Задача 3");

        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte catherineAndreyevna = 30;
        short totalSheetsOfPaper = 480;
        int totalStudents = (lyudmilaPavlovna + annaSergeevna + catherineAndreyevna);
        int student = totalSheetsOfPaper / totalStudents;
        System.out.println ("На каждого ученика рассчитано " + student + " листов бумаги");

        System.out.println("Задача 4");

        byte bottles = 16;
        byte minute = 2;
        byte time1 = 20;
        int result1 = (time1 / minute) * bottles;
        System.out.println("За " + time1 +  " минут машина произвела " + result1 + " штук бутылок");
        short time2 = 1440;
        int result2 = (time2 / minute) * bottles;
        System.out.println("За " + time2 +  " минут машина произвела " + result2 + " штук бутылок");
        short time3 = 4320;
        int result3 = (time3 / minute) * bottles;
        System.out.println("За " + time3 +  " минут машина произвела " + result3 + " штук бутылок");
        int time4 = 43800;
        int result4 = (time4 / minute) * bottles;
        System.out.println("За " + time4 +  " минут машина произвела " + result4 + " штук бутылок");

        System.out.println("Задача 5");

        byte paintCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        int totalClasses = paintCans / oneClass;
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");

        System.out.println("Задача 6");

        short bananas =5;
        bananas *=80;
        float milk =2f;
        milk *=105;
        short iceCreamSundae =2;
        iceCreamSundae *=100;
        short rawEggs =4;
        rawEggs *=70;
        float totalWeightProducts = bananas + milk + iceCreamSundae + rawEggs;
        float kilogram = (totalWeightProducts/ 1000f);
        System.out.println("Вес спортзавтрака составляет " + totalWeightProducts + " граммов, это - " + kilogram + " кг!");



    }
}
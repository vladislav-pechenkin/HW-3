public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");

        byte a = 126;
        System.out.println ("Значение переменной a с типом byte равно " + a);
        short b = 32766;
        System.out.println ("Значение переменной b с типом short равно " + b);
        int c = 2147483646;
        System.out.println ("Значение переменной c с типом int равно " + c);
        long d = 859152555;
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

    }
}
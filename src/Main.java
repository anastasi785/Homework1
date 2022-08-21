public class Main {
    public static void main(String[] args) {
        // Задание 1

        byte a = 126;
        short b = 128;
        int c = 129;
        long d = 7856247L;
        float h = 2.56f;
        double g = 3.8974;
        boolean aIsTrue = a > 3;
        char table = 40;
        System.out.println(aIsTrue);
        //Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOfAllBoxers = boxer1 + boxer2;
        double weightDifference = boxer2 - boxer1;

        System.out.println("Общий вес боксеров " + weightOfAllBoxers + " кг");
        System.out.println("Разница в весе боксёров составляет " + weightDifference + " кг");

        // Задание 3

        byte banana = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte eggs = 4;
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggsWeight = 70;
        int productsWeight = (banana*bananaWeight)+(milk*milkWeight)+(iceCream+iceCreamWeight)+(eggs*eggsWeight);
        System.out.println("Общий вес продуктов составляет "+ productsWeight+ " гр");
        float inKilos = productsWeight/1000f;
        System.out.println(" Общий вес продуктов " + inKilos + " кг");

        //Задание 4
        byte needToLose = 7;
        short losePerDay = 250;
        short losePerDay1 = 500;
        int needToLoseInGramms = needToLose*1000;
        System.out.println("Вес в граммах, который необходимо скинуть "+ needToLoseInGramms + " гр");
        double days1 = needToLoseInGramms/losePerDay;
        double days2 = needToLoseInGramms/losePerDay1;

        System.out.println("количество дней при потере 250 гр/день " + days1 + " дней" );
        System.out.println("количество дней при потере 500 гр/день " + days2 + " дней");
        double averageAmmountOfDays = (days1+days2)/2;
        System.out.println("Среднее кол-во дней для потери веса " + averageAmmountOfDays + " дней");




    }
}
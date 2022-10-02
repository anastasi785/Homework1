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

        // Задание 5
        int mashaSalary = 67760;
        int denSalary = 83690;
        int krisSalary = 76230;
        int mashaSalaryGrows = (mashaSalary + (mashaSalary/100*10))*12;
        int mashaSalaryBefore = mashaSalary * 12;
        System.out.println("Машин предыд. заработок " + mashaSalaryBefore + " руб. в год");
        System.out.println("Маша теперь получает " + mashaSalaryGrows + " руб. в год");
        int mashaDifference = mashaSalaryGrows - mashaSalaryBefore;
        System.out.println("Разница в заработке Маши до и после повышения "+ mashaDifference + " руб в год");

        int denSalaryGrows = (denSalary + (denSalary/100*10))*12;
        int denSalaryBefore = denSalary * 12;
        System.out.println("Предыд. заработок Дениса " + denSalaryBefore + " руб. в год");
        System.out.println("Денис теперь получает " + denSalaryGrows + " руб. в год");
        int denDifference = denSalaryGrows - denSalaryBefore;
        System.out.println("Разница в заработке Дениса до и после повышения "+ denDifference + " руб в год");

        int krisSalaryGrows = (krisSalary + (krisSalary/100*10))*12;
        int krisSalaryBefore = krisSalary * 12;
        System.out.println("Предыд. заработок Кристины " + krisSalaryBefore + " руб. в год");
        System.out.println("Кристина теперь получает " + krisSalaryGrows + " руб. в год");
        int krisDifference = krisSalaryGrows - krisSalaryBefore;
        System.out.println("Разница в заработке Кристины до и после повышения "+ krisDifference + " руб в год");


        int lP=23;
        int aS=27;
        int eA=30;
        int sheetsPapers=480;
        int ammountsOfPaperPerPerson= sheetsPapers/(lP+aS+eA);
        System.out.println("На каждого ученика расчитано "+ ammountsOfPaperPerPerson+ " листов бумаги");
        
        int perMin=16/2;
        int per20Min= 20*perMin;
        System.out.println("per20Min = " + per20Min);
        int perDay=60*(24*perMin);
        System.out.println("perDay = " + perDay);
        int per3Days=perDay*3;
        System.out.println("per3Days = " + per3Days);
        int perMonth=perDay*31;
        System.out.println("perMonth = " + perMonth);



    }
}
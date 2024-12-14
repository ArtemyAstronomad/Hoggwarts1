class HogwartsStudent {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public HogwartsStudent(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void printDescription() {
        System.out.println("Имя: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Дистанция трансгрессии: " + transgressionDistance);
    }

    public static void compareMagic(HogwartsStudent s1, HogwartsStudent s2) {
        if (s1.getMagicPower() > s2.getMagicPower()) {
            System.out.println(s1.getName() + " обладает большей магической силой, чем " + s2.getName());
        } else if (s1.getMagicPower() < s2.getMagicPower()) {
            System.out.println(s2.getName() + " обладает большей магической силой, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " обладают одинаковой магической силой.");
        }

        if (s1.getTransgressionDistance() > s2.getTransgressionDistance()) {
            System.out.println(s1.getName() + " способен трансгрессировать на большее расстояние, чем " + s2.getName());
        } else if (s1.getTransgressionDistance() < s2.getTransgressionDistance()) {
            System.out.println(s2.getName() + " способен трансгрессировать на большее расстояние, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " способны трансгрессировать на одинаковое расстояние.");
        }
    }
}

class Gryffindor extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getTotalScore() {
        return nobility + honor + courage;
    }

    public static void compareStudents(Gryffindor s1, Gryffindor s2) {
        if (s1.getTotalScore() > s2.getTotalScore()) {
            System.out.println(s1.getName() + " лучший Гриффиндорец, чем " + s2.getName());
        } else if (s1.getTotalScore() < s2.getTotalScore()) {
            System.out.println(s2.getName() + " лучший Гриффиндорец, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны по качествам.");
        }
    }
}

class Slytherin extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTotalScore() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public static void compareStudents(Slytherin s1, Slytherin s2) {
        if (s1.getTotalScore() > s2.getTotalScore()) {
            System.out.println(s1.getName() + " лучший Слизеринец, чем " + s2.getName());
        } else if (s1.getTotalScore() < s2.getTotalScore()) {
            System.out.println(s2.getName() + " лучший Слизеринец, чем " + s1.getName());
        } else {
            System.out.println(s1.getName() + " и " + s2.getName() + " равны по качествам.");
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 80, 50, 90, 85, 95);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 60, 85, 90, 80);

        Slytherin draco = new Slytherin("Драко Малфой", 70, 40, 80, 75, 85, 60, 90);
        Slytherin gregory = new Slytherin("Грегори Гойл", 50, 30, 60, 55, 50, 40, 65);

        harry.printDescription();
        hermione.printDescription();
        draco.printDescription();
        gregory.printDescription();

        Gryffindor.compareStudents(harry, hermione);
        Slytherin.compareStudents(draco, gregory);

        HogwartsStudent.compareMagic(harry, draco);
    }
}

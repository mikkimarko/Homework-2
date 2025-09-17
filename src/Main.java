//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println( );
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println( );
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println( );
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println( );
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / (3.5);
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println();
        System.out.println(totalWeight);
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println(weightDifference);
        var weightRemainder = boxer2Weight % boxer1Weight;
        System.out.println(weightRemainder);

        var totalHours = 640;
        var hoursPerEmployee = 8;
        var totalEmployees = totalHours / hoursPerEmployee;
        System.out.println();
        System.out.println("Всего работников в компании —  " + totalEmployees + " человек.");

        var moreEmployees = totalEmployees + 94;
        var hoursPerEmployee2 = totalHours / moreEmployees;
        System.out.println("Если в компании работает " + moreEmployees + " человека, то всего " + hoursPerEmployee2 + " часа работы может быть поделено между сотрудниками.");



    }
}
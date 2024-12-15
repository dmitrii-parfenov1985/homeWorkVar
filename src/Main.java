public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);

        var differenceWeightBoxers = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differenceWeightBoxers);

        var diffWeightBoxers = secondBoxerWeight % firstBoxerWeight;
        System.out.println(diffWeightBoxers);

        var allWorkTime = 640;
        var oneWorkerTime = 8;
        var totalWorkers = allWorkTime / oneWorkerTime;
        System.out.println("Всего работников в компании " + totalWorkers + " человек");

        var moreWorkers = totalWorkers + 94;
        var newWorkTime = moreWorkers * oneWorkerTime;
        System.out.println("Если в компании работает " + moreWorkers + " человека, то всего " + newWorkTime + " часа может быть поделено между сотрудниками");
    }
}
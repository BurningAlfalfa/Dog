public class DogMain {
    public static void main(String []args) {

        Dog dog1 = new Dog("Lika", 7, false);

        //System.out.println(dog1.getName());
        Cat cat1 = new Cat ("mittens", true,6);
        Dog dog2 = new Dog ("Leo", 5);
        Dog dog3 = new Dog ("Frank", 4);
        Dog dog4 = new Dog ("jazi", 1);
        Cat cat2 = new Cat ("jingles", 7);
        Cat cat3 = new Cat ("finger",3);
        Cat cat4 = new Cat ("squib",3);

       Dog dogArray[] = {dog1,dog2,dog3,dog4};
        Cat catArray[] = {cat2,cat3,cat4};
        /*System.out.println(dog2.getName()+" "+ dog2.getAge());
        System.out.println(dog1.printName());
        System.out.println(dog1.getName());
        System.out.println(dogArray[0].getName());*/

        Kennel kennel = new Kennel("Bobs");
        kennel.addDog(dog1);
        kennel.printDogs();
        kennel.addDog(dog2);
        kennel.removeDog(dog1.getName());
        kennel.printDogs();
        //System.out.println(cat1.humanAge());

    }
}
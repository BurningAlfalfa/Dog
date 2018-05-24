public class DogMain {
    public static void main(String []args) {

        Dog dog1 = new Dog("Lika", 7, false);

        System.out.println(dog1.getName());

        Dog dog2 = new Dog ("Leo");

        dog1.setName(dog2.getName());

        Dog dogArray[] = {dog1,dog2};
        System.out.println(dog2.getName()+" "+ dog2.getAge());
        System.out.println(dog1.printName());
        System.out.println(dog1.getName());
        System.out.println(dogArray[0].getName());

        Cat cat1 = new Cat ("mittens", true,6);

        System.out.println(cat1.humanAge());

    }
}
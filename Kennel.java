public class Kennel {
    private String name;
    private Dog [] dogArray;
    private Cat [] catArray;
    public void setkName(String name){
        this.name= name;
    }
    public void setDogArray(Dog [] dogArray ){
        this.dogArray = dogArray;
    }
    public void setCatArray(Cat [] catArray){
        this.catArray = catArray;
    }
    public Dog []getDogArray(){
            return dogArray;
    }
    public Cat []getCatArray(){
        return catArray;
    }
    public Kennel(String name){
        this.name = name;
        this.dogArray = new Dog[0];
        this.catArray = new Cat[0];

    }
    public void addDog(Dog dog){
       Dog[] newDogArray = new Dog[dogArray.length+1];
       for(int i = 0; i < dogArray.length;i++){
            newDogArray[i] = dogArray[i];

       }
       newDogArray[newDogArray.length-1] = dog;
       this.dogArray = newDogArray;
       //System.out.println(dog.getName());
    }
    public void printDogs(){
        //System.out.println("the length of the dog array is "+ dogArray.length);
        System.out.println("printing dogs");
        for(int i = 0; i < dogArray.length;i++){
            System.out.println("name : " + dogArray[i].getName());
        }
        System.out.println("done");
    }
    public void removeDog(String dogName){
        /*Dog[] newDogArray = new Dog[dogArray.length-1];
        for(int i = 0;i < dogArray.length;i++){
            newDogArray[i] = dogArray[i];
        }

        this.dogArray = newDogArray;*/
        for(int i = 0;i < dogArray.length;i++){
            if(dogArray[i].getName().equals(dogName)){
                dogArray[i].setName("fuck");
            }

        }
    }
    public void addCat(Cat cat){

    }
    public void removeCat(){

    }


}
//so kennal  shiould have its field variable, should be an array of dogs, an array of cats
//the name of the kennel,
//methods, getters, setter, prints all dog name on seperate line, and ages , method prints all cat names on seperate lines and ages
// methods 4, one to add and remove both cat and dogp
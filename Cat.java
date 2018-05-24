public class Cat {

    private String name;
    private boolean sucks;
    private boolean nice;
    private int age;

    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSucks(boolean sucks){
        this.sucks = sucks;
    }
    public void setNice(boolean nice){
        this.nice = nice;
    }
    public  String getName(){
        return name;
    }

    public boolean getNice() {
        return nice;
    }
    public int getAge(){
        return age;
    }
    public boolean getSucks() {
        return sucks;
    }
    public Cat(String name, boolean nice,int age){
        this.name = name;
        this.sucks = true;
        this.nice = sucks;
        this.age = age;

    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int humanAge(){
        return age*10;
    }
}

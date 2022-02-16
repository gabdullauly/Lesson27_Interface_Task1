public class Dog implements Animal{
    private String dogClass;
    private String name;
    private int age;

    public Dog(){}
    public Dog(String dogClass, String name, int age){
        this.dogClass = dogClass;
        this.name = name;
        this.age = age;
    }

    public String getDogClass(){
        return dogClass;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return  age;
    }

    public void setDogClass(String dogClass){
        this.dogClass = dogClass;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public void speak(){
        System.out.println("Gaf Gaf");
    }

    @Override
    public String getData(){
        return dogClass+" "+name+" "+age;
    }
}

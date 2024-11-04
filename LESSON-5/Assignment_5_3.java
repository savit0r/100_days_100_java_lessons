
class EncapsulatedPerson{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>0){
            this.age = age;
        }
    }

    public void display(){
        System.out.println("EncapsulatedPerson :");
        System.out.println("Name: "+ name);
        System.out.println("age :" + age);

    }
}

public class Assignment_5_3{
    public static void main(String[] args){

        EncapsulatedPerson encap = new EncapsulatedPerson();
        encap.setName("charlie");
        encap.setAge(35);

        encap.display();

    }
}
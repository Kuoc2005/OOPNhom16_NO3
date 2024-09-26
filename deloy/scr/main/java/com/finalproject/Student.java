
package studentsystem;

public class Student {
    private String ID;
    private String name;
    private int age;

    public Student(String ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
    
}

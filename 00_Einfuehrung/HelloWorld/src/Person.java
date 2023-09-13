public abstract class Person {
    protected String name;
    protected int age;
    protected char sex;

    public Person(String name, int age, char sex) {
        setName(name);
        setAge(age);
        setSex(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}

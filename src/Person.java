public class Person {
    private int age;
    private String name;
    private Persone.Gender sex;

    public Person(int age, String name, Persone.Gender sex) {

        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Persone.Gender getSex() {

        return sex;
    }

    public void setSex(Persone.Gender sex) {

        this.sex = sex;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Person{");

        sb.append("age=").append(age);
        sb.append(", name='").append(name).append('\'');
        sb.append(", sex=").append(sex);
        sb.append('}');

        return sb.toString();
    }
}

public class person {
    int age;
    String name;
    String surname;
    String gender;
    int footNo;
    School school;

    public person() {
    }

    public person(int age, String name, String surname, String gender, int footNo, School school) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.footNo = footNo;
        this.school = school;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFootNo() {
        return footNo;
    }

    public void setFootNo(int footNo) {
        this.footNo = footNo;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", footNo=" + footNo +
                ", school=" + school +
                '}';
    }

}

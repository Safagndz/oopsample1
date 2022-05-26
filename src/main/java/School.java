public class School {
    String name;
    int classNo;
    String className;
    String address;
    boolean isGradvated;

    public School() {
    }

    public School(String name, int classNo, String className, String address, boolean isGradvated) {
        this.name = name;
        this.classNo = classNo;
        this.className = className;
        this.address = address;
        this.isGradvated = isGradvated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isGradvated() {
        return isGradvated;
    }

    public void setGradvated(boolean gradvated) {
        isGradvated = gradvated;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classNo=" + classNo +
                ", className='" + className + '\'' +
                ", address='" + address + '\'' +
                ", isGradvated=" + isGradvated +
                '}';
    }
}

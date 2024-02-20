class Student {
    public String name ;
    public int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student [" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ']';
    }
}

class StudentArrayExample{
    public static void main(String[] args) {
        Student [] studentArray = new Student[5]; // declaring Student Array

        //Creating student objects
        Student student1 = new Student("Thomas", 10);
        Student student2 = new Student("David", 20);
        Student student3 = new Student("Terry", 30);
        Student student4 = new Student("John", 40);
        Student student5 = new Student("Liam", 50);
        //Initialising student objects in the array
        studentArray[0] = student1;
        studentArray[1] = student2;
        studentArray[2] = student3;
        studentArray[3] = student4;
        studentArray[4] = student5;

        for (int i = 0 ; i < studentArray.length; i++) {
            System.out.println(studentArray[i].toString());
        }
    }
}

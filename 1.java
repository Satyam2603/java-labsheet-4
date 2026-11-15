class Student {
    String name;
    int age;
    static int count = 0;

    void setDetails() {
        String studentName = "Satyam";
        int studentAge = 21;

        name = studentName;
        age = studentAge;
        count++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Total Students: " + count);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDetails();
        s1.display();
    }
}

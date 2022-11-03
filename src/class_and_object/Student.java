package class_and_object;

public class Student
{
    public String name;
    private final int rollNumber;
    private static int numStudents;

    public Student(String name , int rolLNumber)
    {
        this.name = name;
        this.rollNumber = rolLNumber;
        numStudents++;
    }

    //Setter method
  /*  public void setRollNumber(int rn)
    {
        if (rn<=0)
        {
            return;
        }
        rollNumber = rn;
    }*/



    //Getter method

    public static int getNumStudents()
    {
        return numStudents;
    }
    public int getRollNumber()
    {
        return rollNumber;
    }

    public void print()
    {
        System.out.println(name + " : " + rollNumber);
    }
}

class StudentUse
{
    public static void main(String args[])
    {
        Student s1 = new Student("Ayush",201);
        s1.print();

        Student s2 = new Student("Shivendra",776);
        s2.print();

       System.out.println( Student.getNumStudents());
        //System.out.println(s1.name);
        //System.out.println(s1.getRollNumber());
    }
}

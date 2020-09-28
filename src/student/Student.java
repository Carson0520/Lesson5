package student;

public class Student {

    private String name;
    private int test1, test2, test3;

    public Student(String name, int test1, int test2, int test3) {
        this.name = name;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;

    }

    public Student() {

        this("", 0, 0, 0);

    }

    public Student(Student other) {

        this(other.name, other.test1, other.test2, other.test3);
    }

    public void setName(String n) {
        name = n;

    }

    public void setScore(int i, int score) {
        if (i == 1) {
            test1 = score;
        } else if (i == 2) {
            test2 = score;
        } else {
            test3 = score;
        }

    }

    public String getName() {
        return name;
    }

    public int getScore(int i) {
        if (i == 1) {
            return test1;
        } else if (i == 2) {
            return test2;
        } else {
            return test3;
        }
    }

    public int getAverage() {
        int average;
        average = (test1 + test2 + test3) / 3;
        return average;
    }

    public int getHighScore() {
        int high = Math.max(test1, test3);
        high = Math.max(high, test3);
        return high;
    }

    public String toString() {
        String str;
        str = "Name:\t" + name;
        str += "\nTest:\t" + test1;
        str += "\nTest:\t" + test2;
        str += "\nTest:\t" + test3;
        return str;
    }

    public String validateData(){
        String em =null;
        if(name.equals("")) //hen a name was not entered
            em="Name is required.";
        if(test1<0 || test1>100 || test2<0 || test2>100 || test3<0 ||test3>100)
            if (em ==null) //then there has been no error yet
                em = "At least 1 mark is out of the acceptable range";
            else //add on to teh message with +=
                em += "\nPlease re-enter all the data\n";
        return em; //return error message, either as null, or with real message
    }
}
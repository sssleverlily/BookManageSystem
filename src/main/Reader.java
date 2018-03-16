package main;

public class Reader {
    private String name;
    private int grade;
    private int ID;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    public void getReader(String name,int grade,int ID) {
        this.ID=ID;
        this.grade=grade;
        this.name=name;

    }

}

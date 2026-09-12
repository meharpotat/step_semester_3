package main.java.day6.practice_problems;

class placementrecord{
    String studentname;
    String company;
    double packageLpa;

    public placementrecord(String studentname, String company, double packageLpa){
        this.studentname = studentname;
        this.company = company;
        this.packageLpa = packageLpa;
    }

    void printrecord(){
        System.out.println(studentname + " -> " + company + " @ " + packageLpa);
    }
}

public class StudentPlacementRecordManagement{
    public static void main(String[] args){
        placementrecord[] records = new placementrecord[3];

        records[0] = new placementrecord("Ravi", "TCS", 4.5);
        records[1] = new placementrecord("Anitha", "Zoho", 6.2);
        records[2] = new placementrecord("Karthik", "Infosys", 4.0);

        for(placementrecord record: records){
            record.printrecord();
        }
    }
}

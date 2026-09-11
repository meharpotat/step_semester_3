package main.java.day3.class_problems;

class Applicant {
    static int totalApplicants = 0;

    public Applicant() {
        totalApplicants++;
    }
}

public class CountingObjectsWithStaticField {
    public static void main(String[] args) {
        new Applicant();
        new Applicant();
        new Applicant();

        System.out.println("Total applicants: " + Applicant.totalApplicants);
    }
}

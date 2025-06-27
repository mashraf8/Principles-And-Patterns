package design_patterns.structural_patterns.proxy;

public class Run
{
    public static void main(String[] args)
    {
        User doctor = new User("Dr. Amr", "doctor");
        User patient = new User("Ahmed", "patient");

        MedicalRecord doctorAccess = new MedicalRecordProxy(doctor, "Ahmed Hassan", "High Blood Pressure", "Medicine A");
        doctorAccess.view();

        System.out.println("\n");

        MedicalRecord patientAccess = new MedicalRecordProxy(patient, "Ahmed Hassan", "High Blood Pressure", "Medicine A");
        patientAccess.view();
    }

}

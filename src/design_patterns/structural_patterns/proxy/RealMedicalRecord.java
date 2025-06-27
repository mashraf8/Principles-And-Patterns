package design_patterns.structural_patterns.proxy;

public class RealMedicalRecord implements MedicalRecord
{
    private String patientName;
    private String diagnosis;
    private String medication;

    public RealMedicalRecord(String patientName, String diagnosis, String medication)
    {
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.medication = medication;
    }

    @Override
    public void view()
    {
        System.out.println("Full Medical Record:");
        System.out.println("Patient Name: " + patientName);
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Medication: " + medication);
    }

}

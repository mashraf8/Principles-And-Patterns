package design_patterns.structural_patterns.proxy;

public class MedicalRecordProxy implements MedicalRecord
{
    private RealMedicalRecord realRecord;
    private User user;

    // Lazy parameters to be passed when creating RealMedicalRecord
    private String patientName;
    private String diagnosis;
    private String medication;

    public MedicalRecordProxy(User user, String patientName, String diagnosis, String medication)
    {
        this.user = user;
        this.patientName = patientName;
        this.diagnosis = diagnosis;
        this.medication = medication;
    }

    @Override
    public void view()
    {
        System.out.println("User: " + user.getName() + " (Role: " + user.getRole() + ")");

        if (user.isDoctor())
        {
            System.out.println("Full access granted.");

            // Lazy Initialization: create realRecord only when needed
            if (realRecord == null)
            {
                realRecord = new RealMedicalRecord(patientName, diagnosis, medication);
            }

            realRecord.view();
        } else
        {
            System.out.println("Access denied! You are not authorized to view the medical record.");
        }
    }
}



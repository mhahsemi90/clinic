public class Patient extends Person {
    private String patientId;
    public Patient(String name, String family, String nationalId, String fatherName) {
        super(name, family, nationalId, fatherName);
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }
}

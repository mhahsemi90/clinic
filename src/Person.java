public class Person {
    private String name;
    private String family;
    private String nationalId;
    private String fatherName;

    public Person(String name, String family, String nationalId, String fatherName) {
        this.name = name;
        this.family = family;
        this.nationalId = nationalId;
        this.fatherName = fatherName;
    }

    public String getFamily() {
        return family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getName() {
        return name;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

}

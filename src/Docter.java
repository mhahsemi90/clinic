public class Docter extends Staff {

    private String type;
    private String speciality;
    public Docter(String name, String family, String nationalId, String fatherName) {
        super(name, family, nationalId, fatherName);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

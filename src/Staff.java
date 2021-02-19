public class Staff extends Person{
    private String staffId;
    public Staff(String name, String family, String nationalId, String fatherName) {
        super(name, family, nationalId, fatherName);
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }
}

public class HospitalMain {
    public static void main(String[] args) {
        InPatient ip = new InPatient(1, "Alice", 30, 5, 2000);
        OutPatient op = new OutPatient(2, "Bob", 25, 500);

        ip.addRecord("Appendix surgery");
        ip.addRecord("Follow-up X-ray");
        op.addRecord("Fever consultation");

        Patient[] patients = {ip, op};
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                ((MedicalRecord)p).viewRecords();
            }
            System.out.println("---");
        }
    }
}

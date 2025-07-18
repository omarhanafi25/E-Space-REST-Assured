package api;

public class CandidatePayload {
    public String firstName;
    public String middleName;
    public String lastName;
    public String email;
    public String contactNumber;
    public String keywords;
    public String comment;
    public String dateOfApplication;
    public boolean consentToKeepData;
    public int vacancyId;

    public CandidatePayload() {
        this.firstName = "omar";
        this.middleName = "nabil";
        this.lastName = "abdo";
        this.email = "omar@test.com";
        this.contactNumber = "012345678999";
        this.keywords = "Omar";
        this.comment = "Note";
        this.dateOfApplication = "2025-07-18";
        this.consentToKeepData = true;
        this.vacancyId = 6;
    }
}

package cc.oobootcamp.refactor.rename.method;

public class Customer {
    private String officeAreaCode;
    private String officeNumber;

    public Customer(String officeAreaCode, String officeNumber) {
        this.officeAreaCode = officeAreaCode;
        this.officeNumber = officeNumber;
    }

    public String getTelephoneNumber() {
        return ("(" + officeAreaCode + ") " + officeNumber);
    }

}

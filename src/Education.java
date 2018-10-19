public class Education {

    private String major;
    private String college;
    private String yearOfGraduation;

    public Education(String major, String college, String yearOfGraduation) {
        this.major = major;
        this.college = college;
        this.yearOfGraduation = yearOfGraduation;
    }

    public Education() {
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setColleage(String college) {
        this.college = college;
    }

    public String getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(String yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
}

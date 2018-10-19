
import java.util.ArrayList;

public class Person {

    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Education> aEducation;
    private ArrayList<Experience> aExperince;
    private ArrayList<Skill> aSkill;

    public Person() {

        aEducation = new ArrayList<Education>();
        aExperince = new ArrayList<Experience>();
        aSkill = new ArrayList<Skill>();
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, ArrayList<Education> aEducation) {
        this.name = name;
        this.aEducation = aEducation;
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public ArrayList<Education> getaEducation() {
        return aEducation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addEducation(Education education) {

        aEducation.add(education);
    }

    public ArrayList<Experience> getaExperince() {
        return aExperince;
    }


    public ArrayList<Skill> getaSkill() {
        return aSkill;
    }


    public void addExprince(Experience experience) {
        this.aExperince.add(experience);
    }

    public void addSkill(Skill skill) {
        this.aSkill.add(skill);
    }
}


import java.util.ArrayList;

public class Person {

    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<Education> aEducation;
    private ArrayList<Experience> aExperince;
    private ArrayList<Skill> aSkill;

    public Person(String name, String email, ArrayList<Education> aEducation, ArrayList<Experience> aExperince, ArrayList<Skill> aSkill) {
        this.name = name;
        this.email = email;
        this.aEducation = aEducation;
        this.aExperince = aExperince;
        this.aSkill = aSkill;
    }

    public Person() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(String name, ArrayList<Education> aEducation){
        this.name = name;
        this.aEducation= aEducation;
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
    public void addEducation (Education education){

        aEducation.add(education);
    }

    public void setaEducation(ArrayList<Education> aEducation) {
        this.aEducation = aEducation;
    }

    public ArrayList<Experience> getaExperince() {
        return aExperince;
    }

    public void setaExperince(ArrayList<Experience> aExperince) {
        this.aExperince = aExperince;
    }

    public ArrayList<Skill> getaSkill() {
        return aSkill;
    }

    public void setaSkill(ArrayList<Skill> aSkill) {
        this.aSkill = aSkill;
    }
}

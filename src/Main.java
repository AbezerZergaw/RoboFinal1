import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ArrayList<Person> allPerson = new ArrayList<>();
        ArrayList<Education> allEducation = new ArrayList<>();
        ArrayList<Experience> allExperience = new ArrayList<>();
        ArrayList<Skill> allSkills = new ArrayList<>();
        Education education = new Education();
        Experience experience = new Experience();
   /*     Person person = new Person();
        person.setName("Abezes");
        allPerson.add(person);
        Education education = new Education();
        education.setMajor("IT");
        allEducation.add(education);
        person.addEducation(education);
        person = new Person("Abezes", allEducation);
        allPerson.add(person);
        for (Person eachPerson : allPerson) {
            System.out.println(eachPerson.getName());
            for (Education listOfEducation : eachPerson.getaEducation()) {
                System.out.println(listOfEducation.getMajor());
            }
        }
*/
        String option = "";
        do {

            Person person = new Person();

            System.out.println("Profile");
            System.out.println("Enter your Name");

            String userName = input.nextLine();
            person.setName(userName);

            System.out.println("Enter your Email");
            String userEmail = input.nextLine();
            person.setEmail(userEmail);

            System.out.println("Enter your phone number");
            String phoneNum = input.nextLine();
            person.setPhoneNumber(phoneNum);

            allPerson.add(person);

            do {
                System.out.println("Education");


                System.out.println("Enter your Major");
                String major = input.nextLine();
                education.setMajor(major);

                System.out.println("Enter name of college");
                String college = input.nextLine();
                education.setColleage(college);

                System.out.println("Year of graduation");
                String year = input.nextLine();
                education.setYearOfGraduation(year);
                System.out.println("Do you want to add more Education? yes/no");
                option = input.nextLine();
            } while (option.equalsIgnoreCase("yes"));
            allEducation.add(education);

            do {
                System.out.println("Experience");

                System.out.println("Position");
                String position = input.nextLine();
                experience.setPosition(position);


                System.out.println("Company Name");
                String companyName = input.nextLine();
                experience.setCompanyName(companyName);

                System.out.println("Year of Experience");
                String yearsOfExperience = input.nextLine();
                experience.setYearsOfExperience(yearsOfExperience);


                //duties
                System.out.println("Duties");
                String duty = input.nextLine();
                System.out.println("Do you want to add more experience? yes/no");
                option = input.nextLine();
            } while (option.equalsIgnoreCase("yes"));
            allExperience.add(experience);



            System.out.println("  Skills");
            Skill skill = new Skill();

            System.out.println("Enter your skill");
            String skills = input.nextLine();
            skill.setSkills(skills);
            System.out.println(" Level of Skill");

            String level = input.nextLine();
            skill.setLevel(level);

            allSkills.add(skill);

            System.out.println("Do you want to add more Person? yes/no");
            option = input.nextLine();

        } while (option.equalsIgnoreCase("yes"));





    }
}

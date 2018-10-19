import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//list of person
        ArrayList<Person> allPerson = new ArrayList<>();
        Person person = new Person();

        //choice for the do while loop
        String option = "";
        //count for duty on print line
        int count = 1;

        do {
            //creating profile
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
                //creating education in loop
                System.out.println("Education");

                Education education = new Education();
                System.out.println("Enter your Major");
                String major = input.nextLine();
                education.setMajor(major);

                System.out.println("Enter name of college");
                String college = input.nextLine();
                education.setColleage(college);

                System.out.println("Year of graduation");
                String year = input.nextLine();
                education.setYearOfGraduation(year);
                person.addEducation(education);
                System.out.println("Do you want to add more Education? Y/N");
                option = input.nextLine();
            } while (option.equalsIgnoreCase("Y"));


            do {
                //creating experience
                System.out.println("Experience");
                Experience experience = new Experience();
                System.out.println("Position");
                String position = input.nextLine();
                experience.setPosition(position);


                System.out.println("Company Name");
                String companyName = input.nextLine();
                experience.setCompanyName(companyName);

                System.out.println("Year of Experience");
                String yearsOfExperience = input.nextLine();
                experience.setYearsOfExperience(yearsOfExperience);
                person.addExprince(experience);
                do {
                    // creating duties
                    Duty duty1 = new Duty();
                    System.out.println("Duties");
                    String duty = input.nextLine();
                    duty1.setActivties(duty);
                    experience.addDuty(duty1);
                    System.out.println("Add more duties? Y/N");
                    option = input.nextLine();
                } while (option.equalsIgnoreCase("y"));


                System.out.println("Do you want to add more experience? Y/N");
                option = input.nextLine();
            } while (option.equalsIgnoreCase("yes"));


            do {
                System.out.println("  Skills");
                //creating skills
                Skill skill = new Skill();
                System.out.println("Enter your skill");
                String skills = input.nextLine();
                skill.setSkills(skills);
                System.out.println(" Level of Skill");
                String level = input.nextLine();
                skill.setLevel(level);
                System.out.println("Add more skills? Y/N");
                person.addSkill(skill);

                option = input.nextLine();
            } while (option.equalsIgnoreCase("Y"));

            System.out.println("Do you want to add more Person? Y/N");
            option = input.nextLine();

        } while (option.equalsIgnoreCase("Y"));


        System.out.println("======================================================");
        //printing out all
        System.out.println(person.getName() + "\n" + person.getEmail() + "\n" + person.getPhoneNumber() + "\n");

        System.out.println("Education");
        for (Education eachEducation : person.getaEducation()) {
            System.out.println(eachEducation.getMajor() + "\n" + eachEducation.getCollege()
                    + "\n" + eachEducation.getYearOfGraduation() + "\n");
        }
        System.out.println("Experience");
        for (Experience eachExperience : person.getaExperince()) {
            System.out.println(eachExperience.getPosition() + "\n" +
                    eachExperience.getCompanyName() + "\n" + eachExperience.getYearsOfExperience());
            for (Duty dutyList : eachExperience.getDute()) {

                System.out.println("-Duty " + count + "," + dutyList.getActivties());
                count++;
            }

        }
        System.out.println();
        System.out.println("Skills");
        for (Skill eachSkill : person.getaSkill()) {
            System.out.println(eachSkill.getSkills() + "," + eachSkill.getLevel());

        }


    }


}



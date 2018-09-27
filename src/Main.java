import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        print("Enter your Name");

        Scanner input = new Scanner(System.in);

        String userName = input.nextLine();
        print("Enter your Email");
        String userEmail = input.nextLine();
        person.setName(userName);
        person.setEmail(userEmail);
        print(person.getName());
        print(person.getEmail());

        print("Education");
        Education education = new Education();

        String major = input.nextLine();
        education.setMajor(major);

        String college = input.nextLine();
        education.setMajor(college);
        String yearOfGraduation = input.nextLine();
        education.setMajor(yearOfGraduation);
        print(education.getCollege());
        print(education.getMajor());
        print(education.getYearOfGraduation());


        print("Experience");
        Experience experience = new Experience();
        String position = input.nextLine();
        experience.setPosition(position);
        String companyName = input.nextLine();
        experience.setCompanyName(companyName);
        String yearsOfExperience = input.nextLine();
        experience.setYearsOfExperience(yearsOfExperience);
        String dute = input.nextLine();
        experience.setYearsOfExperience(dute);

        print("Skills");
        Skills talent = new Skills();

        String skills = input.nextLine();

        talent.setSkills(skills);
        String level = input.nextLine();
        talent.setLevel(level);


    }

    private static void print(String s) {
        System.out.println(s);
    }
}

public class Skill {

    private String skills;
    private String level;

    public Skill(String skills, String level) {
        this.skills = skills;
        this.level = level;
    }

    public Skill() {
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

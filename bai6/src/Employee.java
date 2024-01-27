public class Employee extends Persion {
    private double experience;


    public double getExperience() {
        return experience;
    }

    public Employee(int id, String name, int age, double experience) {
        super(id, name, age);
        this.experience = experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }


}

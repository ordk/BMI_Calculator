package pl.bmicalculator.model;

import javax.persistence.*;

@Entity
public class Bmi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int weight;
    private int height;
    @Enumerated(EnumType.STRING)
    private Sex sex;
    private double bmiValue;

    public Bmi() {
    }

    public Bmi(int id, int weight, int height, Sex sex, double bmiValue) {
        this.id = id;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
        this.bmiValue = bmiValue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getBmiValue() {
        return bmiValue;
    }

    public void setBmiValue(double bmiValue) {
        this.bmiValue = bmiValue;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bmi{");
        sb.append("id=").append(id);
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append(", sex=").append(sex);
        sb.append(", bmiValue=").append(bmiValue);
        sb.append('}');
        return sb.toString();
    }
}

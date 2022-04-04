package entities;

public class Employment {

    public String name;
    public double glossSalary;
    public double tax;
    public double percentage;
    int i;

    public double NetSalary() {
        this.glossSalary = glossSalary - tax;
        return this.glossSalary;
    }

    public double increaseSalary() {
        this.glossSalary = glossSalary + (glossSalary * (percentage / 100));
        return this.glossSalary;
    }

    public String toString() {

        if (i == 0) {
            i++;
            return name
                    + ", $ "
                    + String.format("%.2f", NetSalary());
        }
        return String.format("%.2f", increaseSalary());

    }

}

package ge.tsu.enums;

public enum Profession {
    PROGRAMMER(100_000_000),
    GRAPHIC_DESIGNER(38_522),
    SOFTWARE_ENGINEER(41_209),
    RETAIL_STORE_MANAGER(41_209),
    OFFICE_MANAGER(40_461),
    ELEMENTARY_SCHOOL_TEACHER(40_311),
    BUILDER(20_000);

    public int annual_salary;

    Profession(){}

    Profession(int salary){
        this.annual_salary = salary;
    }

    public int getAnnualSalary() {
        return annual_salary;
    }

    public void setAnnual_salary(int annual_salary) {
        this.annual_salary = annual_salary;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "annual_salary=" + annual_salary +
                '}';
    }
}

package lesson;

public class Lesson {

    private String name;
    private int unitsNumber;
    // پيش نيازهاي درس
    private Lesson[] prerequisites;
    //هم نياز هاي درس
    private Lesson[] needs;

    public Lesson(String name, int unitsNumber) {
        setName(name);
        setUnitsNumber(unitsNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitsNumber() {
        return unitsNumber;
    }

    public void setUnitsNumber(int unitsNumber) {
        if (unitsNumber > 0) {
            this.unitsNumber = unitsNumber;
        }
    }

    public Lesson[] getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(Lesson[] prerequisites) {
        this.prerequisites = prerequisites;
    }

    public Lesson[] getNeeds() {
        return needs;
    }

    public void setNeeds(Lesson[] needs) {
        this.needs = needs;
    }

    @Override
    public String toString() {
        String result = "(" + name + ") -> [units Number: " + unitsNumber + ", ";
        if (getPrerequisites() == null) {
            result += "This Lesson Has No Prerequisites!}\n";
        } else {
            Lesson[] prerequisitesLessons = getPrerequisites();
            result += "Prerequisites: {";
            for (Lesson lesson : prerequisitesLessons) {
                result += lesson.toString();
            }
            result += "}\n";
        }

        if (getNeeds() == null) {
            result += "This Lesson Is Not Required Either!}\n";
        } else {
            Lesson[] needsLessons = getNeeds();
            result += "Needs: {";
            for (Lesson lesson : needsLessons) {
                result += lesson.toString();
            }
            result += "\n}";
        }
        result += "]\n";
        return result;
    }

}
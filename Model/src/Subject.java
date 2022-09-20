public class Subject {
    private String name;
    private int fullMarks;
    private int passMarks;

    public Subject(String name, int fullMarks, int passMarks) {
        this.name = name;
        this.fullMarks = fullMarks;
        this.passMarks = passMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(int fullMarks) {
        this.fullMarks = fullMarks;
    }

    public int getPassMarks() {
        return passMarks;
    }

    public void setPassMarks(int passMarks) {
        this.passMarks = passMarks;
    }
}

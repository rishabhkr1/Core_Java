public enum Day {
    Sunday("Raviwar"),
    Monday("Somwar"),
    Tuesday("Mangalwar"),
    Wednesday("Budhwar"),
    Thursday("Thursday"),
    Friday("Sukrwar"),
    Saturday("Saniwar");

    private String hindi;

    Day(String hindi) {
        this.hindi=hindi;
    }

    public String getHindi() {
        return hindi;
    }

    public void Display(){
        System.out.println("Today is : "+this.name());
    }
}

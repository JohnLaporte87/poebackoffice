package poe.model;

import java.time.LocalDate;

public class Trainee {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    public Trainee() {
    }

    public Trainee(String firstName, String lastName, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                 firstName + " " + lastName+ " (" + birthdate +
                ")}";
    }
}
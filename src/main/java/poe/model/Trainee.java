package poe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class Trainee {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;





    @Override
    public String toString() {
        return "Trainee{" +
                 firstName + " " + lastName+ " (" + birthdate +
                ")}";
    }
}

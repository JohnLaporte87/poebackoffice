package poe.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestTrainee {

    @Test
    void testDefaultConstructor(){
        Trainee trainee = new Trainee();
        System.out.println(trainee);
        System.out.println(trainee.hashCode());
        System.out.println(trainee.getFirstName());
      //  System.out.println(trainee.getFirstName().toUpperCase()); // Null Pointer Exception
        trainee.setFirstName("John");
        System.out.println(trainee.getFirstName());
    }

    @Test
    void testAllArgsConstructor(){
        LocalDate birthdate = LocalDate.of(2000,2,29);
        Trainee trainee = new Trainee("John", "Doe", birthdate);
        assertEquals("John", trainee.getFirstName(), "firstname");
        assertEquals("Doe", trainee.getLastName(), "lastname");
        assertEquals(birthdate, trainee.getBirthdate());
    }

    @Test
    void severalInstances(){
        Trainee trainee1 = new Trainee();
        Trainee trainee2 = new Trainee();
        System.out.println(trainee1);
        System.out.println(trainee2);
    }

    @Test
    void testToString(){
        LocalDate birthdate = LocalDate.of(2000,2,29);
        Trainee trainee = new Trainee("Jane", "Doe", birthdate);
        System.out.println(trainee.toString());
    }

}
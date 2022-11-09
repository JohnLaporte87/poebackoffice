package poe.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TestPoe {

    @Test
    void testDefaultConstructor(){
        Poe poe = new Poe();
        System.out.println(poe);
        assertNull(poe.getTitle());
        assertNull(poe.getBeginDate());
        assertNull(poe.getEndDate());
        assertNull(poe.getPoeType());
    }

    @Test
    void testAllArgsConstructor(){
        String title = "Java Fullstack";
        LocalDate beginDate = LocalDate.of(2000,2,29);
        LocalDate endDate = LocalDate.of(2000,2,29);
        PoeType poeType = PoeType.POEI;
        Poe poe = new Poe(title, beginDate, endDate, poeType);
        //TODO : assert all
        assertEquals (title, poe.getTitle(), "title");
        assertEquals(beginDate, poe.getBeginDate(), "begin date");
        assertEquals(endDate, poe.getEndDate(), "end date");
        assertEquals(poeType, poe.getPoeType(), "poe type");
    }

    @Test
    void testToString(){
        LocalDate beginDate = LocalDate.of(2022,10,24);
        LocalDate endDate = LocalDate.of(2023,1,27);
        Poe poe = new Poe("Fullstack Java", beginDate, endDate, PoeType.POEI);
       // assertEquals("POE {Fullstack Java du 2022-10-24 au 2023-01-27 dans POEI", poe.toString());
        System.out.println(poe.toString());
    }

}
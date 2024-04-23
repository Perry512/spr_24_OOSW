package tests;

import animals.petstore.pet.types.Cat;
import org.junit.jupiter.api.*;
import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Snake;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTests {

    private static Snake actualSnake;
    @BeforeAll
    public static void createAnimals() {

        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.UNKNOWN, Breed.UNKNOWN);

    }

    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTest() {

        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC + "] Actual[" + actualSnake.getAnimalType() + "]");

    }

    @Test
    @Order(1)
    @DisplayName("Snake Speak Sss Tests")
    public void snakeGoesSssTest() {

        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "The snake goes sss sss! " + actualSnake.speak() + "I was expecting Sss Sss!");

    }

    @Test
    @Order(1)
    @DisplayName("Snake scales; is it hypoallergenic?")
    public void snakeHypoAllergenicTests() {

        assertEquals("The snake is hypoallergenic!", actualSnake.snakeHypoallergenic(), "The snake is not hypoallergenic");

    }

    @Test
    @Order(1)
    @DisplayName("Snake has legs test")
    public void legTests() { Assertions.assertNotNull(actualSnake.getNumberOfLegs()); }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test Male")
    public void genderTestMale() {

        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN, Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualSnake.getGender(), "Expecting Male Gender");

    }

    @Test
    @Order(2)
    @DisplayName("Snake breed test Ball")
    public void genderSnakeBreed() {

        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN, Gender.FEMALE, Breed.BALL_PYTHON);
        assertEquals(Breed.BALL_PYTHON, actualSnake.getBreed(), "Expecting Breed Ball Python");

    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak Sss Tests")
    public void snakeGoSssTest() {

        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes sss! sss!", actualSnake.speak(), "I was expecting sss sss!");

    }

    @Test
    @Order(2)
    @DisplayName("Snake leg change test")
    public void addSnakeLeg() {

        actualSnake = new Snake(AnimalType.UNKNOWN, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
        actualSnake.setNumberOfLegs(2);
        assertEquals(2, actualSnake.getNumberOfLegs(), "Was expecting six legs");
    }

    @Test
    @Order(2)
    @DisplayName("Snake type display test")
    public void snakeTypeTest () {

        actualSnake = new Snake(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The type of pet is SNAKE!", actualSnake.typeOfPet(), "Expected: Cat");

    }
}
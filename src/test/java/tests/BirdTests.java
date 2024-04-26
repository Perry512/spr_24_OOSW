package tests;

import animals.petstore.pet.types.Cat;
import org.junit.jupiter.api.*;
import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Bird;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BirdTests {

    private static Bird actualBird;
    @BeforeAll
    public static void createAnimals() {

        actualBird = new Bird(AnimalType.DOMESTIC, Skin.FEATHERS, Gender.UNKNOWN, Breed.UNKNOWN);

    }

    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTest() {

        assertEquals(AnimalType.DOMESTIC, actualBird.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC + "] Actual[" + actualBird.getAnimalType() + "]");

    }

    @Test
    @Order(1)
    @DisplayName("Bird Speak Tweet Tests")
    public void birdGoesTweetTest() {

        assertEquals(AnimalType.DOMESTIC, actualBird.getAnimalType(), "The bird goes tweet tweet! " + actualBird.speak() + "I was expecting Tweet Tweet!");

    }

    @Test
    @Order(1)
    @DisplayName("Bird feathers; is it hypoallergenic?")
    public void birdHypoAllergenicTests() {

        assertEquals("The bird is not hypoallergenic!", actualBird.birdHypoallergenic(), "The bird is not hypoallergenic");

    }

    @Test
    @Order(1)
    @DisplayName("Bird has legs test")
    public void legTests() { Assertions.assertNotNull(actualBird.getNumberOfLegs()); }

    @Test
    @Order(2)
    @DisplayName("Bird Gender Test Male")
    public void genderTestMale() {

        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN, Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualBird.getGender(), "Expecting Male Gender");

    }

    @Test
    @Order(2)
    @DisplayName("Bird breed test Cardinal")
    public void genderBirdBreed() {

        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN, Gender.FEMALE, Breed.CARDINAL);
        assertEquals(Breed.CARDINAL, actualBird.getBreed(), "Expecting Breed Cardinal");

    }

    @Test
    @Order(2)
    @DisplayName("Bird Speak scraa Tests")
    public void birdGoScraaTest() {

        actualBird = new Bird(AnimalType.WILD, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The bird goes scraa! scraa!", actualBird.speak(), "I was expecting scraa");

    }

    @Test
    @Order(2)
    @DisplayName("Bird type display test")
    public void birdTypeTest () {

        actualBird = new Bird(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The type of pet is BIRD!", actualBird.typeOfPet(), "Expected: Bird");

    }

    @Test
    @Order(2)
    @DisplayName("Bird leg change test")
    public void changeBirdLeg() {

        actualBird = new Bird(AnimalType.UNKNOWN, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
        actualBird.setNumberOfLegs(1);
        assertEquals(1, actualBird.getNumberOfLegs(), "Was expecting six legs");
    }

}
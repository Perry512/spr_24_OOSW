package tests;

import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Cat;
import animals.petstore.pet.types.Dog;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CatTests {

    private static Cat actualCat;

    @BeforeAll
    public static void createAnimals()
    {
        actualCat = new Cat(AnimalType.DOMESTIC, Skin.HAIR, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualCat.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualCat.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Cat Speak Prrr Tests")
    public void catGoesMeowTest()
    {
        assertEquals("The cat goes prr! prr!", actualCat.speak(), "I was expecting meow");
    }

    @Test
    @Order(1)
    @DisplayName("Cat Fur is it Hyperallergetic")
    public void catHyperAllergeticTests()
    {
        assertEquals("The cat is not hypoallergenic", actualCat.catHypoallergenic(),
                "The cat is not hypoallergenic");
    }

    @Test
    @Order(1)
    @DisplayName("Cat has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualCat.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Cat Gender Test Female")
    public void genderTestFeMale()
    {
        actualCat = new Cat(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.UNKNOWN);
        assertEquals(Gender.FEMALE, actualCat.getGender(), "Expecting female Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Cat Breed Test BURMESE")
    public void genderCatBreed()
    {
        actualCat = new Cat(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.BURMESE);
        assertEquals(Breed.BURMESE, actualCat.getBreed(), "Expecting Breed Maltese!");
    }

    @Test
    @Order(2)
    @DisplayName("Cat Speak Hiss Tests")
    public void dogGoesGrrTest()
    {
        actualCat = new Cat(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The cat goes Hiss! Hiss!", actualCat.speak(), "I was expecting hiss");
    }

    @Test
    @Order(2)
    @DisplayName("Cat Speak Prr Tests")
    public void catGoesPrrTest()
    {
        actualCat = new Cat(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The cat goes Meow! Meow!", actualCat.speak(), "I was expecting Prr");
    }

    @Test
    @Order(2)
    @DisplayName("Cat type display test")
    public void catTypeTest () {

        actualCat = new Cat(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The type of pet is CAT!", actualCat.typeOfPet(), "Expected: Cat");

    }

    @Test
    @Order(2)
    @DisplayName("Cat leg change test")
    public void addCatLeg() {

        actualCat = new Cat(AnimalType.UNKNOWN, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
        actualCat.setNumberOfLegs(6);
        assertEquals(6, actualCat.getNumberOfLegs(), "Was expecting six legs");
    }
}

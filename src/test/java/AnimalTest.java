import com.company.Animal;
import com.company.Cat;
import com.company.Dog;
import com.company.Pig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AnimalTest {

    @BeforeAll
    public static void init() {
        System.out.println("One time");
    }

    @BeforeEach
    public void initEveryTest() {
        System.out.println("Call me every time");
    }

    @Test
    public void testDog() {
        Animal dog = new Dog();
        Assertions.assertEquals("Dog", dog.whoIam());
    }

    @Test
    public void testCat() {
        Animal cat = new Cat();
        Assertions.assertEquals("Cat", cat.whoIam());
    }

    @Test
    public void testPig() {
        Animal pig = new Pig();
        Assertions.assertEquals("Pig", pig.whoIam());
    }
}

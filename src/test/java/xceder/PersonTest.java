package xceder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Mac
 * Date: 2018-02-05
 * Time: 上午11:18
 */
public class PersonTest {
    private Person person;
    @Before
    public void setUp() {
        person = new Person("小王",22,"家里蹲大学");
    }

    @Test
    public void getName() {
        assertEquals(person.getName(),"小王");
    }

    @Test
    public void getAge() {
        assertEquals(person.getAge(),22);
    }

    @Test
    public void getSchool() {
        assertNotNull(person.getSchool());
    }
}
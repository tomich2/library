package cz.fi.muni.pa165;




import cz.fi.muni.pa165.library.persistance.config.PersistenceContext;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(classes = PersistenceContext.class)
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
public class myTest {


    @Test
    public void searchExistingBottleTest() {
        Assert.assertTrue(true);
    }
}

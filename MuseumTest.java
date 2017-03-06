import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MuseumTest {

  Museum museum;

  @Before
  public void before() {
    museum = new Museum("Natural History Museum");  
  }

  @Test
  public void getBackName() {
    assertEquals( "Natural History Museum", museum.getName() );   
  }

  @Test
  public void countExhibits() {
    assertEquals( 0, museum.countExhibits() );
  }
  

}
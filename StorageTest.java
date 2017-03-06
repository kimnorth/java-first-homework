import static org.junit.Assert.assertEquals;
import org.junit.*;

public class StorageTest {

  Storage storage;

  @Before
  public void before() {  
    storage = new Storage();
  }

  @Test
  public void countStoredExhibits() {
    assertEquals( 0, storage.countStorage() );
  }

  @Test
  public void addExhibitToStorage() {
    assertEquals( 1, storage.countStorage())
  }

  // @Test
  // public void removeExhibitFromStorage(){

  //   assertEquals(0, storage.countStorage() )
  // }
}
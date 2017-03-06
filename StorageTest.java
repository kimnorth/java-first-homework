import static org.junit.Assert.assertEquals;
import org.junit.*;

public class StorageTest {

  Storage storage;
  Exhibits exhibit;

  @Before
  public void before() {  
    storage = new Storage();
    exhibit = new Exhibits();
  }

  @Test
  public void countStoredExhibits() {
    assertEquals( 0, storage.countStorage() );
  }

  @Test
  public void addExhibitToStorage() {
    storage.addExhibit(exhibit);
    assertEquals( 1, storage.countStorage());
  }

  @Test
  public void isStorageFull() {
    storage.addExhibit(exhibit);
    assertEquals( true, storage.isFull() );
  }

  // @Test
  // public void removeExhibitFromStorage(){

  //   assertEquals(0, storage.countStorage() )
  // }
}
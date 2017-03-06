import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MuseumTest {

  Museum museum;
  Exhibits exhibit;
  Storage storage;

  @Before
  public void before() {
    museum = new Museum("Natural History Museum");
    exhibit = new Exhibits();  
    storage = new Storage();
  }

  @Test
  public void getBackName() {
    assertEquals( "Natural History Museum", museum.getName() );   
  }

  @Test
  public void countExhibits() {
    assertEquals( 0, museum.countExhibits() );
  }
  
  @Test
  public void addToExhibits() {
    museum.addExhibit(exhibit);
    assertEquals( 1, museum.countExhibits() );
  }

  @Test
  public void collectionIsFull() {
    museum.addExhibit(exhibit);
    museum.addExhibit(exhibit);
    assertEquals( true, museum.isFull() );
  }

  @Test
  public void transferToCollection() {
    storage.addExhibit(exhibit);
    museum.moveFromStorage(storage, exhibit);
    // System.out.println(storage.archives);
    assertEquals( 1, museum.countExhibits() );
  }
}
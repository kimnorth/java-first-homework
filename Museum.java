class Museum {

  private String name;
  private Exhibits[] collection;

  public Museum(String museum_name) {
    this.name = museum_name;
    this.collection = new Exhibits[10];
  }

  public String getName(){
    return this.name;
  }

  public int countExhibits() {
    int count = 0;
    for (Exhibits exhibit : collection) {
      if (exhibit != null) {
        count++;
      }
    }
    return count; 
  }

}
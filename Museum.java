class Museum {

  private String name;
  private Exhibits[] collection;

  public Museum(String museumName) {
    this.name = museumName;
    this.collection = new Exhibits[2];
  }

  public String getName(){
    return this.name;
  }

  // Count

  public int countExhibits() {
    int count = 0;
    for (Exhibits exhibit : collection) {
      if (exhibit != null) {
        count++;
      }
    }
    return count; 
  }

  // Add

  public void addExhibit(Exhibits new_exhibit) {

      if (isFull()){
        return;
      }

      int index = this.countExhibits();
      collection[index] = new_exhibit; 
  }

  public boolean isFull() {
    return countExhibits() == collection.length;
  }

  public void moveFromStorage(Storage storage, Exhibits exhibit) {
    storage.removeExhibit();
    this.addExhibit(exhibit);
  }

}
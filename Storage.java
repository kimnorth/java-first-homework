class Storage {

  private Exhibits[] archives;

  public Storage() {
    this.archives = new Exhibits[1];
  }

  public int countStorage() {
    int count = 0;
    for (Exhibits exhibit : archives) {
      if (exhibit != null){
        count++;
      }
    }
    return count;
  }

  public void addExhibit(Exhibits new_exhibit) {

    if (isFull()) {
      return;
    }

    for (Exhibits exhibit : archives) {
      int index = this.countStorage();
      archives[index] = new_exhibit;
    }
  }

  public boolean isFull() {
    return countStorage() == archives.length;
  }

  public void removeExhibit() {
    
    for (Exhibits exhibit : archives) {
      
      int index = this.countStorage();
      archives[index - 1] = null;      

    }
  }

}

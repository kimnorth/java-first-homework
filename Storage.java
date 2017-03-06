class Storage {

  private Exhibits[] archives;

  public Storage(){
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

  // public void removeExhibitFromStorage() {
  //   for (Exhibits exhibit : archives) {

  //   }
  // }

}

// try hard-coding the number of exhibits then working way back
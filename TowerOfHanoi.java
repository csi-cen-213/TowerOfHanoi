public class TowerOfHanoi{
  // Properties
  private int numberOfDiscs;
  public int[][] towers;
  
  // Constructors
  public TowerOfHanoi(int numberOfDiscs) {
    this.numberOfDiscs = numberOfDiscs;
    this.towers = new int[numberOfDiscs][3];
    for (int i = 0; i < numberOfDiscs; i++) {
      this.towers[i][0] = i+1;
    }
  }
  
  public TowerOfHanoi() {
    this.numberOfDiscs = 3;
    this.towers = new int[3][3];
    for (int i = 0; i < numberOfDiscs; i++) {
      this.towers[i][0] = i+1;
    }
  }
  
  //METHODS
  public void print(){
    for (int i = 0; i < this.numberOfDiscs; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(this.towers[i][j]); 
      } 
      System.out.println();
    }
  }

  // Finds index of top of tower
  public int topDisc(int tower, int index) {
    if (this.towers[index][0] > 0) { 
      return(index);
    }
    else {
      topDisc(tower, index+1);
    }
    return (index);
  }
  
  // polymorphic version of recursive topDisc method
  // to not have to pass starting index
  public int topDisc(int tower) {
    return this.topDisc(tower, 0);
  }
  
  public static void main(String [ ] args) {
    TowerOfHanoi tower = new TowerOfHanoi(4);
    tower.towers[0][0] = 0;
    tower.print();
    
    System.out.println(tower.topDisc(0));
  }
}
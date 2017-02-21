public class TowerOfHanoi{
  // Properties
  private int numberOfDiscs;
  private int[][] towers;
  
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


  
  public static void main(String [ ] args) {
    TowerOfHanoi tower = new TowerOfHanoi();
    tower.print();
  }
}
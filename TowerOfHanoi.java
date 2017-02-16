public class TowerOfHanoi{
  // Properties
  private int numberOfDiscs;
  private int[][] towers;
  
  // Constructors
  public TowerOfHanoi(int numberOfDiscs) {
    this.numberOfDiscs = numberOfDiscs;
    this.towers = new int[numberOfDiscs][3];
  }
  
  public static void main(String [ ] args) {
    TowerOfHanoi tower = new TowerOfHanoi(4);
  }
}
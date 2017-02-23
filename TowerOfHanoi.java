public class TowerOfHanoi{
  // Properties
  public int numberOfDiscs;
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
    // if the tower is empty, return -1
    if (index >= this.numberOfDiscs) {
      return(-1);
    }
    // if we find the top disc, return its index
    if (this.towers[index][tower] > 0) { 
      return(index);
    }
    // otherwise, step down the tower looking for discs
    else {
      return topDisc(tower, index+1);
    }
  }
  
  // polymorphic version of recursive topDisc method
  // to not have to pass starting index
  public int topDisc(int tower) {
    return this.topDisc(tower, 0);
  }
  
  public void moveDisc(int source, int destination) {
    // TODO: make sure responds properly to:
    // moving from empty tower to other tower
    // moving if user tries to put something on top
    // of full tower
    int topDiscOfSource = this.topDisc(source);
    int topDiscOfDestination = topDisc(destination);
    // if the destination tower is empty, put it on
    // bottom
    if (topDiscOfDestination < 0) {
      this.towers[this.numberOfDiscs-1][destination] =
        this.towers[topDiscOfSource][source];
    }
    else {
      this.towers[topDisc(destination)-1][destination] =
        this.towers[topDiscOfSource][source];
    }
    this.towers[topDiscOfSource][source] = 0;
  }
  
  public void moveTower(int discs, int source, int spare, int goal){
    if (discs == 1) {
        moveDisc(source, goal);
    }
    else {
        moveTower(discs - 1, source, goal, spare);
        moveDisc(source, goal);
        moveTower(discs - 1, spare, source, goal);
    }
  }
  
  
  public static void main(String [ ] args) {
    TowerOfHanoi tower = new TowerOfHanoi(4);
    tower.print();
    tower.moveTower(4, 0, 2, 1);
    System.out.println();
    tower.print();

  }
}
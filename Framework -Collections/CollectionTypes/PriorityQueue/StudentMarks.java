package CollectionTypes.PriorityQueue;

public class StudentMarks implements Comparable<StudentMarks> {

  private int maths;
  private int physics;

  public int getMaths() {
    return maths;
  }

  public int getPhysics() {
    return physics;
  }

  public StudentMarks(int maths, int physics) {
    super();
    this.maths = maths;
    this.physics = physics;
  }

  @Override
  public String toString() {
    return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
  }

  @Override
  public int compareTo(StudentMarks o) {
    // if (this.maths > o.maths)
    // return 1;
    // if (this.maths < o.maths) {
    // return -1;
    // }
    // if (this.maths == o.maths) {
    // return 0;
    // }
    // ** below is same as above
    System.out.println("compare to callled.");
    return o.maths - this.maths; // for ascending orderP

  }

}

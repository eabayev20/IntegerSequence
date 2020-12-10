import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;
  public ArraySequence (int [] other ) {
    while (other.hasNext()) {
      data.add(other.hasNext());
    }

  }
  public ArraySequence (IntegerSequence otherseq) {
    l = new int[otherseq.length()];
    for(int i = 0; i < otherseq.length(); i++) {
      l[i] = otherseq.next();
    }
    currentIndex = 0;
    otherseq.reset();
  }




}

import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;
  public ArraySequence(int [] other){
    currentIndex = 0;
    data = other;
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

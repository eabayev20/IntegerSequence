import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){  }
  public void reset(){
      current = start;
  }
  public int length(){
  return start - end;  }
  public boolean hasNext(){
  return current != end;
 }

  //@throws NoSuchElementException
  public int next(){
  if (current >= end) {
    throw new NoSuchElementException("Number " + current + "is the end!");
  }
  else {
    current = current + 1;
  }

  }

}

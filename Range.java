import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start,  int end){

    try{

      if(!(start<=end)){
        throw new IllegalArgumentException("Start number is too high");
      }
      this.start=start;
      this.end=end;
      current = start;
    }
    catch(IllegalArgumentException e){
      throw new IllegalArgumentException("Start number is too high");
    }


  }
  public void reset(){
      current = start;
  }
  public int length(){
  return start - end;
 }
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

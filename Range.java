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
    return end-start+1;
  }

  //When current is no longer a valid element in the range, it should return false.
  public boolean hasNext(){
    return(current <=end);
  }

  //@throws NoSuchElementException
  public int next(){
    int temp = current;
    try{
      if(current>end){
        throw new NoSuchElementException("Value is too high");
      }
      current++;
    }catch(NoSuchElementException e){
      throw new NoSuchElementException("Value is too high");
    }
     return temp;
  }

}

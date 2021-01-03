import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;
  public ArraySequence(int [] other){
    currentIndex = 0;
    data = new int[other.length];
    for(int i = 0; i < other.length; i++){
      data[i] = other[i];
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
public ArraySequence(IntegerSequence otherseq){
    otherseq.reset();
    data = new int[otherseq.length()];
    for(int i =0; i < otherseq.length(); i ++){
      data[i]=otherseq.next();
    }
    currentIndex=0;
    otherseq.reset();
  }
  public void reset(){
      currentIndex = 0;
    }
    public int length(){
      return data.length;
    }


    public boolean hasNext(){
      return currentIndex < data.length;
    }
    public int next(){
        int temp = currentIndex;
        try{
          if(currentIndex>=data.length){
            throw new NoSuchElementException("Current must not be greater than end");
          }
          currentIndex++;
        }catch(NoSuchElementException e){
          throw new NoSuchElementException("Current must not be greater than end");
        }
         return data[temp];
      }

}

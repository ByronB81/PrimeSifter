import java.util.ArrayList;
import java.util.List;

public class PrimeSifter {

  public List<Object> runSift(int countUpTo){
    List<Object> result = new ArrayList<Object>();
    for (int i = 1; i <= countUpTo; i++){
      result.add(i);
    }
    return result;

  }

}

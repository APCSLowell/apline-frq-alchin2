public class APLine
{
  private int aVal, bVal, cVal;
  private double slope;
  public APLine(int a, int b, int c){
    aVal = a;
    bVal = b;
    cVal = c;
    slope = (double)-a/(double)b;
  }
  public double getSlope(){
    return slope;
  }
  private boolean isOnLine(int x, int y){
    return ((aVal*x+bVal*x-cVal)==0);
  }
  
}

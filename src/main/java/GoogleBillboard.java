
  public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
  public static void main(final String[] args) {
    int baka = 0;
    int i = 0;
    String digits = e.substring(2+i,12+i);
    double dNum = Double.parseDouble(digits);
  while (isPrime(dNum) == false) {
    i++;
    digits = e.substring(2+i,12+i);
    dNum = Double.parseDouble(digits);
  }
  baka = i;
    System.out.println(e.substring(2+baka,12+baka));
  }
  

  //Finish this function
  public static boolean isPrime(double d){
    for (int i = 2; i<Math.sqrt(d); i++) {
      if (d%2 == 0)
      return false;
    }
    return true;
  }

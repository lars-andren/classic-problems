/**
 * Calculat the number of bits in order to convert integer a to integer b.
 * Could also use StringUtils, if Apache Commons is available.
 */
public int convertInteger(int a, int b) {

  int xOR = a ^ b;
  
  String xORInBinary = Integer.toString(xOR, 2);
  
  return xORInBinary.length() - xORInBinary.replace("1", "").length();
}

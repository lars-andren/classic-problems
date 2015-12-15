/**
 * Calculat the number of bits in order to convert integer a to integer b.
 */
public int convertInteger(int a, int b) {

  return Integer.bitCount(a ^ b);
}

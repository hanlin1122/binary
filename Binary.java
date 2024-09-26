class Binary{
  private int[] data;
  
  public Binary(){
    data = new int[8];
  }
  public Binary(int n){
    data = new int[n];
  }
  public Binary(int[] a){
    data = a;
  }
  public String toString(){
    String str = "";
    for(int i = 0; i < data.length; i++){
      str += data[i];
    }
    return str;
  }
  public int decimal(){
    int a = 1;
    int b = 0;
    for (int x = data.length-1; x >= 0; x--) {
      b += data[x]*a;
      a*=2;
    }
    return b;
  }
  public int twosComplement() {
    int a = 0;
    int pot = 1;
    for (int x = data.length-1; x >= 1; x--) {
      a += data[x]*pot;
      pot*=2;
    }
    a -= data[0]*pot;

    return a;
  }

  public static int[] subarray(int[] a, int start, int stop) {
    int[] b = new int[stop-start];
    for (int x = start; x < stop; x++) {
      b[x-start] = a[x];
    }

    return b;
  }

  public double doubleBinary(int a) {
    int[] b = new int[a];
    int[] c = new int[data.length-a];
    for (int x = 0; x < a; x++) {
      b[x] = data[x];
    }
    for (int x = a; x < data.length; x++) {
      c[x-a] = data[x];
    }

    int exponent = twosComplementF(b);
    int mantissa = twosComplementF(c);

    return mantissa * Math.pow(2, exponent);
  }

  public int twosComplementF(int[] f) {
    int a = 0;
    int pot = 1;
    for (int x = f.length-1; x >= 1; x--) {
      a += f[x]*pot;
      pot*=2;
    }
    a -= f[0]*pot;

    return a;
    return b;
  }
}

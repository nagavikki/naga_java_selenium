 class CastingConversion {

public static void main(String[] args){
//type casting / narrow casting/ manual casting
    int a = 1799;
    byte b = (byte)a;
    /* Java's byte is 8 bits signed, meaning it can hold values from -128 to +127.
     * 1799 ÷ 256 = 7 (remainder 7)*/
   System.out.println(b);

   float f = 3567.789f;
   long lo = (long)f;
   System.out.println(lo);

//type conversion / wide casring/ automatic casting

    byte e = 125;
    int c = e;
    System.out.println(c);

//type promotion 
    byte x = 120;
    byte y = 121;
    //byte z = (x*y);
    int z = (x*y);
    System.out.println(z);

}         
}

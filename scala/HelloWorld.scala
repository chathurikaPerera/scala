
object HelloWorld
{
   def main(args:Array[String])
   {
     println(convert(35));
     println(volume(5));
     println(price(60));

   }
   //question 1
   def convert(x:Double)=x*1.8+32;
   //question 2
   def volume(r:Double)=(4/3.0)*math.Pi*(r*r*r);
   //question 3
   def price(y:Int) : Double = {

     var total:Double=y*24.95;
     var discount:Double=y*0.4;
     var shipping : Double=3*y + 0.75*(y-50);
     var sum : Double= total-discount+shipping;
     return sum;

   }

}

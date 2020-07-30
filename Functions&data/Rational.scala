

object Rational extends App{
  val r1= new rational(3,4);
  val r2= new rational(5,8);
  val r3=new rational(2,7);
  val x=(r1-r2)-r3;
  println(r1);
  println(r2);
  println(x);
  println(r1.neg);
  
}
class rational(n:Int, d:Int)
{
  require(d>0,"d must be greater tha 0");
  def numer=n/gcd(n,d);
  def denom=d/gcd(n,d);
  
  def this(n:Int)=this(n,1);
  
  private def gcd(a:Int, b:Int):Int= if(b==0) a else gcd(b, a%b);
  
  def +(r:rational)=new rational(this.numer*r.denom+this.denom*r.numer,this.denom*r.denom);
  
  //question 01
  def neg=new rational(-this.numer,this.denom);  
  
  
  //question 02
  def -(r:rational)=this+r.neg;
  
  override def toString = numer+"/"+denom;
}
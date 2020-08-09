import scala.math._

object MyApp extends App {
  val p1 = point(2,3);
  val p2 = point(5,6);
  val p3 = p1+p2;
  val p4 = p1.move(2, 2);
  val p5=p1.distance(p2);
  val p6 = point(3,-7);
  val p7= p6.invert;
  
  println(p1);
  println(p2);
  println(p1==p2);
  println(p3);
  println(p4);
  println(p5);
  println(p7);
  
  
}
case class point(a:Int, b:Int)
{
  def x:Int=a;
  def y:Int=b;
  
  
  //question 1 
  def +(p:point)= point(this.x+p.x,this.y+p.y)
  
  //question 2
  def move(dx:Int,dy:Int)=point(this.x+dx, this.y+dy)
  
  //question 3
  def distance(p:point)= sqrt(pow((this.x-p.x),2) + pow((this.y-p.y),2))
  
  
  //question 4
  def invert= point(this.y,this.x)
  


}
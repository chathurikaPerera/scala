package first

object assignment2 {
  def main(args:Array[String])
  {
    //println(normal(40));
    //println(OT(20));
    //println(salary(40,20));
    //println(tax(salary(40,20)));
    println("total income is: "+income(40,20));
    //println(people(20));
    //println(charge(20));
    //println(cost(20));
    println(profit(20)); 
    println(profit(10));
    println(profit(15));
  }
  
  //question 1
  def normal(h:Int): Int= h*150;
  def OT(h:Int) : Int =h*75;
  def salary(x1:Int,x2:Int): Int = normal(x1)+OT(x2);
  def tax(y:Int): Int= (y*0.1).toInt;
  def income(x1:Int, x2:Int):Int =salary(x1,x2)-tax(salary(x1,x2));
    
  
  // question 2
  def people(p:Int) : Int= 120 +(15-p)/5*20;
  def charge(p:Int):Int= people(p)*p;
  def cost(p:Int):Int=500+people(p);
  def profit(p:Int):Int=charge(p)-cost(p);
  
}
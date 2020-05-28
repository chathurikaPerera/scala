package first.assignment3

object scala {
  def main(args:Array[String])
  {
      println(primeNum(5));
      println(sum(5));
      println(oddEven(6));
      println(addven(8));
      fiboSeq(10);
      primeSeq(10);
  }
  
  //question 1
  
   def gcd(x:Int, y:Int):Int=y match
  {
    case 0 => x // base case
    case y if(y>x) => gcd(y,x)
    case _ => gcd(y,x%y)
  }
   def primeNum(p:Int, n:Int=2):Boolean=n match
   {
     case x if(x==p) => true;
     case x if(gcd(x,p))>1 => false
     case x => primeNum(p,n+1)
     
   }
   
   
   //question 2
   
   def primeSeq(b:Int):Any=
   {
     if(b>2) primeSeq(b-1)
     if(primeNum(b)==true) println((b))
    
   }
   
   //question 3
   
   def sum(x:Int):Int= x match
   {
     case 1=> x
     case _ => x+sum(x-1)
   }
   
   
   //question 4
   def oddEven(x:Int): Any= x match
   {
     case x if(x==1) => "Odd"
     case x if(x==0) => "Even"
     case _ => oddEven(x-2)
   }
   
   
   //question 5
   
   def addven(x:Int):Int=
   {
     if(x<0) 0
     else
     {
       if(x%2==1) addven(x-1)
       else x+addven(x-1)
     }
   }
   
   
   
   //question 6
   def fibo(x:Int):Int= x match
   {
     case x if(x==0) => 0
     case x if(x==1) => 1
     case x =>fibo(x-1)+fibo(x-2)
   }
   
   def fiboSeq(x:Int):Any=
   {
     if(x>0) fiboSeq(x-1)
     println(fibo(x))
     
   }
   
}


object MyApp extends App{
  
  val b1=new BankAccount("1111111", 200000.0);
  val b2=new BankAccount("1111112", 5000.0);
  val b3=new BankAccount("1111113", -70.0);
  val b4=new BankAccount("1111114", 80000.0);
  val b5=new BankAccount("1111115", -3.0);
  
  val bank:List[BankAccount]=List(b1,b2,b3,b4,b5);
  println(b1);
  val y1= b2.deposite(550);
  println(y1);
  val y2=b1.transfer(b2,550);
  println(y2);
  
  val find=(n:String, acc:List[BankAccount])=>acc.filter(x=>x.accountNum.equals(n));
  
  val y3=find("1111114",bank);
  println(y3);
  
  //question 04-1
  val negBalance=(acc:List[BankAccount])=>acc.filter(x=>x.balance.<(0));
  val y4=negBalance(bank);
  println(y4);
  
  //question 04-2
  val totalBalance=(acc:List[BankAccount])=>acc.reduce((x,y)=>(new BankAccount(x.accountNum, x.balance+y.balance)));
  val y6=totalBalance(bank);
  println("total balance is "+y6.balance);
 
 
    
  
  
  
  //question 04-3
val interest=(acc:List[BankAccount])=>acc.filter(x=>x.balance.<(0)).map(x=>x.balance+x.balance*0.1);
val y5=interest(bank);
println(y5);

val interestspos=(acc:List[BankAccount])=>acc.filter(x=>x.balance.>(0)).map((x=>x.balance+x.balance*0.05));
val y7=interestspos(bank);
println(y7);

val total=(acc:List[BankAccount])=>acc.map(x=>{
   if(x.balance<0)(new BankAccount(x.accountNum,x.balance+x.balance*0.1)) else (new BankAccount(x.accountNum,x.balance+x.balance*0.05));
 
 })
 val y8=total(bank);
 println(y8);

}

//question 03
class BankAccount(a:String, b:Double) 
{
   def accountNum=a;
   def balance=b;
   
   def deposite(m:Double)=new BankAccount(this.accountNum , this.balance+m);
   
   def withdraw(m:Double)=new BankAccount(this.accountNum , this.balance-m);
   
   
   def transfer(acc:BankAccount, m:Double)= acc.deposite(m);
   
   
   
    
   def getAccont= new BankAccount(this.accountNum, this.balance);
   
  
   
   override def toString = accountNum+" balance is "+balance;
   
}

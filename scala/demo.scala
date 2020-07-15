

object demo {
  def main(args:Array[String])
  {
    
    val cases=(f1:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(f1(_,key,a));
    val encrypt =(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
    val decrypt =(c:Char, key:Int,a:String)=>{
      if((a.indexOf(c.toUpper)-key)<0)
      {
        a((a.indexOf(c.toUpper)-key+a.size)%a.size)
      }
      else
      {
        a((a.indexOf(c.toUpper)-key)%a.size)
      }
        
    }
    
    val alphabet="ABCDEFGHIJKLMOPRSTUVWXYZ";
    //val text ="Hello";
    val x= cases(encrypt,"Hello",5,alphabet);
    
    println(x);
    val y = cases(decrypt,x,5,alphabet);
    println(y);
    
  }
 
  
}
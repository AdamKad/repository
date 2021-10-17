def mniejsze(list:List[Int],liczba:Int):Boolean=
    if(list==Nil) true

    else if(list.head >=liczba)  false
 else mniejsze(list.tail,liczba)

 
 mniejsze(List(1,6,2,3,4),9)
 mniejsze(List(1,6,2,3,4),4)
 mniejsze(List(1,6,2,3,4),7)
 mniejsze(List(1,6,2,3,4),1)
 
 
 // T,F,T,F
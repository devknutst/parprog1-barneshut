

val n = List((1,2),(2,3),(3,3),(1,4))

n.foldLeft((0,0))((b,a) => (b._1 + a._1, b._2+a._2) )
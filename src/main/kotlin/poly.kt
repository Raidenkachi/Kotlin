open class shape{
    open fun area(){
        println("I am in area")
    }
}

class circle:shape(){
    override fun area(){
        println("I is area")
    }
}
class triangle:shape(){
    override fun area(){
        println("I and area")
    }
}
class rectangle1:shape(){
    override fun area(){
        println("I about area")
    }
}
fun main(){
    var c=circle()
    c.area()
    var t=triangle()
    t.area()
    var r=rectangle1()
    r.area()
}


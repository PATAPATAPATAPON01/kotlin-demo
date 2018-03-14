package chapter1

/**
 * Created with IntelliJ IDEA.
 * User: za-lvjian
 * Date: 2018/3/14 10:54
 * DESC:
 */


fun main(args: Array<String>) {
    println("hello world!~")
//    println(sum(1, 2))
//    printSum(2, 2)
//    println(vars(1, 2, 3, 4, 5))

    val sumLambda: (Int, Int) -> Int = { x: Int, y -> x + y }
    //lambda匿名函数,输入类型是int,输出类型也是int
    println(sumLambda(1, 100))
    println(ee.javaClass)
}


fun sum(a: Int, b: Int) = { a + b }//返回类型自动推断
fun sum1(c: Int, d: Int): Int = c + d


fun printSum(e: Int, f: Int) = println(e + f)


/**
 * 1.函数体是个结构块要用花括号包起来，要写return
 * 2.只有一个表达式，使用等号，类型可以推断
 */

fun vars(vararg v: Int): Int {
    for (vt in v) {
        println(vt)
    }
    return 1
}


fun sewee(ok: Int): Int {

    return 1

}

var ee: Int = 1
var b = false

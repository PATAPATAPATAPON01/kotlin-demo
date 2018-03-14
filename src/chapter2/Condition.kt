package chapter2

/**
 * Created with IntelliJ IDEA.
 * User: za-lvjian
 * Date: 2018/3/14 17:09
 * DESC:
 */
fun main(args: Array<String>) {


    var x = 0
    when (x) {
        0, 1 -> println("x==0 or x==1")
        else -> println("otherwise")
    }

    when (x) {

        1 -> println("x==1")
        2 -> println("x==2")
        else -> {
            println("x 不是1,也不是2 ")
        }

    }
}


fun testWhen(x: Any) {

    when (x) {

        is String -> println("这是字符串")
        else -> println("不是字符串")
    }

}
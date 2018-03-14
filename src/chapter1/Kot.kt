package chapter1

/**
 * Created with IntelliJ IDEA.
 * User: za-lvjian
 * Date: 2018/3/14 11:59
 * DESC:
 */

fun main1(array: Array<String>) {

    var a = 1
    val s1 = "a is $a"

    a = 100
    val s2 = "${s1.replace("is", "was ")},but now is $a"

    println(s1)

    println(s2)

    var age: String? = "23"

    val ages = age!!.toInt()

    val ages1 = age?.toInt()

    println(ages1)

    var param = null
    val ages2 = param?.toInt() ?: -1
    println(ages2)


    var p1: String? = null

    println(p1)
}

fun main(args: Array<String>) {
//    if (args.size < 2) {
//        print("Two integers expected")
//        return
//    }
//    val x = parseInt(args[0])
//    val y = parseInt(args[1])
//    // 直接使用 `x * y` 会导致错误, 因为它们可能为 null.
//    if (x != null && y != null) {
//        // 在进行过 null 值检查之后, x 和 y 的类型会被自动转换为非 null 变量
//        print(x * y)
//    }
    println(testDigitalValue())

    testArray()
}


fun getStringLength(obj: Any): Int? {


    if (obj !is String) {
        return null
    }
    return obj.length

}

fun testRange() {


    println("循环输出:")
    for (i in 1.rangeTo(4)) print(" = ".plus(i))
    println()
    println("设置步长")
    for (i in 1..4 step 2) print(i)
    println()
    println("使用downTo")
    for (i in 4 downTo 1 step 2) print(i)
    println("使用until")
    for (i in 1 until 10) print(i)
}


fun testType() {

    val a: Int = 1000
    println(a === a) //比较地址
    val boxedA: Int? = a
    val boxedB: Int? = a

    println(boxedA === boxedB)
    println(boxedA == boxedB)

    var b: Char = '1'


}

fun testii() {
    val b: Byte = 1

    val p2 = 1L + 3
    println(p2.javaClass)
}

fun testBit() {
    val a: Int = 1

    println(a.shl(1))
    println(a.shr(2))
    println(a.and(1))
    println(a.or(2))
    println(a.xor(3))
}

fun testDigitalValue(): Int {
    val c = '1'
    if (c !in '0'.rangeTo('9')) {
        throw IllegalArgumentException("out of Range")
    }
    return c.toInt() - '0'.toInt()
}


fun testArray() {

    val a = arrayOf(1, 2, 3)
    val b = Array(3, { i -> i * 2 })
    println(a)
    println(b)


    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    println(x[0])

    val text = """

 -多行字符串
    -菜鸟教程
    -多行字符串
    -Runoob
"""
    println(text.trimMargin("-"))
}

public fun fewfwe(): Int = 1
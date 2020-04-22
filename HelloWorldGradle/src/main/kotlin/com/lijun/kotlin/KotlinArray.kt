package com.lijun.kotlin

/**
 * kotlin数组
 *                  Kotlin          Java
 * 整型           IntArray        int[]
 * 整形装箱       Array<Int>      Integer[]
 * 字符          CharArray        char[]
 * 字符装箱       Array<Char>     Character[]
 * 字符串        Array<String>    String[]
 * */
fun main() {
//    创建数组
    val c0 = intArrayOf(1, 2, 3, 4, 5)
//    lambda表达式，5代表数组长度，it的值为数组下标
    val c1 = IntArray(5){it + 1}
//    打印数组内容
    println(c1.contentToString())

//    打印数组长度
    println(c1.size)

//    数组的读写
    val d = arrayOf("Hello", "World");
    val e:Array<String> = arrayOf("Hello", "World")
    e[1] = "Kotlin"
    println("${e[0]}, ${e[1]}")

//    数组的遍历
    val f = floatArrayOf(1f, 3f, 5f, 7f)
    for (element in f) {
        println(element)
    }
//    或者函数式写法
    f.forEach { element ->
        println(element)
    }

//    判断元素是否存在数组中
    if (1f in f) {
        println("1f exists in variable f")
    }
//    取反
    if (1f !in f) {
        println("1f does not exist in variable f")
    }

}
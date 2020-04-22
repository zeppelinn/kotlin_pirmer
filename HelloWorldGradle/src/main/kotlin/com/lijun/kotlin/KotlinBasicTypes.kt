package com.lijun.kotlin

/**
 * Kotlin可以进行类型推导，声明变量时无需显式的注明变量类型
 * */
fun main() {
//    整型
    var a = 2
//    字符串类型
    var b = "Hello World"
//    长整型
    var c = 1234567890L
//    浮点型
    var float1 = 1f
//    double型
    var double1 = 1.0

//    字符串模板
    println("Range of Int: [${Int.MIN_VALUE}, ${Int.MAX_VALUE}]")

    val k = "Today is a sunny day."
    val m = String("Today is a sunny day.".toCharArray())
//    == 在kotlin中表示比较变量内容，相当于java的equals
    println(k == m)
//    === 在kotlin中表示比较变量引用
    println(k === m)

//    Raw String
    val n = """
        <!doctype html>
        <html>
            <head>
                <meta charset="UTF-8"/>
                <title>Hello World</title>
            </head>
            <body>
                <div id="container">
                    <H1>Hello World</H1>
                    <p>This is a demo page.</p>
                </div>
            </body>
        </html>
    """.trimIndent()
    println(n)
}
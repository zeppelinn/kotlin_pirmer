package com.lijun.kotlin

fun main() {
//    闭区间的创建
    val intRange = 1..10        // [1, 10]
    val charRange = 'a'..'z'
    val longRange = 1L..100L

//    开区间的创建
    val intRangeExclusive = 1 until 10  //   [1, 10)
    val charRangeExclusive = 'a' until 'z'
    val longRangeExclusive = 1L until 100L

//    倒序区间(闭区间)
    val intRangeReverse = 10 downTo 1   // [10, 1]
    val chatRangeReverse = 'z' downTo 'a'
    val longRangeReverse = 100L downTo 1L

//    控制区间的步长
    val intRangeWithStep = 1 .. 10 step 2   // [1, 3, 5, 7, 9]
    val charRangeWithStep = 'a'..'z' step 2
    val longRangeWithStep = 1L..100L step 5

}
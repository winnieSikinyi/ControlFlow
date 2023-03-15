fun main() {
randomInt()
//2
    var z = names(arrayOf("channel","luivuiton","losangelos","rollsroyce","mitsubishi"))
    println(z)
//3
    ( robotDrink(6))
    (robotDrink(13))
    (robotDrink(20))
//4
    digit()
    digit()
    digit()


}
//1. Create a function that prints out all the odd numbers between 1 and 100
//
fun randomInt(){
  for (num in 1..100) {
       if (num % 2 != 0) {
           println(num)
       }
       }


      }

// 2.Create a function that takes in an array of names and returns the number of
//names longer than 5 characters

fun names(brands: Array<String>):Int{

    var total = 0

    for (x in brands) {
        if (x.length>5){

            total++

        }
}
      return total
    }

fun robotDrink(humanAge: Int){
    when(humanAge){
       in 0..6 -> println("milk")

        in 7..15 ->  println("fanta")

        else -> println("cocacola")

    }
}

//
// 4//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.

//fun numbers

//for (n in 1..10){
//    println(n)
//}

fun digit(){
    for (n in 1..100){
        if ( n % 3 == 0){
            println("Fizz")
            }
        else if(n % 5 == 0){
            println("Buzz")
        }
        else if (n%3==0 && n%5==0){
            println("FizzBuzz")

    }

    }




}



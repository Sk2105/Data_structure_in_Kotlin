fun main() {
    // Input Total Elements of array
    print("Enter Your Total Elements : ")
    var size = readLine()!!.toInt()
    array(size) // call array function
}
// create array function
fun array(size: Int) {
    // create Intarray in array function
    var arr = IntArray(size)
    // run for loop (0<size) time
    for (i in 0 until size) {
        // input arr Elements
        print("Enter Your ${i+1} Elements : ")
        // arr[i] = input data
        arr[i] = readLine()!!.toInt()
    }
    run(arr, size) // call run function and run array
}
// create run function
fun run(arr: IntArray, size: Int) {
    // run for loop (0<size)times
    println("Print Array")
    for (i in 0 until size) {
        println("$i -> ${arr[i]}")
    }
}

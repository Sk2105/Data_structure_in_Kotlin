fun main() {
    // call in node class in node variable
    var node = Node(null)
    // input total size on linkedlist
    print("Enter Your Total Number : ")
    var size = readLine()!!.toInt()
    node.LL(size)
}
// create a Node class
class Node {
    var data: Int?
    var next: Node?
    var head: Node? = null
    // create a Node constructor
    constructor(data: Int?) {
        this.data = data
        this.next = null
    }
    // create a LL function in Node class
    fun LL(size: Int) {
        for (i in 0 until size) {
            // input LL data
            print("Enter Your $i Data : ")
            var data = readLine()!!.toInt()
            var new_Node = Node(data)
            // new_node -> head
            new_Node.next = head
            // head = new_Node
            head = new_Node
        }
        printLL() // call printll function and print LinkedList
    }
    // create a printll function in node class
    fun printLL() {
        // define temp = head
        var temp = head
        println("Print LinkedList")
        while (temp != null) {
            // print temp data
            print("${temp.data} ->")
            // temp -> temp.next
            temp = temp.next
        }
        print("null")
    }
}

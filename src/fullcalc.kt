fun main(){
    var num1 = ""
    var num2 = ""
    var oper = ""
    fun checknum(num: String): Int{
        try {
            return num!!.toInt()
        }
        catch(e: Exception){
            return 0
        }
    }
    fun calc(num1: Int, oper: String, num2: Int): Float{
        when{
            oper == "*" -> return num1.toFloat() * num2
            oper == "+" -> return num1.toFloat() + num2
            oper == "-" -> return num1.toFloat() - num2
            oper == "/" -> return num1.toFloat() / num2
            else -> return 0.0f
        }
    }
    while (true){

        print("Enter your first number: ")
        num1 = readLine()!!.toString()
        println(num1)
        print("Enter operand: ")
        oper = readLine()!!.toString()
        println(num1 + oper)
        print("Enter your second number: ")
        num2 = readLine()!!.toString()

        if(num2!="0"){
        if(checknum(num1)!=0&&checknum(num2)!=0) {
            if (oper=="*"||oper=="/"||oper=="+"||oper=="-"){
                println(num1 + oper + num2 + " = "+ calc(num1.toInt(),oper,num2.toInt()))
            }
            else{
                println("The operand you've typed is invalid!")

         }

        }
        else{
            println("Only numbers accepted!")
        }}
    else{
        println("You cannot divide by zero!")
    }}
}
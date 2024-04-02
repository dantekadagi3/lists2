//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
   val fruits= mutableListOf("Mango","Apple","Pineapple","pears")
    fruits.add("Banana")
    fruits.remove("pears")
    if(fruits.contains("Mango")){
        println("Has mango")
    }else{
        println("No mangoes")
    }
    //using a for loop to print out items in the list
    for(item in fruits){
        println(item)
        if(item=="Apple")
            break
    }
    //modifying the index of an item in a for loop
    for(item in 0 until fruits.size){
        println("item ${fruits[item]} is at index $item")
    }
}
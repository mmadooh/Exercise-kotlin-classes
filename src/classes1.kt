fun main() {
    //println("Hello World!")

    val myBook = Book(title = "Great Gatsby ")
    myBook.author = "Walsh"
    myBook.yearPublished = 2005
    myBook.getBookInfo()
}

class Book (var title: String = ""){
    var author: String = ""
    var yearPublished: Int = 0

    fun getBookInfo(){
        println("$title by $author ($yearPublished)")
    }
}


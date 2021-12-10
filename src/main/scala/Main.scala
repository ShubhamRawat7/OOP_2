class Difference(var name: String, var age: Int) extends Ordered[Difference] {
  def compare(that: Difference): Int = {
    this.name compare that.name match {
      case 0 => {
        if (this.age.equals(that.age))
          println("True\nBoth Person have their name and age same")
        else
          println("False\nBoth Person do not have their name and age same");
        0
      }
      case other => {
        if (this.name.length.equals(that.name.length) && this.age.equals(that.age))
          println("True");
        else
          println("False");
        1
      }
    }
  }
}

object Difference extends App {
  var personOne = new Difference("Girish Kumar Goyal", 21)
  var personTwo = new Difference("Shivam Pateriya", 22)
  personOne compare personTwo
}
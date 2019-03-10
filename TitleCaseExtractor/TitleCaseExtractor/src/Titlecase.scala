object Titlecase {
def unapply(str: String) =
Some(str.split(" ").toList.map {
case "" => ""
case word => word.substring(0, 1).toUpperCase + word.substring(1)
}.mkString(" "))
}
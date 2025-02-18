```scala
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(value: Int): Future[Int] = Future {
    if (value == 0) throw new IllegalArgumentException("Value cannot be zero")
    value * 2
  }.recover {
    case e: IllegalArgumentException => 0 // Handle the exception appropriately
    case e: Exception => -1 // Handle other exceptions or log them for further investigation
  }
}
```
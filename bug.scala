```scala
import scala.concurrent.{ExecutionContext, Future}

class MyClass(implicit ec: ExecutionContext) {
  def myMethod(value: Int): Future[Int] = Future {
    if (value == 0) throw new IllegalArgumentException("Value cannot be zero")
    value * 2
  }
}
```
# Unhandled Exception in Scala Future

This repository demonstrates a common error in Scala involving unhandled exceptions within `Future` objects.  The `bug.scala` file shows code that throws an exception inside a `Future`.  The `bugSolution.scala` file provides a corrected version using proper exception handling.

This is a crucial point to understand for building robust asynchronous applications in Scala. Failure to properly manage exceptions can lead to silent failures and difficult-to-debug issues.
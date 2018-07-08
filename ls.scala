import java.io._
for (f <- new File(".").listFiles()) {
  println(f.getName())
}

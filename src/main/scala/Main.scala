import java.util.Scanner

object Main {
  val realizaCalculo : RealizaCalculo = new RealizaCalculo()

  def main(args: Array[String]): Unit = {
    val scanner: Scanner = new Scanner(System.in)

    println("Digite o primeiro valor")
    val valueOne: Int = scanner.nextInt()

    println("Qual ação executar")
    println("Somar(+)")
    println("Subtrair(-)")
    println("Multiplicar(*)")
    println("Dividir(/)")
    val action: String = scanner.next()

    println("Digite o segundo valor")
    val valueTwo: Int = scanner.nextInt()

    val response: Int = matchScala(action, valueOne, valueTwo)
    println(response)
  }

  def matchScala(action: String, valueOne: Int, valueTwo: Int): Int = action match {
    case "+" => realizaCalculo
      .calcular((valueOne, valueTwo) => valueOne + valueTwo, valueOne, valueTwo)
    case "-" => realizaCalculo
      .calcular((valueOne, valueTwo) => valueOne - valueTwo, valueOne, valueTwo)
    case "*" => realizaCalculo
      .calcular((valueOne, valueTwo) => valueOne * valueTwo, valueOne, valueTwo)
    case "/" => realizaCalculo
      .calcular((valueOne, valueTwo) => valueOne / valueTwo, valueOne, valueTwo)
    case _ => 0
  }

}

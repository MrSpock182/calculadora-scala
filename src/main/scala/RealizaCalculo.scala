class RealizaCalculo {
  def calcular(callback: (Int, Int) => Int, valueOne: Int, valueTwo: Int): Int = {
    callback(valueOne, valueTwo)
  }
}

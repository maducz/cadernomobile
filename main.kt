fun main() {
  println("Ola qual é seu nome?")
  var nome: String = readLine()!!
  println("Seja bem vindo")
  println(nome)
  println("Qual sua idade?")
  var idade: String = readLine()!!
  var idadeint: Int = 0 
  idadeint = idade.toInt()
  println("Sua idade é")
  println(idade)
}
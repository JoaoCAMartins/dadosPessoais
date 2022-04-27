class Retangulo(largura: Int, altura: Int) {
    var largura: Int = 0
    var altura : Int = 0

    init{
        this.largura = largura
        this.altura = altura
    }
    fun area()= largura *altura
    fun perimetro() = 2*(largura+altura)
}
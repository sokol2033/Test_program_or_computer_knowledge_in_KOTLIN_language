fun main(args: Array<String>) {
    var questions = arrayOf(
        "Что такое ПК? (1.Вычислительная машина 2.Не знаю 3.Пусковой комплекс)",
        "Что такое материнская плата(motherboard)? (1.Плата для вычислений 2.Главная плата компьютера)",
        "Что такое процессор(cpu)? (1.Главный вычислительный элемент ПК 2.Маловажная деталь 3.Микросхема)",
        "Что такое видеокарта(gpu)? (1.Устройство вывода графики 2.Главный вычислительный элемент 3.Устройство для игр)",
        "Что такое жесткий диск(hdd)? (1.Диск с большой жесткостью 2.Не знаю 3.Устройсво хранения информации)",
        //"Что такое ssd?",
        //"Что такое дисковод?",
        //"Что такое BIOS?",
        //"Зачем нужен блок питания?",
        //"Чем отличается HDD от SSD?",
    )
    var answers = arrayOf("0", "0", "0", "0", "0",)
    var trueanswers = arrayOf("1", "2", "1", "1", "3",)
    for (questionIndex in questions.indices) {
        print(questions[questionIndex] + " : ")
        var reply: String? = readLine()
        var reply1: Int? = reply?.toInt()
        //print(reply)

        if (reply1 == 1) {
            answers[questionIndex] = "1"
        }
        else {
            if (reply1 == 2) {
                answers[questionIndex] = "2"
            }
            else {
                if (reply1 == 3) {
                    answers[questionIndex] = "3"
                }
                else {
                    println("Такого ответа нет!")
                }
            }
        }
        if (trueanswers[questionIndex] == answers[questionIndex]) {
            println("Правильно!")
        }
        else {
            println("Не правильно!")
        }

    }
}
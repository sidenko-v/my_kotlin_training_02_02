//Вам нужно провести самостоятельный анализ (да-да, к этому нужно привыкать, не всегда вам дадут чёткую постановку задачи,
// достаточно часто вы будете получать задачу в формате «Сделай как в Вк») и написать небольшое приложение:
//В переменной likes хранится число лайков.

//Приложение выводит в консоль соответствующий вариант, вы сами должны их определить, в зависимости от того, что хранится в likes
//Итог: у вас должен быть репозиторий на GitHub, в котором расположен ваш Gradle-проект.


fun main() {
    val likes: Int = 253820
    val wordForNumberEndsWithOne = "человеку"
    val wordForNumberDoesNotEndWithOne = "людям"
    var word: String = ""


    if ((likes % 10 == 1 && likes % 100 != 11) {
        word = wordForNumberEndsWithOne
    } else {
        word = wordForNumberDoesNotEndWithOne
    }

    println(" Понравилось $likes $word")
}

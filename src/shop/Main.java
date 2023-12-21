//Промежуточная контрольная работа по блоку специализация
//        Урок 2. Магазин игрушек (Java)
//        Информация о проекте
//        Необходимо написать проект, для розыгрыша в магазине игрушек.
//        Функционал должен содержать добавление новых игрушек и задания веса для выпадения игрушек.
//
//        Как сдавать проект
//        Для сдачи проекта необходимо создать отдельный общедоступный репозиторий(Github, gitlub,
//        или Bitbucket). Разработку вести в этом репозитории, использовать пул реквесты на изменения.
//        Программа должна запускаться и работать, ошибок при выполнении программы быть не должно.
//        Программа, может использоваться в различных системах, поэтому необходимо разработать класс в виде конструктора
//
//        Напишите класс-конструктор у которого принимает минимум 3 строки, содержащие три поля id игрушки,
//        текстовое название и частоту выпадения игрушки
//
//        Из принятой строки id и частоты выпадения(веса) заполнить минимум три массива.
//
//        Используя API коллекцию: java.util.PriorityQueue добавить элементы в коллекцию
//
//        Организовать общую очередь
//
//        Вызвать Get 10 раз и записать результат в файл

package shop;

import toys.toy_raffle;

public class Main {
    public static void main(String[] args) {
        /**
         * Пример инициализации ToyRaffle с игрушками и их весами
         */
        String[] toyIds = {"toy1", "toy2", "toy3"};
        String[] toyNames = {"Игрушка 1", "Игрушка 2", "Игрушка 3"};
        int[] toyWeights = {1, 2, 3}; // Пример весов игрушек

        toy_raffle toyRaffle = new toy_raffle(toyIds, toyNames, toyWeights);

        /**
         * Выполняем розыгрыш игрушек
         */
        String winner = toyRaffle.drawToy();

        /**
         * Выводим результат розыгрыша
         */
        System.out.println("Выиграла игрушка с идентификатором: " + winner);
    }
}
package ru.oop.task2;
/**
 * Транспорт
 * */
public interface Transport extends Positioned{
    /**
     * движение транспорта
     * @param destination
     * */
    void drive(Position destination);

}


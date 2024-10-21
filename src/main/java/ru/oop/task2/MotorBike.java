package ru.oop.task2;

import com.sun.jdi.connect.Transport;
/**
 * вид транспорта
 * */
public class MotorBike implements Transport {
    /**
     * конструктор
     * @param person
     * */
    public MotorBike(Person person) {
    }

    @Override
    /**
     * Дойти до транспорта
     * @param person
     * */
    void moveToTransport(Person person){
    }

    @Override
    /**
     * движение транспорта
     * @param destination
     * */
    void drive(Position destination){
    }

}

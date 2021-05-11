package ru.netology.domain.constructor;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTestConstructor {
    RadioConstructor radio = new RadioConstructor();

    @Test
    public void shouldIncreaseStation() {
        radio.increaseCurrentStation();
        int actual = radio.getCurrentStation();
        assertEquals(1, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        radio.decreaseCurrentStation();
        int actual = radio.getCurrentStation();
        assertEquals(9, actual);
    }


    //

    @Test
    public void shouldPutStation() {
        RadioConstructor radio = new RadioConstructor(10, 0, 2, 0, 0, 0);
        radio.setCurrentStation(2);
        int actual = radio.getCurrentStation();
        assertEquals(2, actual);
    }

    @Test
    public void shouldIncreaseStationToMax() {
        radio.increaseCurrentStation(); // 0
        radio.increaseCurrentStation(); // 1
        radio.increaseCurrentStation(); // 2
        radio.increaseCurrentStation(); // 3
        radio.increaseCurrentStation(); // 4
        radio.increaseCurrentStation(); // 5
        radio.increaseCurrentStation(); // 6
        radio.increaseCurrentStation(); // 7
        radio.increaseCurrentStation(); // 8
        radio.increaseCurrentStation(); // 9

        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

    //Номер текущей радиостанции изменяется в пределах от 0 до 10

    @Test
    public void shouldIncreaseStationForMax() {
        RadioConstructor radio = new RadioConstructor(10, 0, 0, 0, 0, 0);
        radio.increaseCurrentStation(); // 0
        radio.increaseCurrentStation(); // 1
        radio.increaseCurrentStation(); // 2
        radio.increaseCurrentStation(); // 3
        radio.increaseCurrentStation(); // 4
        radio.increaseCurrentStation(); // 5
        radio.increaseCurrentStation(); // 6
        radio.increaseCurrentStation(); // 7
        radio.increaseCurrentStation(); // 8
        radio.increaseCurrentStation(); // 9
        radio.increaseCurrentStation(); // 10

        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }


    @Test
    public void shouldDecreaseStationToMin() {
        radio.decreaseCurrentStation(); // 0
        radio.decreaseCurrentStation(); // 9
        radio.decreaseCurrentStation(); // 8
        radio.decreaseCurrentStation(); // 7
        radio.decreaseCurrentStation(); // 6
        radio.decreaseCurrentStation(); // 5
        radio.decreaseCurrentStation(); // 4
        radio.decreaseCurrentStation(); // 3
        radio.decreaseCurrentStation(); // 2
        radio.decreaseCurrentStation(); // 1

        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }

//Номер текущей радиостанции изменяется в пределах от 10 до 0

    @Test
    public void shouldDecreaseStationForMin() {
        RadioConstructor radio = new RadioConstructor(10, 0, 0, 0, 0, 0);
        radio.decreaseCurrentStation(); // 0
        radio.decreaseCurrentStation(); // 10
        radio.decreaseCurrentStation(); // 9
        radio.decreaseCurrentStation(); // 8
        radio.decreaseCurrentStation(); // 7
        radio.decreaseCurrentStation(); // 6
        radio.decreaseCurrentStation(); // 5
        radio.decreaseCurrentStation(); // 4
        radio.decreaseCurrentStation(); // 3
        radio.decreaseCurrentStation(); // 2
        radio.decreaseCurrentStation(); // 1

        int actual = radio.getCurrentStation();
        assertEquals(0, actual);
    }



    /* Негативные тесты */

    @Test
    public void shouldRetrieveCurrentValue() {
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldRetrieveCurrentValue2() {
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldIncreaseVolume() {
        radio.increaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(6, actual);
    }

    // Уровень громкости звука достиг максимального значения
    @Test
    public void shouldIncreaseVolumeOverMaximum() {
        RadioConstructor radio = new RadioConstructor(0, 0, 0, 100, 0, 98);
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.decreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(4, actual);
    }

    //  Уровень громкости звука достиг минимального значения

    @Test
    public void shouldDecreaseVolumeUnderMinimum() {
        RadioConstructor radio = new RadioConstructor(0, 0, 0, 100, 0, 2);
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }


    @Test
    public void shouldIncreaseVolumeToMax() {
        radio.increaseCurrentVolume(); // 5~6
        radio.increaseCurrentVolume(); // 6-7
        radio.increaseCurrentVolume(); // 7-8
        radio.increaseCurrentVolume(); // 8-9
        radio.increaseCurrentVolume(); // 9-10
        radio.increaseCurrentVolume(); // 10-10
        radio.increaseCurrentVolume(); // 10-10


        int actual = radio.getCurrentVolume();
        assertEquals(10, actual);
    }

    // увеличивать уровень громкости звука

    @Test
    public void shouldIncreaseVolumeForMax() {
        RadioConstructor radio = new RadioConstructor(0, 0, 0, 100, 0, 95);
        radio.increaseCurrentVolume(); // 95~96
        radio.increaseCurrentVolume(); // 96-97
        radio.increaseCurrentVolume(); // 97-98
        radio.increaseCurrentVolume(); // 98-99
        radio.increaseCurrentVolume(); // 99-100
        radio.increaseCurrentVolume(); // 100-100
        radio.increaseCurrentVolume(); // 100-100


        int actual = radio.getCurrentVolume();
        assertEquals(100, actual);
    }


    @Test
    public void shouldDecreaseVolumeToMin() {
        radio.decreaseCurrentVolume(); // 5~4
        radio.decreaseCurrentVolume(); // 4~3
        radio.decreaseCurrentVolume(); // 3~2
        radio.decreaseCurrentVolume(); // 2~1
        radio.decreaseCurrentVolume(); // 1~0
        radio.decreaseCurrentVolume(); // 0~0
        radio.decreaseCurrentVolume(); // 0~0

        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }

    // уменьшать уровень громкости звука

    @Test
    public void shouldDecreaseVolumeForMin() {
        RadioConstructor radio = new RadioConstructor(0, 0, 0, 100, 0, 5);
        radio.decreaseCurrentVolume(); // 5~4
        radio.decreaseCurrentVolume(); // 4-3
        radio.decreaseCurrentVolume(); // 3-2
        radio.decreaseCurrentVolume(); // 2-1
        radio.decreaseCurrentVolume(); // 1-0
        radio.decreaseCurrentVolume(); // 0-0
        radio.decreaseCurrentVolume(); // 0-0


        int actual = radio.getCurrentVolume();
        assertEquals(0, actual);
    }



    /* Негативные тесты */


    @Test
    public void shouldRetrieveCurrentVolumeValue() {
        radio.setCurrentVolume(11);
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void shouldRetrieveCurrentVolumeValue2() {
        radio.setCurrentVolume(-1);
        assertEquals(5, radio.getCurrentVolume());
    }


}




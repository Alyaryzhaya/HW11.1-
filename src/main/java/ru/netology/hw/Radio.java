package ru.netology.hw;

public class Radio {

    private int stationNumber;
    private int volume;

    public int getStationNumber() {
        return stationNumber;
    }

    // 1. Номер текущей радиостанции может принимать значения только в пределах от 0 до 9
    // 4. Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера
    // (для этого подойдёт один метод-сеттер с проверкой на допустимость номера станции)
    public void setStationNumber(int newStationNumber) {

        if (newStationNumber < 0) {
            return;
        }
        if (newStationNumber > 9) {
            return;
        }
        stationNumber = newStationNumber;
    }

    // 2. Если текущая радиостанция - 9 и клиент нажал на кнопку next на пульте, то текущей должна стать 0-ая;
    // в остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.
    public void nextStationNumber() {

        if (stationNumber == 9) {
            stationNumber = 0;
            // if (stationNumber >= 0 && stationNumber < 9) {
        } else {
            stationNumber++;
        }
    }

    // 3. Если текущая радиостанция - 0 и клиент нажал на кнопку prev  на пульте, то текущей должна стать 9-ая;
    // в остальных случаях радиопереключается просто на предыдущую станцию.

    public void prevStationNumber() {

        if (stationNumber == 0) {
            stationNumber = 9;
        } else {
            stationNumber--;
        }
    }
    //======================================================================================================================================
    //  1. Клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука (в пределах от 0 до 10)

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            newVolume = 10;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    // 2.Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на +
    //не должно ни к чему приводить
    public void nextUntilMax() {
        if (volume < 10) {
            volume++;
        } else {
            volume = 10;
        }
    }

    // 3. Если уровень громкости звука достиг минимального значения, то дальнейшее нажатие на -
    //  не должно ни к чему приводить
    public void prevUntilMin() {
        if (volume == 0) {
            volume = 0;
        } else {
            volume--;
        }
    }
}


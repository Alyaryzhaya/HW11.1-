package ru.netology.hw;

public class Radio {


    private int volume;
    private int stationQuantity = 10;  // количество радиостанций
    private int currentStatQuantity = stationQuantity;
    private int maxStationNumber = stationQuantity - 1;
    private int stationNumber;
    private int currentStatNumber;


    // КОНСТРУКТОРЫ
    public Radio(int stationQuantity) {
        this.currentStatQuantity = stationQuantity;
        this.maxStationNumber = stationQuantity - 1;
    }

    public Radio() {
    }

    //===========================================================================

    public int getStationQuantity() {  // количество станций
        return currentStatQuantity;
    }

    public int getStationNumber() { // номер станции
        return currentStatNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    //===============================================================================


    //2. Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций
    // не включительно. То есть если станций 10, то номер последней — 9.

    public void setStationNumberNew(int newCurrentStatNumber) {

        if (newCurrentStatNumber < 0) {
            return;
        }
        if (newCurrentStatNumber >= currentStatQuantity) {
            return;
        }
        this.currentStatNumber = newCurrentStatNumber;
    }


    // 3. Если текущая радиостанция — максимальная, и клиент нажал на кнопку next, следующая, на пульте, то текущей должна стать нулевая.
    public void nextStationNumber() {


        if (currentStatNumber < maxStationNumber) {
            currentStatNumber++;
        }else{
            currentStatNumber = 0;
        }
        stationNumber = currentStatNumber;

    }


    // 4. Если текущая радиостанция — 0, и клиент нажал на кнопку prev, предыдущая, на пульте, то текущей должна стать максимальная.


    public void prevStationNumber() {

        if (currentStatNumber == 0) {
            currentStatNumber = maxStationNumber;

        } else {
            currentStatNumber--;
        }

        stationNumber = currentStatNumber;
    }


//======================================================================================================================================

    // 1. клиент должен иметь возможность увеличивать и уменьшать уровень громкости звука в пределах от 0 до 100;

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            newVolume = 100;
        }
        volume = newVolume;
    }

    public int getVolume() {
        return volume;
    }

    // 2.Если уровень громкости звука достиг максимального значения, то дальнейшее нажатие на +
    //не должно ни к чему приводить
    public void nextUntilMax() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
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


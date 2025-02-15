package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLessMinStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-4);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMoreMaxStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBoundaryStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set2BoundaryStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set3BoundaryStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set4BoundaryStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set5BoundaryStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set6BoundaryStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(58);

        int expected = 58;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setLessMinVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-43);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setMoreMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(119);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setBoundaryVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set2BoundaryVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set3BoundaryVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set4BoundaryVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set5BoundaryVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void set6BoundaryVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.next();

        int expected = 2;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);

        radio.next();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(2);

        radio.prev();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeUp() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeUp2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeUp();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUp4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.volumeUp();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.volumeDown();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeDown4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);

        radio.volumeDown();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStationNew() {
        Radio radio = new Radio(20);

        radio.setCurrentRadioStation(18);

        int expected = 18;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStationNew() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(19);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationNew() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 19;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }
}

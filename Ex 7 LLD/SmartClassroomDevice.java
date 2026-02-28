// Power capability
interface PowerControllable {
    void powerOn();
    void powerOff();
}

// Brightness capability
interface BrightnessAdjustable {
    void setBrightness(int pct);
}

// Temperature capability
interface TemperatureAdjustable {
    void setTemperatureC(int c);
}

// Attendance capability
interface AttendanceScannable {
    int scanAttendance();
}

// Input capability
interface InputConnectable {
    void connectInput(String port);
}
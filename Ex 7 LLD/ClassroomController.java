public class ClassroomController {

    private final DeviceRegistry registry;

    public ClassroomController(DeviceRegistry registry) {
        this.registry = registry;
    }

    public void startClass() {

        PowerControllable projectorPower = registry.getDevice(PowerControllable.class);
        InputConnectable projectorInput = registry.getDevice(InputConnectable.class);
        BrightnessAdjustable lights = registry.getDevice(BrightnessAdjustable.class);
        TemperatureAdjustable ac = registry.getDevice(TemperatureAdjustable.class);
        AttendanceScannable scanner = registry.getDevice(AttendanceScannable.class);

        projectorPower.powerOn();
        projectorInput.connectInput("HDMI-1");

        lights.setBrightness(60);
        ac.setTemperatureC(24);

        int present = scanner.scanAttendance();
        System.out.println("Attendance scanned: present=" + present);
    }

    public void endClass() {

        System.out.println("Shutdown sequence:");

        registry.getDevice(Projector.class).powerOff();
        registry.getDevice(LightsPanel.class).powerOff();
        registry.getDevice(AirConditioner.class).powerOff();
    }
}
package org.surfing.service.serial;

import org.surfing.device.SerialDevice;
import gnu.io.CommPortIdentifier;

/**
 *
 * @author vsenger
 */
public class ZigBeeDevice extends SerialDevice {

    public ZigBeeDevice(CommPortIdentifier portId, int baudRate) {
        super(portId, baudRate);
    }

}

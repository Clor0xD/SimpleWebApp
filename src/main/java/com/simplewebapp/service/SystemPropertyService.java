package com.simplewebapp.service;

import com.simplewebapp.model.SystemPropertyModel;
import org.springframework.stereotype.Service;

import java.net.UnknownHostException;
import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by Clor on 02.07.2019.
 * ©XCodersTeam, 2019
 */
@Service
public class SystemPropertyService {
    public SystemPropertyModel getSystemPropertyModel() {

        String pcName = "error get pcName";
        double toMegaByte = 1024 * 1024;
        try {
            pcName = java.net.InetAddress.getLocalHost().getCanonicalHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return new SystemPropertyModel(
                DateFormat.getDateTimeInstance().format(Calendar.getInstance().getTime()),
                pcName,
                String.format("%.3f", Runtime.getRuntime().freeMemory() / toMegaByte),
                String.format("%.3f", Runtime.getRuntime().totalMemory() / toMegaByte));
    }
}

package org.erdc.cobie.graphics.filewriter;

import java.io.IOException;

import org.erdc.cobie.graphics.SettingsUser;
import org.erdc.cobie.graphics.settings.GlobalSettings;
import org.erdc.cobie.shared.Zipper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class FileWriter implements SettingsUser
{
    private final GlobalSettings settings;
    
    protected FileWriter(GlobalSettings settings)
    {
        this.settings = settings;
    }

    @Override
    public final Logger getLogger()
    {
        return LoggerFactory.getLogger(getClass());
    }

    @Override
    public final GlobalSettings getSettings()
    {
        return settings;
    }

    public abstract void write() throws IOException;
    public abstract void write(Zipper zipper) throws IOException;
}

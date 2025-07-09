package com.mobslocator;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import com.mobslocator.MobsLocatorPlugin;

public class MOBsLocatorPluginTest
{
    public static void main(String[] args) throws Exception
    {
        ExternalPluginManager.loadBuiltin(MobsLocatorPlugin.class);
        RuneLite.main(args);
    }
}

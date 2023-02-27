package com.moaningjewelry;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class MoaningJewelryTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(MoaningJewelryPlugin.class);
		RuneLite.main(args);
	}
}
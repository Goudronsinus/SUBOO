package factory;

import itf.IVersion;

public class VersionFactory {
	public static IVersion getInstance() {
		return version.Version.getInstanceIVersion();
	}
}

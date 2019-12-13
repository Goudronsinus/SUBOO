package version;

import itf.IRessource;
import itf.IUnite;
import itf.IVersion;

public class TestVersion {
	public static void main(String [] args) {
		IVersion v = factory.VersionFactory.getInstance();
		for(IUnite u : v.getUnites()) {
			System.out.println(u.getNom());			
		}
		for(IRessource r : v.getRessources()) {
			System.out.println(r.getRessourceName());
		}
	}
}

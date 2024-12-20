package org.irods.jargon.core.protovalues;

import org.junit.Assert;
import org.junit.Test;

public class FilePermissionEnumTest {

	@Test
	public void testEnumValueFromSpecificQueryTextPermission() {
		Assert.assertEquals(FilePermissionEnum.OWN, FilePermissionEnum.enumValueFromSpecificQueryTextPermission("own"));
		Assert.assertEquals(FilePermissionEnum.READ_OBJECT,
				FilePermissionEnum.enumValueFromSpecificQueryTextPermission("read"));
		Assert.assertEquals(FilePermissionEnum.MODIFY_OBJECT,
				FilePermissionEnum.enumValueFromSpecificQueryTextPermission("write"));
		Assert.assertEquals(FilePermissionEnum.NONE,
				FilePermissionEnum.enumValueFromSpecificQueryTextPermission("none"));

	}

}

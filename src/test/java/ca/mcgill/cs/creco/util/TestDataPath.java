/**
 * Copyright 2014 McGill University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ca.mcgill.cs.creco.util;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.lang.reflect.Field;

import org.junit.Test;

public class TestDataPath
{
	@Test
	public void windowsPath() throws Exception
	{
		// Reflectively reset the constant to be able to test 
		// in an environment-independent manner.
		Field pointer = DataPath.class.getDeclaredField("POINTER");
		pointer.setAccessible(true);
		pointer.set(null, "src/test/java/ca/mcgill/cs/creco/util/.localdatapath1");
		String path = DataPath.get();
		assertEquals("C:\\temp\\data" + File.separator,DataPath.get());

	}
}

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
package ca.mcgill.cs.creco.businesslogic.model;

/**
 * This class corresponds to a filter which is a  constraint on the set of 
 * product features or ratings. A BLProductFilterList provides a way to combine 
 * these constraints in order to have more elaborate filtering capability.
 * 
 * @see BLProductFilterList
 */
public class BLProductFilter
{
	
	private BLProductAttribute attribute;
	private String range;
	
	
}
